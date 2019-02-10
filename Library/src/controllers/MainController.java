package controllers;

import dialogs.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Rubzer
 */

public class MainController implements ActionListener{
    
    private String reportPath = null;
    
    private Connection connection = null;
    private MainFrame mainFrame = null;
    
    private StudentController studentController = null;
    private BookController bookController = null;
    private LoanController loanController = null;
    
    public MainController(Connection connection) throws SQLException {
        this.connection = connection;
        variableDeclare();
    }
    
    private void variableDeclare() {
        createMainFrame();
        createControllers();
        buttonDeclare();
        setDefaultReportPath();
    }
    
    private void createControllers(){
        try{
            studentController = new StudentController(connection, mainFrame);
            bookController = new BookController(connection, mainFrame);
            
            studentController.createStudentDialog();
            bookController.createBookDialog();
            
            loanController = new LoanController(connection, mainFrame
                    , studentController, bookController);
            loanController.createLoanDialog();
            
            bookController.setLoanController(loanController);
            studentController.setLoanController(loanController);
        }
        catch(SQLException e){System.out.println(e.toString());}
    }
    
    private void createMainFrame(){
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
            
    private void buttonDeclare(){
        mainFrame.getBtnStudents().addActionListener(this);
        mainFrame.getBtnBooks().addActionListener(this);
        mainFrame.getBtnLoans().addActionListener(this);
        mainFrame.getBtnReports().addActionListener(this);
        mainFrame.getBtnExit().addActionListener(this);
        mainFrame.getItemStudents().addActionListener(this);
        mainFrame.getItemBooks().addActionListener(this);
        mainFrame.getItemLoans().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){       
        if(e.getSource().equals(mainFrame.getBtnExit())){
            System.exit(0);
        }
        
        else if(e.getSource().equals(mainFrame.getBtnStudents())){
            openStudentDialog();
        }
        
        else if(e.getSource().equals(mainFrame.getBtnBooks())){
            openBookDialog();
        }
        
        else if(e.getSource().equals(mainFrame.getBtnLoans())){
            loanController.setVisible(loanController.getLoanDialog());
        }
        
        else if(e.getSource().equals(mainFrame.getItemStudents()) 
                || e.getSource().equals(mainFrame.getItemBooks())
                || e.getSource().equals(mainFrame.getItemLoans()))
            setReportPath(e);
        
        else if(e.getSource().equals(mainFrame.getBtnReports())){
            setDefaultReport();
            reportsAction();
        }
    }   
    
    private void setReportPath(ActionEvent e){
        setDefaultReportPath();
        if(e.getSource().equals(mainFrame.getItemStudents()))
            reportPath+="reportStudents.jrxml";
        else if(e.getSource().equals(mainFrame.getItemBooks()))
            reportPath+="reportBooks.jrxml";
        else reportPath+="reportLoans.jrxml";
        reportsAction();
    }
    
    private void setDefaultReport(){
        setDefaultReportPath();
        reportPath += "reportStudents.jrxml";
    }
    
   private void setDefaultReportPath(){
       reportPath = "/home/rubzer/Documents/Library/TodoJunto/src/Reports/";
   }
        
    private void reportsAction(){
        try{            
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
            JasperViewer.viewReport(jp, false);
            setDefaultReportPath();
        }
        catch(JRException e){System.out.println(e);}
    }   
    
    private void openStudentDialog(){
        studentController.getStudentDialog().setOpener("main");
        studentController.getStudentDialog().setDialogVisual();
        studentController.setVisible(studentController.getStudentDialog());
    }
    
    private void openBookDialog(){
        bookController.getBookDialog().setOpener("main");
        bookController.getBookDialog().setDialogVisual();
        bookController.setVisible(bookController.getBookDialog());
    }
}
