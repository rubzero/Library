package controllers;

import managers.BookManager;
import dialogs.BookDialog;
import interfaces.BookTableView;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.table.TableColumn;
import models.Book;

/**
 * @author Rubzer
 */

public class BookController extends MasterController{
    
    private BookDialog bookDialog = null;
    private BookManager bookBusiness = null;
    private JFrame parent = null;
    
    private LoanController loanController;
    
    public BookController(Connection connection, JFrame parent)
            throws SQLException{
        bookBusiness = new BookManager(connection);
        this.parent = parent;
    }
    
    public void createBookDialog() throws SQLException{
        bookDialog = new BookDialog(parent, true);
        createBookTable();
        createBookListeners();
    }

    private void createBookTable() throws SQLException{
        bookDialog.getTbBooks()
                .setModel(new BookTableView(bookBusiness));
        bookDialog.getTbBooks().addMouseListener(this);
        setBookTableTitles();
    }
    
    private void setBookTableTitles() throws SQLException{
        for(int i=0; i<bookDialog.getTbBooks().getColumnCount(); i++){
            TableColumn col = bookDialog.getTbBooks()
                .getTableHeader().getColumnModel().getColumn(i);
            col.setHeaderValue(bookBusiness.getFieldNameList().get(i));
        }
    }
    
    private void createBookListeners(){
        bookDialog.getBtnExit().addActionListener(this);
        bookDialog.getBtnAccept().addActionListener(this);
        bookDialog.getBtnSelect().addActionListener(this);
        bookDialog.getTxtBrowser().getDocument().addDocumentListener(this);
        bookDialog.getCmbBook().addActionListener(this);
        bookDialog.getCmbBrowser().addActionListener(this);
        bookDialog.getBtnSelect().addActionListener(this);
    }
    
    private void showData(int fila) throws SQLException {
        String id = bookDialog.getValueAtPos(fila, 0);

        bookBusiness.setCurrentBook(-1, Integer.parseInt(id));
        Book book = bookBusiness.getBook();
        
        bookDialog.getTxtCode().setText(book.getCode()+"");
        bookDialog.getTxtTitle().setText(book.getTitle());
        bookDialog.getTxtAuthor().setText(book.getAuthor());
        bookDialog.getTxtEditorial().setText(book.getEditorial());
        bookDialog.getTxtSubject().setText(book.getSubject());
        bookDialog.getTxtStatus().setText(book.getStatus());
    }
    
    public Book getCurrentBook(){
        int id = 0;
        if(!bookDialog.getTxtCode().getText().equals("")) 
            id = Integer.parseInt(bookDialog.getTxtCode().getText());
        
        return new Book(id, bookDialog.getTxtTitle().getText()
                , bookDialog.getTxtAuthor().getText()
                , bookDialog.getTxtEditorial().getText()
                , bookDialog.getTxtSubject().getText()
                , bookDialog.getTxtStatus().getText());
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        bookBusiness.setBook(getCurrentBook());
        try{
            if(e.getSource().equals(bookDialog.getBtnExit()))
                bookDialog.dispose();
            
            else if(e.getSource().equals(bookDialog.getCmbBook())){
                actionComboBook();
            }
            
            else if(e.getSource().equals(bookDialog.getCmbBrowser())){
                actionComboBrowser();
            }
            
            else if (e.getSource().equals(bookDialog.getBtnAccept())){
                actionAccept();
            }
            else if(e.getSource().equals(bookDialog.getBtnSelect())){
                actionSelect();
            }
        }
        catch(SQLException sqle){System.out.println(sqle.toString());}
    }
    
    private void actionComboBook() throws SQLException{
        String action = bookDialog
            .selectedItemToString(bookDialog.getCmbBook());
        bookDialog.setFieldsEditable(!(action).equals("Baja"));    

        if(action.equals("Alta") && bookDialog.getCmbBook().isEnabled())
            bookDialog.clearFields();
        else if(!bookDialog.nullRow())
            showData(bookDialog.selectedRow());
    }
    
    private void actionComboBrowser() throws SQLException{
        renewTable();
        refreshSearch();
    }
    
    private void actionAccept() throws SQLException{
        actionComboOptions();
        renewTable();
        clearFieldsOnResult();
    }
    
    private void actionComboOptions()throws SQLException{
        switch(bookDialog
            .selectedItemToString(bookDialog.getCmbBook())){
                case "Alta" : 
                    if(getCurrentBook().getTitle()!=null)
                        bookBusiness.Insert(); break;
                case "Baja" : bookBusiness.Delete(); break;
                case "Modificar" : bookBusiness.Update(); break;
            }
    }
    
    private void actionSelect(){
        if(getCurrentBook() != null 
                        && !getCurrentBook().getAuthor().equals("")){
                    loanController.addBookToList(getCurrentBook());
                    bookDialog.dispose();
                }
    }
    
    private void renewTable() throws SQLException{
        bookBusiness.setTableContent(); 
                bookDialog.getTbBooks()
                .setModel(new BookTableView(bookBusiness));
    }
    
    private void clearFieldsOnResult(){
        if(bookBusiness.getResult() && 
            !bookDialog.selectedItemToString(bookDialog
                .getCmbBook()).equals("Modificar")){
                    bookDialog.clearFields();
                }
        bookDialog.showDialog(bookBusiness.getResult());
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        try{
            if(bookDialog.selectedRow() != -1 && 
                (!bookDialog.getCmbBook().getSelectedItem().equals("Alta")
                    || !bookDialog.getCmbBook().isEnabled()))
            showData(bookDialog.selectedRow());
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
            String search = bookDialog.getTxtBrowser().getText();
            bookBusiness.searchByString(search, bookDialog
                    .selectedItemToString(bookDialog.getCmbBrowser())); 
            bookDialog.getTbBooks()
                    .setModel(new BookTableView(bookBusiness));
            setBookTableTitles();
        }
        catch(SQLException ex){System.out.println(ex);}
    }
    
    public BookDialog getBookDialog() {
        return bookDialog;
    }

    public LoanController getLoanController() {
        return loanController;
    }

    public void setLoanController(LoanController loanController) {
        this.loanController = loanController;
    }
    
    
}
