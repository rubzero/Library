package controllers;

import managers.StudentManager;
import dialogs.StudentDialog;
import interfaces.StudentTableView;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import models.Student;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.table.TableColumn;

/**
 * @author Rubzer
 */

public class StudentController extends MasterController {

    private StudentDialog studentDialog = null;
    private StudentManager studentBusiness = null;
    private JFrame parent = null;
    
    private LoanController loanController;
    
    public StudentController(Connection connection, JFrame parent) 
            throws SQLException{
        studentBusiness = new StudentManager(connection);
        this.parent = parent;
    }
    
    public void createStudentDialog() throws SQLException{
        studentDialog = new StudentDialog(parent, true);
        createStudentTable();
        createStudentListeners();
    }
    
    private void createStudentTable() throws SQLException{
        studentDialog.getTbStudents()
                .setModel(new StudentTableView(studentBusiness));
        studentDialog.getTbStudents().addMouseListener(this);
        setStudentTableTitles();
    }
    
    private void setStudentTableTitles() throws SQLException{
        for(int i=0; i<studentDialog.getTbStudents().getColumnCount(); i++){
            TableColumn col = studentDialog.getTbStudents()
                .getTableHeader().getColumnModel().getColumn(i);
            col.setHeaderValue(studentBusiness.getFieldNameList().get(i));
        }
    }
    
    private void createStudentListeners(){
        studentDialog.getBtnExit().addActionListener(this);
        studentDialog.getBtnAccept().addActionListener(this);
        studentDialog.getBtnSelect().addActionListener(this);
        studentDialog.getTxtBrowser().getDocument().addDocumentListener(this);
        studentDialog.getCmbStudent().addActionListener(this);
        studentDialog.getCmbBrowser().addActionListener(this);
        studentDialog.getBtnSelect().addActionListener(this);
    }
    
    private void showData(int fila) throws SQLException {
        String id = studentDialog.getValueAtPos(fila, 0);
        
        studentBusiness.setCurrentStudent(-1, id);
        Student student = studentBusiness.getStudent();
        
        studentDialog.getTxtId().setText(student.getId());
        studentDialog.getTxtDni().setText(student.getDni());
        studentDialog.getTxtNombre().setText(student.getName());
        studentDialog.getTxtApellido1().setText(student.getSurname1());
        studentDialog.getTxtApellido2().setText(student.getSurname2());
    }
    
    public Student getCurrentStudent(){
        return new Student(studentDialog.getTxtId().getText()
                , studentDialog.getTxtDni().getText()
                , studentDialog.getTxtNombre().getText()
                , studentDialog.getTxtApellido1().getText()
                , studentDialog.getTxtApellido2().getText());
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        studentBusiness.setStudent(getCurrentStudent());
        try{  
            if(e.getSource().equals(studentDialog.getBtnExit()))
                studentDialog.dispose();

            else if(e.getSource().equals(studentDialog.getCmbStudent())){
                actionComboStudent();
            }
            
            else if(e.getSource().equals(studentDialog.getCmbBrowser())){
                renewTable();
                refreshSearch();
            }
            
            else if (e.getSource().equals(studentDialog.getBtnAccept())){
                actionAccept();
                renewTable();
                clearFields();
            }
            else if(e.getSource().equals(studentDialog.getBtnSelect())){
                actionSelect();
            }
        }
        catch(SQLException sqle){System.out.println(sqle.toString());}
    }
    
    private void actionComboStudent() throws SQLException{
        String action = studentDialog
            .selectedItemToString(studentDialog.getCmbStudent());
        studentDialog.setFieldsEditable(!(action).equals("Baja"));    

        if(action.equals("Alta")) studentDialog.clearFields();
        else if(!studentDialog.nullRow())
            showData(studentDialog.selectedRow());
    }
    
    private void actionAccept() throws SQLException{
        switch(studentDialog
            .selectedItemToString(studentDialog.getCmbStudent())){
                case "Alta" : 
                    if(getCurrentStudent().getDni() != null)
                        studentBusiness.Insert(); break;
                case "Baja" : studentBusiness.Delete(); break;
                case "Modificar" : studentBusiness.Update(); break;
            }
    }
    
    private void renewTable() throws SQLException{
        studentBusiness.setTableContent(); 
        studentDialog.getTbStudents()
            .setModel(new StudentTableView(studentBusiness));
    }
    
    private void actionSelect(){
        if(getCurrentStudent() != null 
            && !getCurrentStudent().getDni().equals("")){
                loanController.addStudentToList(getCurrentStudent());
        studentDialog.dispose();
        }
    }
    
    private void clearFields(){
        if(studentBusiness.getResult() && 
            !studentDialog.selectedItemToString(studentDialog
                .getCmbStudent()).equals("Modificar")){
                    studentDialog.clearFields();
            }
        studentDialog.showDialog(studentBusiness.getResult());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try{
            if(studentDialog.selectedRow() != -1 && 
                (!studentDialog.getCmbStudent().getSelectedItem().equals("Alta")
                    || !studentDialog.getCmbStudent().isEnabled()))
            showData(studentDialog.selectedRow());
        }
        catch(SQLException ex){System.out.println(ex);}
    } 
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        refreshSearch();
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
        refreshSearch();
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
        refreshSearch();
    }
    
    public void refreshSearch(){
        try{
            String search = studentDialog.getTxtBrowser().getText();
            studentBusiness.searchByString(search, studentDialog
                    .selectedItemToString(studentDialog.getCmbBrowser())); 
            studentDialog.getTbStudents()
                    .setModel(new StudentTableView(studentBusiness));
            setStudentTableTitles();
        }
        catch(SQLException ex){System.out.println(ex);}
    }
    
    public StudentDialog getStudentDialog() {
        return studentDialog;
    }

    public LoanController getLoanController() {
        return loanController;
    }

    public void setLoanController(LoanController loanController) {
        this.loanController = loanController;
    }

}
