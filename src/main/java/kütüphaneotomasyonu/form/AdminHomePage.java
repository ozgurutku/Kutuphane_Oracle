/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneotomasyonu.form;

/**
 *
 * @author ozgur.utku
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMemberList = new javax.swing.JButton();
        btnBookList = new javax.swing.JButton();
        btnBookDepositList = new javax.swing.JButton();
        btnBookAdd = new javax.swing.JButton();
        btnMemberAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAnnouncementsAdd = new javax.swing.JButton();
        lblLibraryName = new javax.swing.JLabel();
        btnMemberDelete = new javax.swing.JButton();
        btnMemberUpdate = new javax.swing.JButton();
        LogList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMemberList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/MembersList.png"))); // NOI18N
        btnMemberList.setText("Üye Listesi");
        btnMemberList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberListActionPerformed(evt);
            }
        });

        btnBookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/BooksList.png"))); // NOI18N
        btnBookList.setText("Kitap Listesi");
        btnBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookListActionPerformed(evt);
            }
        });

        btnBookDepositList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/DepositBooksList.png"))); // NOI18N
        btnBookDepositList.setText("Emanet Kitap Listesi");
        btnBookDepositList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookDepositListActionPerformed(evt);
            }
        });

        btnBookAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/BooksAdd.png"))); // NOI18N
        btnBookAdd.setText("Kitap Ekle");
        btnBookAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAddActionPerformed(evt);
            }
        });

        btnMemberAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/MembersList.png"))); // NOI18N
        btnMemberAdd.setText("Üye Ekle");
        btnMemberAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberAddActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/Exit.png"))); // NOI18N
        jButton1.setText("Çıkış Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAnnouncementsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/Announcements.png"))); // NOI18N
        btnAnnouncementsAdd.setText("Duyuru ekle");
        btnAnnouncementsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnouncementsAddActionPerformed(evt);
            }
        });

        lblLibraryName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLibraryName.setForeground(new java.awt.Color(102, 204, 0));
        lblLibraryName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/LibraryLogo.png"))); // NOI18N
        lblLibraryName.setText("Kütüphane Otomasyonu");

        btnMemberDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/PersonDelete.png"))); // NOI18N
        btnMemberDelete.setText("Üye Sil");
        btnMemberDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberDeleteActionPerformed(evt);
            }
        });

        btnMemberUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/Update.png"))); // NOI18N
        btnMemberUpdate.setText("Üye Güncelle");
        btnMemberUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberUpdateActionPerformed(evt);
            }
        });

        LogList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kütüphaneotomasyonu/pictures/Logs.png"))); // NOI18N
        LogList.setText("Log");
        LogList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLibraryName, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBookList, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addComponent(btnBookAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnMemberUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMemberAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(btnMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(btnMemberDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAnnouncementsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBookDepositList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblLibraryName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookDepositList, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnouncementsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMemberAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMemberDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMemberUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogList, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(927, 777));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMemberListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberListActionPerformed
        MembersList memberListLogin = new MembersList();
        memberListLogin.setVisible(true);
        memberListLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnMemberListActionPerformed

    private void btnBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookListActionPerformed
        BooksList bookListLogin = new BooksList();
        bookListLogin.setVisible(true);
        bookListLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBookListActionPerformed

    private void btnBookDepositListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookDepositListActionPerformed
        DepositBooksList depositBooksListLogin = new DepositBooksList();
        depositBooksListLogin.setVisible(true);
        depositBooksListLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBookDepositListActionPerformed

    private void btnBookAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAddActionPerformed
        BooksAdd booksAddLogin = new BooksAdd();
        booksAddLogin.setVisible(true);
        booksAddLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBookAddActionPerformed

    private void btnMemberAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberAddActionPerformed
        MembersAdd membersAddLogin = new MembersAdd();
        membersAddLogin.setVisible(true);
        membersAddLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnMemberAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage homeform = new HomePage();
        homeform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAnnouncementsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnouncementsAddActionPerformed
        AnnouncementsAdd announcementsAddLogin = new AnnouncementsAdd();
        announcementsAddLogin.setVisible(true);
        announcementsAddLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAnnouncementsAddActionPerformed

    private void btnMemberDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberDeleteActionPerformed
        MemberDelete deleteForm =new MemberDelete();
        deleteForm.setVisible(true);
        deleteForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnMemberDeleteActionPerformed

    private void btnMemberUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberUpdateActionPerformed
        MemberUpdate memberUpdate =new MemberUpdate();
        memberUpdate.setVisible(true);
        memberUpdate.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnMemberUpdateActionPerformed

    private void LogListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogListActionPerformed
        LogsList logList = new LogsList();
        logList.setVisible(true);
        logList.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_LogListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogList;
    private javax.swing.JButton btnAnnouncementsAdd;
    private javax.swing.JButton btnBookAdd;
    private javax.swing.JButton btnBookDepositList;
    private javax.swing.JButton btnBookList;
    private javax.swing.JButton btnMemberAdd;
    private javax.swing.JButton btnMemberDelete;
    private javax.swing.JButton btnMemberList;
    private javax.swing.JButton btnMemberUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblLibraryName;
    // End of variables declaration//GEN-END:variables
}
