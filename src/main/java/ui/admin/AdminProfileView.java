/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.Reader;
import models.User;
import services.DatabaseService;
import ui.main.MainFrame;
import ui.reader.ReaderProfileView;

/**
 *
 * @author Dukhaan
 */
public class AdminProfileView extends javax.swing.JPanel {

    /**
     * Creates new form AdminProfileView
     */
    private MainFrame mainFrame;
    
    public AdminProfileView(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Sora", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 224, 224));
        jLabel3.setText("Profile");

        lblName.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel1.setText("Name");

        jLabel4.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel4.setText("Username");

        jButton2.setBackground(new java.awt.Color(64, 206, 206));
        jButton2.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(37, 42, 51));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(37, 42, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(112, 426));

        lblHome.setFont(new java.awt.Font("Sora", 1, 12)); // NOI18N
        lblHome.setForeground(new java.awt.Color(223, 224, 224));
        lblHome.setText("Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sora", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(223, 224, 224));
        jLabel9.setText("Profile");

        lblLogout.setFont(new java.awt.Font("Sora", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(245, 83, 112));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout)
                    .addComponent(lblHome)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(239, 239, 239)
                .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jLabel5.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel5.setText("Password");

        lblPassword.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jLabel3)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String newName = lblName.getText(); 
        String newUsername = lblUsername.getText(); 
        String newPassword = lblPassword.getText(); 

        // Mendapatkan referensi objek User yang ingin diubah (misalnya, user yang sedang login)
        User currentUser = DatabaseService.getCurrentUser(); 

        if (currentUser != null) {
            // Mengubah data pengguna sesuai input yang diberikan
            currentUser.setName(newName);
            currentUser.setUsername(newUsername);
            currentUser.setPassword(newPassword);

            // Memperbarui tampilan atau melakukan tindakan lain yang diperlukan setelah pembaruan
            updateUI();

            JOptionPane.showMessageDialog(this, "Data user berhasil diperbarui!");
            mainFrame.showView(mainFrame.getLoginView());
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada pengguna yang aktif.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Logout
            mainFrame.showView(mainFrame.getLoginView());
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        mainFrame.showView(new AdminHomeView(mainFrame));
    }//GEN-LAST:event_lblHomeMouseClicked

    public void updateUI() {
        SwingUtilities.invokeLater(() -> {
            lblName.setText(DatabaseService.getCurrentUser().getName());
            lblUsername.setText(DatabaseService.getCurrentUser().getUsername());
            lblPassword.setText(DatabaseService.getCurrentUser().getPassword());
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JTextField lblName;
    private javax.swing.JTextField lblPassword;
    private javax.swing.JTextField lblUsername;
    // End of variables declaration//GEN-END:variables
}
