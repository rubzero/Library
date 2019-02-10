package dialogs;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Rubzer
 */
public class LoanDialog extends MasterDialog {

    public LoanDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoans = new javax.swing.JTable();
        lblRecord = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLoansBooks = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLoansStudent = new javax.swing.JTable();
        btnAddStudent = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        txtBrowser = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblBrowser = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnRemoveStudent = new javax.swing.JButton();
        btnRemoveBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("LoanDialog"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 96, 102));

        tbLoans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbLoans);

        lblRecord.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblRecord.setText("Histórico de préstamos");

        lblStudent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblStudent.setText("Datos del estudiante");

        lblBooks.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBooks.setForeground(new java.awt.Color(255, 255, 255));
        lblBooks.setText("Préstamo de libros");

        tbLoansBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbLoansBooks);

        tbLoansStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbLoansStudent);

        btnAddStudent.setBackground(new java.awt.Color(205, 224, 244));
        btnAddStudent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddStudent.setText("Seleccionar estudiante...");

        btnAddBook.setBackground(new java.awt.Color(205, 224, 244));
        btnAddBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddBook.setText("Seleccionar libro...");

        btnSubmit.setBackground(new java.awt.Color(205, 224, 244));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmit.setText("Realizar operación");

        lblBrowser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBrowser.setForeground(new java.awt.Color(255, 255, 255));
        lblBrowser.setText("Id de transacción:");

        btnExit.setBackground(new java.awt.Color(205, 224, 244));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setText("Volver");

        btnRemoveStudent.setBackground(new java.awt.Color(205, 224, 244));
        btnRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveStudent.setText("-");

        btnRemoveBook.setBackground(new java.awt.Color(205, 224, 244));
        btnRemoveBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveBook.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBooks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveBook))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRecord)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBrowser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddStudent)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveStudent)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudent)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddStudent)
                        .addComponent(btnRemoveStudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddBook)
                        .addComponent(btnRemoveBook))
                    .addComponent(lblBooks))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addGap(23, 23, 23)
                .addComponent(lblRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrowser)
                    .addComponent(btnExit))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoanDialog dialog = new LoanDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemoveBook;
    private javax.swing.JButton btnRemoveStudent;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblBrowser;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JTable tbLoans;
    private javax.swing.JTable tbLoansBooks;
    private javax.swing.JTable tbLoansStudent;
    private javax.swing.JTextField txtBrowser;
    // End of variables declaration//GEN-END:variables

    public String getValueAtPos(int row, int col){
        return super.getValueAtPos(row, col, tbLoans);
    }

    public JTable getTbLoansBooks() {
        return tbLoansBooks;
    }

    public JTable getTbLoansStudent() {
        return tbLoansStudent;
    }
    
    public JTable getTbLoans(){
        return tbLoans;
    }

    public JButton getBtnAddBook() {
        return btnAddBook;
    }

    public JButton getBtnAddStudent() {
        return btnAddStudent;
    }

    public JButton getBtnExit() {
        return btnExit;
    }
    
    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public JTextField getTxtBrowser() {
        return txtBrowser;
    }

    public JButton getBtnRemoveBook() {
        return btnRemoveBook;
    }

    public JButton getBtnRemoveStudent() {
        return btnRemoveStudent;
    }
    
    
}
