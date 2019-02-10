package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Student;

/**
 * @author Rubzer
 */

public final class StudentManager extends MasterManager {
    
    private Student student;

    public StudentManager(Connection connection) throws SQLException{
        super(connection);
        student = null;
        tableName = "alumnos";
        setDefaultStatement();
        setTableContent();
        setFirstResultSet();
    }
    
    private ArrayList<Object> getDataList(int id) throws SQLException{
        ArrayList<Object> data = new ArrayList<>();
        data.add(student.getDni());
        data.add(student.getName());
        data.add(student.getSurname1());
        data.add(student.getSurname2());
        if(id!=0)
            data.add(student.getId());
        return data;
    }
                
    @Override
    public void Insert() throws SQLException{
        sql = "insert into alumnos (Dni, Nombre, `Apellido 1`, `Apellido 2`) "
            + "values (?,?,?,?)";
        setStatements(sql, getDataList(0));
    }
    
    @Override
    public void Update() throws SQLException{
        sql = "update alumnos set Dni = ?, Nombre = ?, `Apellido 1` = ?"
                + ", `Apellido 2` = ? where Id = ?";
        
        setStatements(sql, getDataList(1));
    }
    
    @Override
    public void Delete() throws SQLException{
        sql="delete from alumnos where Id=?";
        setStatements(sql, Integer.parseInt((String) getDataList(1).get(4)));
    }
    
    @Override
    public void Query() throws SQLException{
        resultSet = preparedStatement.executeQuery();
    }
    
    public void setCurrentStudent(int row, String id) throws SQLException{
        student = new Student();
        if(row!=-1){
            resultSet.absolute(row);
            student.setId(resultSet.getString("Id"));
        }
        else{student.setId(resultSet.getString("Id"));}
        setStudentGeneralData();
        setDefaultStatement();
    }
    
    private void setStudentGeneralData() throws SQLException{
        
        student.setId(resultSet.getString("Id"));
        student.setDni(resultSet.getString("Dni"));        
        student.setName(resultSet.getString("Nombre"));
        student.setSurname1(resultSet.getString("Apellido 1"));
        student.setSurname2(resultSet.getString("Apellido 2"));
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    
    public Student getStudent(){
        return student;
    }
}

