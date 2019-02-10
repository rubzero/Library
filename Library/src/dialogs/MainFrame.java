package dialogs;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 * @author Rubzer
 */

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popReports = new javax.swing.JPopupMenu();
        itemStudents = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        itemBooks = new javax.swing.JMenuItem();
        sep2 = new javax.swing.JPopupMenu.Separator();
        itemLoans = new javax.swing.JMenuItem();
        pnBackground = new javax.swing.JPanel();
        pnButtons = new javax.swing.JPanel();
        btnLoans = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnBooks = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        popReports.setBackground(new java.awt.Color(205, 224, 244));
        popReports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        popReports.setInvoker(btnReports);
        popReports.setPreferredSize(new java.awt.Dimension(100, 100));
        popReports.setVerifyInputWhenFocusTarget(false);

        itemStudents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemStudents.setText("Estudiantes");
        popReports.add(itemStudents);
        popReports.add(sep1);

        itemBooks.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemBooks.setText("Libros");
        popReports.add(itemBooks);
        popReports.add(sep2);

        itemLoans.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        itemLoans.setText("Préstamos");
        popReports.add(itemLoans);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(215, 190, 190));
        setName("frmMain"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(450, 450));

        pnBackground.setBackground(new java.awt.Color(86, 96, 102));

        pnButtons.setBackground(new java.awt.Color(128, 106, 106));
        pnButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnLoans.setBackground(new java.awt.Color(205, 224, 244));
        btnLoans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loansIcon.png"))); // NOI18N

        btnStudents.setBackground(new java.awt.Color(205, 224, 244));
        btnStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentsIcon.png"))); // NOI18N

        btnReports.setBackground(new java.awt.Color(205, 224, 244));
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportsIcon.png"))); // NOI18N
        btnReports.setComponentPopupMenu(popReports);

        btnBooks.setBackground(new java.awt.Color(205, 224, 244));
        btnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booksIcon.png"))); // NOI18N

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLoans, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoans)
                    .addComponent(btnReports, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBooks)
                    .addComponent(btnStudents))
                .addGap(22, 22, 22))
        );

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(205, 224, 244));
        lblTitle.setText("Biblioteca");

        lblSubTitle.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(205, 224, 244));
        lblSubTitle.setText("IES El Rincón");

        btnExit.setBackground(new java.awt.Color(205, 224, 244));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xIcon.png"))); // NOI18N

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addGap(0, 0, 0)
                .addComponent(lblSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        } catch (ClassNotFoundException | InstantiationException 
                | IllegalAccessException 
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public JButton getBtnStudents() {
        return btnStudents;
    }
    
    public JButton getBtnBooks(){
        return btnBooks;
    }
    
    public JButton getBtnLoans(){
        return btnLoans;
    }

    public JButton getBtnReports() {
        return btnReports;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JMenuItem getItemBooks() {
        return itemBooks;
    }

    public JMenuItem getItemLoans() {
        return itemLoans;
    }

    public JMenuItem getItemStudents() {
        return itemStudents;
    }

    public JPopupMenu getPopReports() {
        return popReports;
    }
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoans;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnStudents;
    private javax.swing.JMenuItem itemBooks;
    private javax.swing.JMenuItem itemLoans;
    private javax.swing.JMenuItem itemStudents;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPopupMenu popReports;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JPopupMenu.Separator sep2;
    // End of variables declaration//GEN-END:variables

}
