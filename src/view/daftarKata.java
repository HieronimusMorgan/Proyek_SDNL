/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Tree.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class daftarKata extends javax.swing.JFrame {

    Tree tree = Kamusku.kamus;
    LinkedList<TreeNode> listTree;

    /**
     * Creates new form daftarKata
     */
    public daftarKata() {
        listTree = new LinkedList();
        initComponents();
        baca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        indoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ngokoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kramaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kramaInggilText = new javax.swing.JTextField();
        tambahButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        indoText1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ngokoText1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kramaText1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kramaInggilText1 = new javax.swing.JTextField();
        cari2Button = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 367, 410));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Daftar Kata");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, -1));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane1.setName("Tambah Kata"); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indonesia");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        indoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoTextActionPerformed(evt);
            }
        });
        jPanel2.add(indoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 243, 40));

        jLabel5.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngoko Lugu");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        ngokoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(ngokoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 242, 35));

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Krama");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        kramaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(kramaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 243, 35));

        jLabel7.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Krama Inggil");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        kramaInggilText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(kramaInggilText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 243, 35));

        tambahButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });
        jPanel2.add(tambahButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/free-wayang-vector.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -110, 1100, 540));

        jTabbedPane1.addTab("Tambah Kata", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Indonesia");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 40));

        indoText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoText1ActionPerformed(evt);
            }
        });
        jPanel3.add(indoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 243, 40));

        jLabel10.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ngoko Lugu");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        ngokoText1.setEditable(false);
        ngokoText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(ngokoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 242, 35));

        jLabel11.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Krama");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        kramaText1.setEditable(false);
        kramaText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(kramaText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 243, 35));

        jLabel12.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Krama Inggil");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        kramaInggilText1.setEditable(false);
        kramaInggilText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(kramaInggilText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 243, 35));

        cari2Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cari2Button.setText("Cari");
        cari2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(cari2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        hapusButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });
        jPanel3.add(hapusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/free-wayang-vector.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -110, 1100, 540));

        jTabbedPane1.addTab("Hapus Kata", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 280, 410));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/free-wayang-vector.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 700, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void indoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoTextActionPerformed

    }//GEN-LAST:event_indoTextActionPerformed

    private void indoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoText1ActionPerformed
        cari2ButtonActionPerformed(evt);
    }//GEN-LAST:event_indoText1ActionPerformed

    private void cari2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ButtonActionPerformed

        Bahasa s = new Bahasa();
        String c = indoText1.getText();
        int kunci = (int) c.charAt(0);
        if (kunci > 0) {
            c = indoText1.getText().substring(0, 1).toUpperCase() + indoText1.getText().substring(1, indoText1.getText().length());
        }
        s.setIndo(c);
        TreeNode cari = Kamusku.kamus.searchNode(s);
        if (cari != null) {
            ngokoText1.setText(cari.getData().getNgoko());
            kramaText1.setText(cari.getData().getKrama());
            kramaInggilText1.setText(cari.getData().getKramaInggil());
        } else {
            JOptionPane.showMessageDialog(null, "Kata Tidak Tersedia");
        }
    }//GEN-LAST:event_cari2ButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        Bahasa baru = new Bahasa();
        String c = indoText1.getText();
        int kunci = (int) c.charAt(0);
        if (kunci > 0) {
            c = indoText1.getText().substring(0, 1).toUpperCase() + indoText1.getText().substring(1, indoText1.getText().length());
        }
        baru.setIndo(c);
        baru.setNgoko(ngokoText1.getText());
        baru.setKrama(kramaText1.getText());
        baru.setKramaInggil(kramaInggilText1.getText());
        Kamusku.kamus.delete(baru);
        listTree.clear();
        baca();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        Bahasa baru = new Bahasa();
        baru.setIndo(indoText.getText());
        baru.setNgoko(ngokoText.getText());
        baru.setKrama(kramaText.getText());
        baru.setKramaInggil(kramaInggilText.getText());
        Kamusku.kamus.insertNode(baru);
        listTree.clear();
        baca();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void baca() {
        DefaultTableModel tableModel = new DefaultTableModel();
        Object[] column = new Object[4];
        column[0] = "Indonesia";
        column[1] = "Ngoko";
        column[2] = "Krama";
        column[3] = "Krama Inggil";
        tableModel.setColumnIdentifiers(column);
        Object[] row = new Object[4];
        inOrder(Kamusku.kamus.getRoot());
        if (tableModel.getRowCount() != 0) {
            int j = 1;
            tableModel.removeRow(j);
            j++;
        }
        for (int i = 0; i < listTree.size(); i++) {
            row[0] = listTree.get(i).getData().getIndo();
            row[1] = listTree.get(i).getData().getNgoko();
            row[2] = listTree.get(i).getData().getKrama();
            row[3] = listTree.get(i).getData().getKramaInggil();
            tableModel.addRow(row);
            if ("Aku".equals(indoText.getText())) {
                System.out.println("Ada coyyy");
            }
        }
        jTable1.setModel(tableModel);

    }
    public String indo = "";

    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeftNode());
            listTree.add(node);
            inOrder(node.getRightNode());

        }
    }

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
            java.util.logging.Logger.getLogger(daftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarKata().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari2Button;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField indoText;
    private javax.swing.JTextField indoText1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kramaInggilText;
    private javax.swing.JTextField kramaInggilText1;
    private javax.swing.JTextField kramaText;
    private javax.swing.JTextField kramaText1;
    private javax.swing.JTextField ngokoText;
    private javax.swing.JTextField ngokoText1;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
