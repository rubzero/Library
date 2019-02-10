package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.Book;
import models.Student;

/**
 * @author Rubzer
 */
public abstract class MasterController 
        implements ActionListener, MouseListener, DocumentListener{
    
    void setVisible(JDialog dialog){
        dialog.setVisible(true);
    }
    
    void setHidden(JDialog dialog){
        dialog.setVisible(true);
    }
    
    protected boolean listContainsStudent(Student student
            , ArrayList<Student> studentList){
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getDni().equals(student.getDni())){
                return true;
            }
        }
        return false;
    }
    
    protected boolean listContainsBook(Book book, ArrayList<Book> bookList){
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getCode() == book.getCode()){
                return true;
            }
        }
        return false;
    }
    
    protected int getStudentPosition(String dni, ArrayList<Student> studentList){
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getDni().equals(dni))
                return i;
        }
        return -1;
    }
    
    protected int getBookPosition(int code, ArrayList<Book> bookList){
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getCode() == code)
                return i;
        }
        return +1;
    }
    
    protected Student getStudentByDni(String dni, ArrayList<Student> studentList){
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getDni().equals(dni))
                return studentList.get(i);
        }
        return null;
    }
    
    protected Book getBookByCode(int code, ArrayList<Book> bookList){
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getCode() == code)
                return bookList.get(i);
        }
        return null;
    }
    
    protected Date getDateFromString(String d){
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
    
    protected String getStringFromDate(Date d){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(d);
    }
    
    protected String getCurrentDate(){
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    protected String getPlusMonthDate(){
        return LocalDateTime.now().plusMonths(1)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    protected void createDialog(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        
    }
    
    
}
