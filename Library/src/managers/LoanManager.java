package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Loan;

/**
 * @author Rubzer
 */

public final class LoanManager extends MasterManager{
    
 
    private Loan loan;

    public LoanManager(Connection connection) throws SQLException{
        super(connection);
        loan = null;
        tableName = "prestamos";
        setDefaultStatement();
        setTableContent();
        setFirstResultSet();
    }
    
    private ArrayList<Object> getDataList() throws SQLException{
        ArrayList<Object> data = new ArrayList<>();
        data.add(loan.getStudentCod());
        data.add(loan.getBookCod());
        data.add(loan.getLoanDate());
        data.add(loan.getRefundDate());
        data.add(loan.getStatus());
        return data;
    }
    
    @Override
    public void Insert() throws SQLException{
            sql = "insert into prestamos (`Cod Alumno`, `Cod Libro`"
                    + ", `Fecha Prestamo`, `Fecha Devolucion`, `Estado`) "
                + "values (?,?,?,?,?)";
            setStatements(sql, getDataList());
    }
    
    @Override
    public void Update() throws SQLException{
        sql = "update prestamos set `Cod Alumno` = ?, `Cod Libro` = ?"
                + ", `Fecha Prestamo` = ?, `Fecha Devolucion` = ?, `Estado` = ?"
                + " where Id = ?";
        
        setStatements(sql, getDataList());
    }
    
    @Override
    public void Delete() throws SQLException{
        sql="delete from libros where Codigo=?";
        setStatements(sql, (int) getDataList().get(0));
    }
    
    @Override
    public void Query() throws SQLException{
        resultSet = preparedStatement.executeQuery();
    }
    
    public void setCurrentLoan(int row, int id) throws SQLException{
        loan = new Loan();
        if(row!=-1){
            resultSet.absolute(row);
            loan.setId(resultSet.getInt("Id"));
        }
        else{loan.setId(resultSet.getInt("Id"));}
        setLoanGeneralData();
        setDefaultStatement();
    }
    
    private void setLoanGeneralData() throws SQLException{
        loan.setId(resultSet.getInt("Id"));
        loan.setStudentCod(resultSet.getString("Cod Alumno"));
        loan.setBookCod(resultSet.getString("Cod Libro"));
        loan.setLoanDate(resultSet.getDate("Fecha Prestamo"));
        loan.setRefundDate(resultSet.getDate("Fecha Devolucion"));
        loan.setStatus(resultSet.getString("Estado"));
    }
            
    public void searchById(String search){
        try{
            sql = sql+" where `Id` like '"+search+"%';";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            resultSetMetaData = resultSet.getMetaData();
            setDefaultStatement();
        }
        catch(SQLException e){System.out.println(e);}
    }
                
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    public Loan getLoan(){
        return loan;
    }
}