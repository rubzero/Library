package dialogs;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Rubzer
 */

public class BookDialog extends MasterDialog {

    private ArrayList<JTextField> textFieldList;
    private String opener;
    
    public BookDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTextFieldList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        txtCode = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtBrowser = new javax.swing.JTextField();
        cmbBrowser = new javax.swing.JComboBox<>();
        lblCode = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        cmbBook = new javax.swing.JComboBox<>();
        pnTable = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tbBooks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnMain.setBackground(new java.awt.Color(86, 96, 102));

        txtCode.setEditable(false);

        btnSelect.setBackground(new java.awt.Color(205, 224, 244));
        btnSelect.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSelect.setText("Seleccionar");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(205, 224, 244));
        btnExit.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnExit.setText("Volver");

        cmbBrowser.setBackground(new java.awt.Color(205, 224, 244));
        cmbBrowser.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        cmbBrowser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo", "Autor", "Asignatura" }));

        lblCode.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("Código");

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Título");

        lblAuthor.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthor.setText("Autor");

        lblEditorial.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblEditorial.setForeground(new java.awt.Color(255, 255, 255));
        lblEditorial.setText("Editorial");

        lblSubject.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(255, 255, 255));
        lblSubject.setText("Asignatura");

        lblStatus.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Estado");

        btnAccept.setBackground(new java.awt.Color(205, 224, 244));
        btnAccept.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnAccept.setText("Aceptar");

        cmbBook.setBackground(new java.awt.Color(205, 224, 244));
        cmbBook.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        cmbBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja", "Modificar" }));

        pnTable.setBackground(new java.awt.Color(86, 96, 102));

        tbBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(tbBooks);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSubject)
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAuthor)
                            .addComponent(txtTitle)
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCode))
                                .addGap(18, 18, 18)
                                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEditorial)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblEditorial)
                        .addComponent(lblTitle))
                    .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnMainLayout.createSequentialGroup()
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblCode))
                .addGap(6, 6, 6)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(6, 6, 6)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAuthor)
                .addGap(9, 9, 9)
                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblEditorial)
                .addGap(6, 6, 6)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BookDialog dialog = new BookDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbBook;
    private javax.swing.JComboBox<String> cmbBrowser;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tbBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBrowser;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTitle;
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
        cmbBook.setEnabled(isMain);
        cmbBook.setSelectedIndex(0);
        for(int i=0; i<textFieldList.size();i++){
            textFieldList.get(i).setEditable(isMain);
        }
        txtCode.setEditable(false);
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
        textFieldList.add(txtCode);
        textFieldList.add(txtTitle);
        textFieldList.add(txtAuthor);
        textFieldList.add(txtEditorial);
        textFieldList.add(txtSubject);
        textFieldList.add(txtStatus);
    }
    
    public boolean nullRow(){
        return super.selectedRow(tbBooks) == -1;
    }
    
    public String getValueAtPos(int row, int col){
        return super.getValueAtPos(row, col, tbBooks);
    }
    
    public int selectedRow(){
        return super.selectedRow(tbBooks);
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

    public JComboBox<String> getCmbBook() {
        return cmbBook;
    }

    public JComboBox<String> getCmbBrowser() {
        return cmbBrowser;
    }

    public JTable getTbBooks() {
        return tbBooks;
    }

    public JTextField getTxtAuthor() {
        return txtAuthor;
    }

    public JTextField getTxtBrowser() {
        return txtBrowser;
    }

    public JTextField getTxtCode() {
        return txtCode;
    }

    public JTextField getTxtEditorial() {
        return txtEditorial;
    }

    public JTextField getTxtStatus() {
        return txtStatus;
    }

    public JTextField getTxtSubject() {
        return txtSubject;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public ArrayList<JTextField> getTextFieldList() {
        return textFieldList;
    }
    
    
    
}
