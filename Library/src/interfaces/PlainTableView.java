package interfaces;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Rubze
 */

public class PlainTableView extends AbstractTableModel{
    
    private final String[] columnNames;
    private final ArrayList<String[]> data;
    
    public PlainTableView(String[] columnNames, ArrayList<String[]> data){
        this.columnNames = columnNames;
        this.data = data;
    }    

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        if(columnNames != null)
            return columnNames.length;
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }
    
    @Override 
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
