package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Book;

/**
 * @author Rubzer
 */

public final class BookManager extends MasterManager{
    
    private Book book;
    
    public BookManager(Connection connection) throws SQLException{
        super(connection);
        book = null;
        tableName = "libros";
        setDefaultStatement();
        setTableContent();
        setFirstResultSet();
    }
    
    private ArrayList<Object> getDataList(int id) throws SQLException{
        ArrayList<Object> data = new ArrayList<>();
        data.add(book.getTitle());
        data.add(book.getAuthor());
        data.add(book.getEditorial());
        data.add(book.getSubject());
        data.add(book.getStatus());
        if(id!=0)
            data.add(book.getCode());
        return data;
    }   
                
    @Override
    public void Insert() throws SQLException{
        sql = "insert into libros (Titulo, Autor, Editorial,"
                + "Asignatura, Estado) values (?,?,?,?,?)";
        ArrayList<Object> data = getDataList(0);
        if(!data.get(0).equals(""))
            setStatements(sql, getDataList(0));
    }
        
    @Override
    public void Update() throws SQLException{
        sql = "update libros set Titulo = ?, Autor = ?, Editorial = ?"
                + ", Asignatura = ?, Estado = ? where Codigo= ?";
        setStatements(sql, getDataList(1));
    }
    
    @Override
    public void Delete() throws SQLException{
        sql="delete from libros where Codigo=?";
        setStatements(sql, (int) getDataList(1).get(5));
    }
    
    public void setCurrentBook(int row, int code) throws SQLException{
        book = new Book();
        if(row!=-1){
            resultSet.absolute(row);
            book.setCode(resultSet.getInt("Codigo"));
        }
        else{book.setCode(resultSet.getInt("Codigo"));}
        setBookGeneralData();
        setDefaultStatement();
    }
    
    private void setBookGeneralData() throws SQLException{
        book.setCode(resultSet.getInt("Codigo")); 
        book.setTitle(resultSet.getString("Titulo"));        
        book.setAuthor(resultSet.getString("Autor"));
        book.setEditorial(resultSet.getString("Editorial"));
        book.setSubject(resultSet.getString("Asignatura"));
        book.setStatus(resultSet.getString("Estado"));
    }
    

    public void setBook(Book book) {
        this.book = book;
    }

    
    public Book getBook(){
        return book;
    }
}