package controllers;

import managers.LoanManager;
import dialogs.LoanDialog;
import interfaces.LoanTableView;
import interfaces.PlainTableView;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.table.TableColumn;
import models.Book;
import models.Loan;
import models.Student;

/**
 * @author Rubzer
 */

public class LoanController extends MasterController{
    
    private LoanDialog loanDialog = null;
    private LoanManager loanBusiness = null;
    private JFrame parent = null;
    
    private ArrayList<Student> studentList;
    private ArrayList<Book> bookList;
    
    private ArrayList<String[]> studentParamList, bookParamList;
    
    private final StudentController studentController;
    private final BookController bookController;
    
    private final String[] studentTitles = {"Id","Dni","Nombre","Apellido 1"
            ,"Apellido 2"};
    private final String[] bookTitles = {"Codigo","Titulo","Autor","Editorial"
            ,"Asignatura","Estado"};
    
    public LoanController(Connection connection, JFrame parent
            , StudentController studentController
            , BookController bookController)
            throws SQLException{
        loanBusiness = new LoanManager(connection);
        this.parent = parent;
        this.studentController = studentController;
        this.bookController = bookController;
    }
    
    public void createLoanDialog() throws SQLException{
        loanDialog = new LoanDialog(parent, true);
        createLoanTable();
        createLoanListeners();
        createLists();
        loadStudentTable();
        loadBookTable();
    }
    
    private void createLists(){
        studentList = new ArrayList<>();
        bookList = new ArrayList<>();
        studentParamList = new ArrayList<>();
        bookParamList = new ArrayList<>();
    }
    
    public void addStudentToList(Student student){
        if(!listContainsStudent(student, studentList)){
            studentList.add(student);
            studentParamList.add(student.getParamArray());
            loadStudentTable();
        }
    }
    
    public void addBookToList(Book book){
        if(!listContainsBook(book, bookList)){
            bookList.add(book);
            bookParamList.add(book.getParamArray());
            loadBookTable();
        }
    }
    
    private void removeStudentFromList(int pos){
        studentList.remove(pos);
        studentParamList.remove(pos);
        loadStudentTable();
    }
    
    private void removeBookFromList(int pos){
        bookList.remove(pos);
        bookParamList.remove(pos);
        loadBookTable();
    }
    
    public void loadStudentTable(){
        loanDialog.getTbLoansStudent()
                .setModel(new PlainTableView(studentTitles, studentParamList));
    }
    
    public void loadBookTable(){
        loanDialog.getTbLoansBooks()
                .setModel(new PlainTableView(bookTitles, bookParamList));
    }

    private void createLoanTable() throws SQLException{
        loanDialog.getTbLoans()
                .setModel(new LoanTableView(loanBusiness));
        loanDialog.getTbLoans().addMouseListener(this);
        setLoanTableTitles();
    }
    
    private void setLoanTableTitles() throws SQLException{
        for(int i=0; i<loanDialog.getTbLoans().getColumnCount(); i++){
            TableColumn col = loanDialog.getTbLoans()
                .getTableHeader().getColumnModel().getColumn(i);
            col.setHeaderValue(loanBusiness.getFieldNameList().get(i));
        }
    }
    
    private void createLoanListeners(){
        loanDialog.getBtnAddBook().addActionListener(this);
        loanDialog.getBtnAddStudent().addActionListener(this);
        loanDialog.getBtnExit().addActionListener(this);
        loanDialog.getTxtBrowser().getDocument().addDocumentListener(this);
        loanDialog.getBtnRemoveStudent().addActionListener(this);
        loanDialog.getBtnRemoveBook().addActionListener(this);
        loanDialog.getBtnSubmit().addActionListener(this);
    }
        
    private void processLoan(){
        loanProcedureLoop();
        try{
            createLists();
            loadStudentTable();
            loadBookTable();
            createLoanTable();
            
        }
        catch(SQLException e){System.out.println(e);}   
    }
    
    private void loanProcedureLoop(){
        Loan loan = null;
        int c = 0;
        boolean success = false;
        for(int i=0; i<studentList.size(); i++){
            Student student = studentList.get(i);
            for(int j=0; j<bookList.size(); j++){
                Book book = bookList.get(j);
                
                createNewLoan(loan, student, book);
                try{
                    loanBusiness.Insert();
                    success = loanBusiness.getResult();
                    c++;
                }
                catch(SQLException e){System.out.println(e);}
            }
        }
        loanDialog.showDialog(success, c);
    }
    
    private void createNewLoan(Loan loan, Student student, Book book){
        loan = new Loan(student.getId(), book.getCode()+""
            , getDateFromString(getCurrentDate())
            , getDateFromString(getPlusMonthDate())
            , book.getStatus());
        loanBusiness.setLoan(loan);
    }
        
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(loanDialog.getBtnExit()))
            loanDialog.dispose();        
        
        else if(e.getSource().equals(loanDialog.getBtnAddStudent())){
            openStudentDialog();
        }        
        
        else if(e.getSource().equals(loanDialog.getBtnAddBook())){
            openBookDialog();
        }
        
        else if(e.getSource().equals(loanDialog.getBtnRemoveStudent())){
            actionRemoveStudent();
        }
        
        else if(e.getSource().equals(loanDialog.getBtnRemoveBook())){
            actionRemoveBook();
        }
        
        else if(e.getSource().equals(loanDialog.getBtnSubmit())){
            processLoan();
        }
    }
    
    private void openStudentDialog(){
        studentController.getStudentDialog().setOpener("loan");
        studentController.getStudentDialog().setDialogVisual();
        studentController.setVisible(studentController.getStudentDialog());
    }
    
    private void openBookDialog(){
        bookController.getBookDialog().setOpener("loan");
        bookController.getBookDialog().setDialogVisual();
        bookController.setVisible(bookController.getBookDialog());
    }
    
    private void actionRemoveStudent(){
        if(loanDialog.getTbLoansStudent().getSelectedRow() != -1){
            Student student = getStudentByDni((String)loanDialog
                .getTbLoansStudent().getValueAt(loanDialog
                    .getTbLoansStudent().getSelectedRow(), 1), studentList);
            if(student != null)
                removeStudentFromList(getStudentPosition(student.getDni()
                    , studentList));
        }
    }
    
    private void actionRemoveBook(){
        if(loanDialog.getTbLoansBooks().getSelectedRow()!=-1){
            Book book = getBookByCode(Integer.parseInt((String)loanDialog
                .getTbLoansBooks().getValueAt(loanDialog.getTbLoansBooks()
                    .getSelectedRow(), 0)),bookList);
            if(book != null)
                removeBookFromList(getBookPosition(book.getCode()
                    , bookList));
        }
    }
    
    public LoanDialog getLoanDialog() {
        return loanDialog;
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
            String search = loanDialog.getTxtBrowser().getText();
            loanBusiness.searchById(search); 
            loanDialog.getTbLoans()
                    .setModel(new LoanTableView(loanBusiness));
            setLoanTableTitles();
        }
        catch(SQLException ex){System.out.println(ex);}
    }                                                           
    
    
}
