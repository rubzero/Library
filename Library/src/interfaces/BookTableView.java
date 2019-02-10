package interfaces;

import managers.BookManager;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import models.Book;

/**
 * @author Rubzer
 */

public class BookTableView extends AbstractTableModel{
    
    private final int columnCount;
    private final int rowCount;
    private final BookManager bookBusiness;
    private Book book;
    
    public BookTableView(BookManager bookBusiness) throws SQLException{
        this.bookBusiness = bookBusiness;
        columnCount = bookBusiness.getColumnCount();
        rowCount = bookBusiness.getRowCount();      
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }
    
    private void setSelectedBook(){
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try{
            bookBusiness.setCurrentBook(rowIndex+1, -1);
            Book book = bookBusiness.getBook();
            switch (columnIndex+1){           
                case 1: return book.getCode();
                case 2: return book.getTitle();
                case 3: return book.getAuthor();
                case 4: return book.getEditorial();
                case 5: return book.getSubject();
                case 6: return book.getStatus();
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
}
