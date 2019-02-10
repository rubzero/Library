package dialogs;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Rubzer
 */
public class StudentDialog extends MasterDialog {
    
    private ArrayList<JTextField> textFieldList;
    private String opener;
    
    public StudentDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTextFieldList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudents = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSurname1 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtBrowser = new javax.swing.JTextField();
        cmbBrowser = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        cmbStudent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("studentDialog"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pnBackground.setBackground(new java.awt.Color(86, 96, 102));
        pnBackground.setPreferredSize(new java.awt.Dimension(810, 706));

        tbStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbStudents);

        jPanel1.setBackground(new java.awt.Color(86, 96, 102));

        lblId.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Id");

        txtId.setEditable(false);

        lblName.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre");

        txtNombre.setToolTipText("");

        lblSurname1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblSurname1.setForeground(new java.awt.Color(255, 255, 255));
        lblSurname1.setText("Primer apellido");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Segundo apellido");

        lblDni.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblDni.setForeground(new java.awt.Color(255, 255, 255));
        lblDni.setText("Dni");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblName)
                            .addComponent(lblSurname1)
                            .addComponent(jLabel5)
                            .addComponent(lblDni)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 225, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSurname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtBrowser.setToolTipText("");

        cmbBrowser.setBackground(new java.awt.Color(205, 224, 244));
        cmbBrowser.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        cmbBrowser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dni", "Nombre", "Apellido 1" }));

        btnExit.setBackground(new java.awt.Color(205, 224, 244));
        btnExit.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnExit.setText("Volver");
        btnExit.setMaximumSize(new java.awt.Dimension(90, 25));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 25));

        btnAccept.setBackground(new java.awt.Color(205, 224, 244));
        btnAccept.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnAccept.setText("Aceptar");

        btnSelect.setBackground(new java.awt.Color(205, 224, 244));
        btnSelect.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSelect.setText("Seleccionar");

        cmbStudent.setBackground(new java.awt.Color(205, 224, 244));
        cmbStudent.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        cmbStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja", "Modificar" }));

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnBackgroundLayout.createSequentialGroup()
                                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addComponent(txtBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addComponent(cmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StudentDialog dialog = new StudentDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cmbBrowser;
    private javax.swing.JComboBox<String> cmbStudent;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname1;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTable tbStudents;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBrowser;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void setDialogVisual(){
        switch(opener){
            case "main": openFromMain(true); break;
            case "loan": openFromMain(false); break;
        }
    }
    
    private void openFromMain(boolean isMain){
        btnAccept.setEnabled(isMain);
        btnSelect.setEnabled(!isMain);
        cmbStudent.setEnabled(isMain);
        cmbStudent.setSelectedIndex(0);
        for(int i=0; i<textFieldList.size();i++){
            textFieldList.get(i).setEditable(isMain);
        }
        txtId.setEditable(false);
    }
    
    public void setOpener(String opener){
        this.opener = opener;
    }

    public void setFieldsEditable(boolean b){
        super.setFieldsEditable(b, textFieldList);
    }
    
    public void clearFields(){
        super.clearFields(textFieldList);
    }
        
    @Override
    protected final void setTextFieldList(){
        textFieldList = new ArrayList<>();
        textFieldList.add(txtId);
        textFieldList.add(txtDni);
        textFieldList.add(txtNombre);
        textFieldList.add(txtApellido1);
        textFieldList.add(txtApellido2);
    }
    
    public boolean nullRow(){
        return super.selectedRow(tbStudents) == -1;
    }
        
    public String getValueAtPos(int row, int col){
        return super.getValueAtPos(row, col, tbStudents);
    }
    
    public int selectedRow(){
        return super.selectedRow(tbStudents);
    }
            
    public JTable getTbStudents() {
        return tbStudents;
    }

    public JButton getBtnAccept() {
        return btnAccept;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnSelect() {
        return btnSelect;
    }

    public JComboBox<String> getCmbStudent() {
        return cmbStudent;
    }

    public JLabel getjLabel1() {
        return lblDni;
    }

    public JLabel getjLabel2() {
        return lblId;
    }

    public JLabel getjLabel3() {
        return lblName;
    }

    public JLabel getjLabel4() {
        return lblSurname1;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getTxtApellido1() {
        return txtApellido1;
    }

    public JTextField getTxtApellido2() {
        return txtApellido2;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtBrowser() {
        return txtBrowser;
    }

    public JComboBox<String> getCmbBrowser() {
        return cmbBrowser;
    }

    public ArrayList<JTextField> getTextFieldList() {
        return textFieldList;
    }
    
    
}
