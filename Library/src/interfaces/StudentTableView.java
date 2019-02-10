package interfaces;

import managers.StudentManager;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import models.Student;

/**
 * @author Rubze
 */

public class StudentTableView extends AbstractTableModel{
    
    private final int columnCount;
    private final int rowCount;
    private final StudentManager studentsBusiness;
    
    public StudentTableView(StudentManager studentsBusiness) throws SQLException{
        this.studentsBusiness = studentsBusiness;
        columnCount = studentsBusiness.getColumnCount();
        rowCount = studentsBusiness.getRowCount();        
    }
    
    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try{
            studentsBusiness.setCurrentStudent(rowIndex+1, null);
            Student student = studentsBusiness.getStudent();
            switch (columnIndex+1){           
                case 1: return student.getId();
                case 2: return student.getDni();
                case 3: return student.getName();
                case 4: return student.getSurname1();
                case 5: return student.getSurname2();
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
}
