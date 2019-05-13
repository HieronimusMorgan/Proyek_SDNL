/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Tree.Bahasa;
import Tree.Tree;
import Tree.TreeNode;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Kamusku extends javax.swing.JFrame {

    Tree kamus = new Tree();

    /**
     * Creates new form Kamusku
     */
    public Kamusku() {
        initComponents();
        load();
    }

    public void load() {
        kamus.bacaData();
        System.out.println(kamus.getRoot().getData().getIndo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        indoText = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        ngokoText = new javax.swing.JTextField();
        kramaText = new javax.swing.JTextField();
        kramaInggilText = new javax.swing.JTextField();
        bersihButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuDaftar = new javax.swing.JMenuItem();
        menuTentang = new javax.swing.JMenuItem();
        menuKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kamus Jawa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 240, -1));

        indoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoTextActionPerformed(evt);
            }
        });
        getContentPane().add(indoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 243, 40));

        cariButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cariButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        ngokoText.setEditable(false);
        ngokoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(ngokoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 242, 35));

        kramaText.setEditable(false);
        kramaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(kramaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 243, 35));

        kramaInggilText.setEditable(false);
        kramaInggilText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(kramaInggilText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 243, 35));

        bersihButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bersihButton.setText("Clean");
        bersihButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bersihButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Krama Inggil");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indonesia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngoko Lugu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Krama");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/free-wayang-vector.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -40, 490, 560));

        menuFile.setText("File");

        menuDaftar.setText("Daftar");
        menuFile.add(menuDaftar);

        menuTentang.setText("Tentang");
        menuTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTentangActionPerformed(evt);
            }
        });
        menuFile.add(menuTentang);

        menuKeluar.setText("Keluar");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });
        menuFile.add(menuKeluar);

        jMenuBar1.add(menuFile);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoTextActionPerformed
        cariButtonActionPerformed(evt);
    }//GEN-LAST:event_indoTextActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        Bahasa s = new Bahasa();
        String c = indoText.getText();
        int kunci = (int) c.charAt(0);
        if (kunci > 0) {
            c = indoText.getText().substring(0, 1).toUpperCase() + indoText.getText().substring(1, indoText.getText().length());
        }
        s.setIndo(c);
        TreeNode cari = kamus.searchNode(s);
        if (cari != null) {
            ngokoText.setText(cari.getData().getNgoko());
            kramaText.setText(cari.getData().getKrama());
            kramaInggilText.setText(cari.getData().getKramaInggil());
        } else {
            JOptionPane.showMessageDialog(null, "Kata Tidak Tersedia");
        }

    }//GEN-LAST:event_cariButtonActionPerformed

    private void bersihButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihButtonActionPerformed
        indoText.setText("");
        ngokoText.setText("");
        kramaText.setText("");
    }//GEN-LAST:event_bersihButtonActionPerformed

    private void menuTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTentangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTentangActionPerformed

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Kamusku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kamusku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kamusku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kamusku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kamusku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihButton;
    private javax.swing.JButton cariButton;
    private javax.swing.JTextField indoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField kramaInggilText;
    private javax.swing.JTextField kramaText;
    private javax.swing.JMenuItem menuDaftar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenuItem menuTentang;
    private javax.swing.JTextField ngokoText;
    // End of variables declaration//GEN-END:variables
}
