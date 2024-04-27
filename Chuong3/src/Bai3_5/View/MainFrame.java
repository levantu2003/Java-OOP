/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Bai3_5.View;

/**
 *
 * @author Kaiser
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.mnHoaDon.setEnabled(false);
        this.mnLoaiSach.setEnabled(false);
        this.mnPhieuNhapSach.setEnabled(false);
        this.mnDangXuat.setEnabled(false);
        this.mnSach.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mnDangNhap = new javax.swing.JMenuItem();
        mnDangXuat = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        mnQuanLy = new javax.swing.JMenu();
        mnLoaiSach = new javax.swing.JMenuItem();
        mnSach = new javax.swing.JMenuItem();
        mnHoaDon = new javax.swing.JMenuItem();
        mnPhieuNhapSach = new javax.swing.JMenuItem();
        mnHuongDan = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setPreferredSize(new java.awt.Dimension(416, 319));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        mnHeThong.setMnemonic('f');
        mnHeThong.setText("Hệ Thống");

        mnDangNhap.setMnemonic('o');
        mnDangNhap.setText("Đăng nhập");
        mnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDangNhapActionPerformed(evt);
            }
        });
        mnHeThong.add(mnDangNhap);

        mnDangXuat.setMnemonic('s');
        mnDangXuat.setText("Đăng xuất");
        mnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDangXuatActionPerformed(evt);
            }
        });
        mnHeThong.add(mnDangXuat);

        mnThoat.setMnemonic('a');
        mnThoat.setText("Thoát");
        mnHeThong.add(mnThoat);

        menuBar.add(mnHeThong);

        mnQuanLy.setMnemonic('e');
        mnQuanLy.setText("Quản Lý");

        mnLoaiSach.setMnemonic('t');
        mnLoaiSach.setText("Loại sách");
        mnLoaiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoaiSachActionPerformed(evt);
            }
        });
        mnQuanLy.add(mnLoaiSach);

        mnSach.setMnemonic('y');
        mnSach.setText("Sách");
        mnQuanLy.add(mnSach);

        mnHoaDon.setMnemonic('p');
        mnHoaDon.setText("Hoá đơn");
        mnQuanLy.add(mnHoaDon);

        mnPhieuNhapSach.setMnemonic('d');
        mnPhieuNhapSach.setText("Phiếu nhập sách");
        mnQuanLy.add(mnPhieuNhapSach);

        menuBar.add(mnQuanLy);

        mnHuongDan.setMnemonic('h');
        mnHuongDan.setText("Hướng dẫn");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        mnHuongDan.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        mnHuongDan.add(aboutMenuItem);

        menuBar.add(mnHuongDan);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDangNhapActionPerformed
        frmDangNhap dn = new frmDangNhap(this, true);
        dn.setVisible(true);
        if (dn.isKetquaDangNhap()) {
            this.mnHoaDon.setEnabled(true);
            this.mnLoaiSach.setEnabled(true);
            this.mnPhieuNhapSach.setEnabled(true);
            this.mnDangXuat.setEnabled(true);
            this.mnDangNhap.setEnabled(false);
            this.mnSach.setEnabled(true);
        }
    }//GEN-LAST:event_mnDangNhapActionPerformed

    private void mnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDangXuatActionPerformed
        this.mnDangNhap.setEnabled(true);
        this.mnHoaDon.setEnabled(false);
        this.mnLoaiSach.setEnabled(false);
        this.mnPhieuNhapSach.setEnabled(false);
        this.mnDangXuat.setEnabled(false);
        this.mnSach.setEnabled(false);
    }//GEN-LAST:event_mnDangXuatActionPerformed

    private void mnLoaiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoaiSachActionPerformed
        frmLoaiSach ls = new frmLoaiSach();
        ls.setVisible(true);
        this.desktopPane.add(ls);
    }//GEN-LAST:event_mnLoaiSachActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnDangNhap;
    private javax.swing.JMenuItem mnDangXuat;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mnHoaDon;
    private javax.swing.JMenu mnHuongDan;
    private javax.swing.JMenuItem mnLoaiSach;
    private javax.swing.JMenuItem mnPhieuNhapSach;
    private javax.swing.JMenu mnQuanLy;
    private javax.swing.JMenuItem mnSach;
    private javax.swing.JMenuItem mnThoat;
    // End of variables declaration//GEN-END:variables

}
