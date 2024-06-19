/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import javax.swing.JOptionPane;
import ui.main.MainFrame;
import ui.reader.ReaderProfileView;
//editan buat create
import models.Book;

/**
 *
 * @author ilham
 */
public class AdminAddBook extends javax.swing.JPanel {

    /**
     * Creates new form AdminProfileView
     */
    private MainFrame mainFrame;

//    public AdminAddBook(MainFrame mainFrame) {
//        this.store = new BookStore();
//        initComponents();
//        this.mainFrame = mainFrame;
//    }
    
    public AdminAddBook(MainFrame mainFrame) {
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
        lblTitle = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSaveNewBook = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblContent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Sora", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 224, 224));
        jLabel3.setText("Add Book");

        lblTitle.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        lblTitle.setText("Book Title");
        lblTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTitleActionPerformed(evt);
            }
        });

        lblAuthor.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        lblAuthor.setText("Author's Name");
        lblAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAuthorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel1.setText("Title");

        jLabel4.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel4.setText("Author");

        btnSaveNewBook.setBackground(new java.awt.Color(64, 206, 206));
        btnSaveNewBook.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        btnSaveNewBook.setForeground(new java.awt.Color(37, 42, 51));
        btnSaveNewBook.setText("Add");
        btnSaveNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewBookActionPerformed(evt);
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

        lblProfile.setFont(new java.awt.Font("Sora", 1, 12)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(223, 224, 224));
        lblProfile.setText("Profile");
        lblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfileMouseClicked(evt);
            }
        });

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
                    .addComponent(lblProfile)
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
                .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(239, 239, 239)
                .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        lblContent.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        lblContent.setText("Book's Content");
        lblContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblContentActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel5.setText("Content");

        lblPrice.setFont(new java.awt.Font("Sora", 0, 10)); // NOI18N
        lblPrice.setText("Book's Price");
        lblPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sora", 1, 10)); // NOI18N
        jLabel6.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSaveNewBook)
                    .addComponent(jLabel3)
                    .addComponent(lblContent, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContent, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveNewBookActionPerformed(java.awt.event.ActionEvent evt) {     
        // Retrieve data from text fields
        String title = lblTitle.getText();
        String author = lblAuthor.getText();
        String content = lblContent.getText();
        
        Book newBook;

        // Validate and convert the price
        double price = 0.0;
        try {
            price = Double.parseDouble(lblPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (title.equals("") || author.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan semua field terisi.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            newBook = new Book(title, author, content, price);
        }

        // add newBook to BookStore
        this.mainFrame.getStore().addBook(newBook);
        
        JOptionPane.showMessageDialog(this, "Buku berhasil ditambahkan!");
        mainFrame.showView(new AdminHomeView(mainFrame));
    }                                              

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

    private void lblAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAuthorActionPerformed

    private void lblContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContentActionPerformed

    private void lblPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPriceActionPerformed

    private void lblTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitleActionPerformed

    private void lblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseClicked
        // TODO add your handling code here:
       mainFrame.showView(new AdminProfileView(mainFrame));
    }//GEN-LAST:event_lblProfileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveNewBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lblAuthor;
    private javax.swing.JTextField lblContent;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JTextField lblPrice;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JTextField lblTitle;
    // End of variables declaration//GEN-END:variables
}
