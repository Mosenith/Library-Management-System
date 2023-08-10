/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import controller.BookController;
import model.Author;
import model.Book;
import model.LibraryMember;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PHEARUN PHIN
 */
public class AddBookV extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBookV() {
        initComponents();
        showData();
    }

        private BookController controller = new BookController();
        ArrayList<Author> list = null;
        Author selectedAuthor;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBookISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtRadio21 = new javax.swing.JRadioButton();
        txtRadio7 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAreaAuthors = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAuthors = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSelectAuthor = new javax.swing.JButton();
        btnAddAuthor = new javax.swing.JButton();
        btnCloseWIndow1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, -1));

        jLabel2.setText("Book ISBN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtBookISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookISBNActionPerformed(evt);
            }
        });
        jPanel1.add(txtBookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        jLabel4.setText("Check Out Length");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setText("Author(s)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Add Book");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 50));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 5));

        txtRadio21.setBackground(new java.awt.Color(204, 204, 204));
        txtRadio21.setText("21");
        txtRadio21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadio21ActionPerformed(evt);
            }
        });
        jPanel1.add(txtRadio21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtRadio7.setBackground(new java.awt.Color(204, 204, 204));
        txtRadio7.setText("7");
        jPanel1.add(txtRadio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jAreaAuthors.setColumns(20);
        jAreaAuthors.setRows(5);
        jScrollPane2.setViewportView(jAreaAuthors);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jButton2.setText("Add");
        // Add book Button
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 75, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Author");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        tableAuthors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "No", "Name"
            }
        ));
        jScrollPane1.setViewportView(tableAuthors);
        if (tableAuthors.getColumnModel().getColumnCount() > 0) {
            tableAuthors.getColumnModel().getColumn(0).setResizable(false);
            tableAuthors.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 410, 320));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 5));

        btnSelectAuthor.setText("Select");
        jPanel3.add(btnSelectAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        btnSelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAuthorActionPerformed(evt);
            }
        });

        btnAddAuthor.setText("New");
        btnAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAuthorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        btnCloseWIndow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icon/close.png"))); // NOI18N
        btnCloseWIndow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWIndow1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCloseWIndow1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCloseWIndow1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void txtBookISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookISBNActionPerformed

    // add book button action
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String isbn = txtBookISBN.getText();
        String title = txtTitle.getText();
        String length = (txtRadio21.isSelected()) ? "21" : "7";

        try {
            Book book = new Book(0, isbn, title, Integer.parseInt(length));
            book.addAuthor(selectedAuthor);

            controller.addBook(book);
            controller.addBookCopyAuto(isbn);
            JOptionPane.showMessageDialog(null, "Book Added!!!");
            txtBookISBN.setText("");
            txtTitle.setText("");
            txtRadio7.setSelected(false);
            txtRadio21.setSelected(false);
            jAreaAuthors.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtRadio21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadio21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadio21ActionPerformed

    private void btnAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAuthorActionPerformed
        // TODO add your handling code here:
        dispose();
        NewAuthor newAuthor = new NewAuthor();
        newAuthor.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        newAuthor.setVisible(true);
        
    }//GEN-LAST:event_btnAddAuthorActionPerformed
    private void btnSelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAuthorActionPerformed
        // TODO add your handling code here:
        String selectedData = null;

        int[] selectedRow = tableAuthors.getSelectedRows();
        int[] selectedColumns = tableAuthors.getSelectedColumns();

        selectedAuthor = list.get(tableAuthors.getSelectedRow());
        jAreaAuthors.setText(selectedAuthor.getFirstName() + " " + selectedAuthor.getLastName());

    }//GEN-LAST:event_btnSelectAuthorActionPerformed

    private void btnCloseWIndow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWIndow1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCloseWIndow1MouseClicked

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
            java.util.logging.Logger.getLogger(AddBookV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookV().setVisible(true);
            }
        });
    }

    public void showData(){

        DefaultTableModel tableModel = (DefaultTableModel) tableAuthors.getModel();
        tableModel.setRowCount(0);

        try {
            list = (ArrayList<Author>) controller.authorList();
            Object rowData[] = new Object[4];
            for(int i=0; i<list.size(); i++){

                rowData[0] = list.get(i).getId();
                rowData[1] = list.get(i).getFirstName() + " " +  list.get(i).getLastName();
//                rowData[2] = list.get(i).getLastName();
                tableModel.addRow(rowData);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAuthor;
    private javax.swing.JLabel btnCloseWIndow1;
    private javax.swing.JButton btnSelectAuthor;
    private javax.swing.JTextArea jAreaAuthors;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAuthors;
    private javax.swing.JTextField txtBookISBN;
    private javax.swing.JRadioButton txtRadio21;
    private javax.swing.JRadioButton txtRadio7;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
