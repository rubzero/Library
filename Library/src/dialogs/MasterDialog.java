package dialogs;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Rubze
 */
public abstract class MasterDialog extends javax.swing.JDialog {
    
    public MasterDialog(java.awt.Frame parent, boolean modal){
        super(parent, modal);
    }
    
    public void showDialog(boolean b){
        String message = (b) ? "Operación realizada" : "Operación no realizada";
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void showDialog(boolean b, int c){
        String message = (b) ? "Operación realizada\nNº de operaciones: "+c
                : "Operación no realizada";
        JOptionPane.showMessageDialog(null, message);
    }
    
    public String selectedItemToString(JComboBox cmb){
        return String.valueOf(cmb.getSelectedItem());
    }
    
    public int selectedRow(JTable tb){
        return tb.getSelectedRow();
    }
    
    public String getValueAtPos(int row, int col, JTable tb){
        return String.valueOf(tb.getValueAt(row, col));
    }
    
    public boolean nullRow(JTable tb){
        return selectedRow(tb) == -1;
    }
    
    protected void setTextFieldList(){}
    
    protected void clearFields(ArrayList<JTextField> textFieldList){
        for(int i=0; i<textFieldList.size(); i++){
            textFieldList.get(i).setText("");
        }
    }
    
    public void setFieldsEditable(boolean b, ArrayList<JTextField> textFieldList){
        for(int i=1; i<textFieldList.size(); i++){
            textFieldList.get(i).setEditable(b);
        }
    }    
    
    
}
