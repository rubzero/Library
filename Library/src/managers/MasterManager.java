package managers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Rubzer
 */
public abstract class MasterManager implements interfaces.BusinessInterface{
    
    protected Connection connection;
    protected ResultSet resultSet;
    protected PreparedStatement preparedStatement;
    protected ResultSetMetaData resultSetMetaData;
    protected String sql;
    protected boolean result;
    protected String tableName;
    
    public MasterManager(Connection connection) throws SQLException{
        this.connection = connection;
    }
    
    public ArrayList<String> getFieldNameList(int col
            , ResultSetMetaData resultSetMetaData) throws SQLException{
        ArrayList<String> fieldNameList = new ArrayList<>();
        for(int i=1; i<=col; i++)
            fieldNameList.add(resultSetMetaData.getColumnName(i));
        
        return fieldNameList;
    }
    
    public ResultSet getResultSet() {
        return resultSet;
    }

    public ResultSetMetaData getResultSetMetaData() {
        return resultSetMetaData;
    }
    
    public boolean getResult(){
        return result;
    }
    
    public void setTableContent() throws SQLException{
        resultSet = preparedStatement.executeQuery();
        resultSetMetaData = resultSet.getMetaData();
    }
    
    protected void setDefaultStatement()throws SQLException{
        sql="select * from "+tableName;
        preparedStatement = connection.prepareStatement(sql);
    }
    
    public int getRowCount() throws SQLException{
        resultSet.last();
        return resultSet.getRow();
    }
    
    public int getColumnCount() throws SQLException{
        return resultSetMetaData.getColumnCount();
    }
    
    protected void setFirstResultSet() throws SQLException{
        resultSet = preparedStatement.executeQuery();
    }
    
    public void searchByString(String search, String field){
        try{
            sql += " where `"+field+"` like '"+search+"%';";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            setDefaultStatement();
        }
        catch(SQLException e){System.out.println(e);}
    }
    
    public ArrayList<String> getFieldNameList() throws SQLException{
        return getFieldNameList(getColumnCount(), resultSetMetaData);
    }
    
    protected void setStatements(String sql, ArrayList<Object> data) throws SQLException{
        preparedStatement = connection.prepareStatement(sql);
        for(int i=0; i<data.size(); i++){
            if(data.get(i) instanceof Integer){
                preparedStatement.setInt(i+1, (int) data.get(i));
            }
            else if(data.get(i) instanceof String){
                preparedStatement.setString(i+1, (String) data.get(i));
            }
            else if(data.get(i) instanceof Date){
                preparedStatement.setDate(i+1, (Date) data.get(i));
            }
        }
        result = preparedStatement.executeUpdate() == 1;
        setDefaultStatement();
    }
    
    protected void setStatements(String sql, int id) throws SQLException{
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        result = preparedStatement.executeUpdate() == 1;
        setDefaultStatement();
    }
    
    public Date getDateFromString(String d){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.sql.Date sqlDate = null;
        
        try{
            date = sdf.parse(d);
            sqlDate = new java.sql.Date(date.getTime());
        }
        catch(ParseException e){System.out.println(e.toString());}
        return sqlDate;
    }
    
    public String getStringFromDate(Date d){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(d);
    }
    
    @Override
    public void Query() throws SQLException{
        resultSet = preparedStatement.executeQuery();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
