/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai3_3;

import Bai3_2.Controller.CDController;
import Bai3_2.Model.CD;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kaiser
 */
public class frmBai3_3 extends javax.swing.JFrame {

    /**
     * Creates new form frmBai3_3
     */
    public frmBai3_3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamXB = new javax.swing.JTextField();
        txtLoaiDia = new javax.swing.JTextField();
        btnNamXBVaLoaiDia = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnNamXB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Loại đĩa:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Năm xuất bản:");

        txtLoaiDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiDiaActionPerformed(evt);
            }
        });

        btnNamXBVaLoaiDia.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNamXBVaLoaiDia.setText("Tìm theo năm XB và loại đĩa");
        btnNamXBVaLoaiDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamXBVaLoaiDiaActionPerformed(evt);
            }
        });

        btnShowAll.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnNamXB.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNamXB.setText("Tìm theo Năm XB");
        btnNamXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamXBActionPerformed(evt);
            }
        });

        tbCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã", "Tiêu đề", "Loại", "Năm xuất bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btnNamXB, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnNamXBVaLoaiDia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoaiDia, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoaiDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNamXB)
                    .addComponent(btnNamXBVaLoaiDia)
                    .addComponent(btnShowAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(326, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        CDController cdcontroller = new CDController();
        List<CD> list = cdcontroller.proc_showALL();
        if (list != null && !list.isEmpty()) {
            fillDataToTable(list);
            JOptionPane.showMessageDialog(this, "Lấy danh sách thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu");
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnNamXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamXBActionPerformed
        String namXBStr = txtNamXB.getText().trim();

        if (namXBStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập năm xuất bản", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int namXB = Integer.parseInt(namXBStr);
            CDController cdcontroller = new CDController();
            List<CD> list = cdcontroller.proc_showAllTheoNam(namXB);

            if (list != null && !list.isEmpty()) {
                fillDataToTable(list);
                JOptionPane.showMessageDialog(this, "Lọc dữ liệu thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNamXBActionPerformed

    private void btnNamXBVaLoaiDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamXBVaLoaiDiaActionPerformed
        String namXBStr = txtNamXB.getText().trim();
        String loaiDia = txtLoaiDia.getText().trim();

        if (namXBStr.isEmpty() || loaiDia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ năm xuất bản và thể loại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int namXB = Integer.parseInt(namXBStr);
            CDController cdcontroller = new CDController();
            List<CD> list = cdcontroller.proc_showAllheoNamVaTheLoai(namXB, loaiDia);

            if (list != null && !list.isEmpty()) {
                fillDataToTable(list);
                JOptionPane.showMessageDialog(this, "Lọc dữ liệu thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Năm xuất bản không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNamXBVaLoaiDiaActionPerformed

    private void txtLoaiDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiDiaActionPerformed

    private void fillDataToTable(List<CD> list) {
        DefaultTableModel model = (DefaultTableModel) tbCD.getModel();
        model.setRowCount(0);
        for (CD cd : list) {
            Object[] row = new Object[]{
                cd.getMa(),
                cd.getTieuDe(),
                cd.getLoai(),
                cd.getNamXB()
            };
            model.addRow(row);
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
            java.util.logging.Logger.getLogger(frmBai3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBai3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBai3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBai3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBai3_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNamXB;
    private javax.swing.JButton btnNamXBVaLoaiDia;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCD;
    private javax.swing.JTextField txtLoaiDia;
    private javax.swing.JTextField txtNamXB;
    // End of variables declaration//GEN-END:variables
}
