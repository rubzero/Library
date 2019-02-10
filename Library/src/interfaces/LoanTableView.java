package interfaces;

import managers.LoanManager;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import models.Loan;

/**
 * @author Rubzer
 */

public class LoanTableView extends AbstractTableModel{
    
    private final int columnCount;
    private final int rowCount;
    private final LoanManager loanBusiness;
    
    public LoanTableView(LoanManager loanBusiness) throws SQLException{
        this.loanBusiness = loanBusiness;
        columnCount = loanBusiness.getColumnCount();
        rowCount = loanBusiness.getRowCount();      
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
            loanBusiness.setCurrentLoan(rowIndex+1, -1);
            Loan loan = loanBusiness.getLoan();
            switch (columnIndex+1){           
                case 1: return loan.getId();
                case 2: return loan.getStudentCod();
                case 3: return loan.getBookCod();
                case 4: return loan.getLoanDate()+"";
                case 5: return loan.getRefundDate();
                case 6: return loan.getStatus();
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
