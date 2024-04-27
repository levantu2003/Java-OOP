/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.XacThuc;

import static Controller.KiemSoatLoiInput.kiemtraEmail;
import static Controller.KiemSoatLoiInput.kiemtraTrongInput;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kaiser
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        setTitle("Đăng ký");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDangKy = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JLabel();
        lbDangKy = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        lbMatKhauAgain = new javax.swing.JLabel();
        lbHo = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhauAgain = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDangKy.setBackground(new java.awt.Color(175, 217, 243));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(175, 217, 243));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setOpaque(true);

        lbMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setText("Mật khẩu:");

        lbDangKy.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbDangKy.setForeground(new java.awt.Color(255, 255, 255));
        lbDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SignIn_Header.png"))); // NOI18N
        lbDangKy.setText("   Đăng ký");

        btnSignUp.setBackground(new java.awt.Color(22, 72, 99));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lbMatKhauAgain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMatKhauAgain.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhauAgain.setText("Nhập lại mật khẩu:");

        lbHo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbHo.setForeground(new java.awt.Color(255, 255, 255));
        lbHo.setText("Họ:");

        txtHo.setBackground(new java.awt.Color(175, 217, 243));
        txtHo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtHo.setOpaque(true);

        lbTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTen.setForeground(new java.awt.Color(255, 255, 255));
        lbTen.setText("Tên:");

        txtTen.setBackground(new java.awt.Color(175, 217, 243));
        txtTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTen.setOpaque(true);

        txtMatKhau.setBackground(new java.awt.Color(175, 217, 243));
        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        txtMatKhauAgain.setBackground(new java.awt.Color(175, 217, 243));
        txtMatKhauAgain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhauAgain.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnDangKyLayout = new javax.swing.GroupLayout(pnDangKy);
        pnDangKy.setLayout(pnDangKyLayout);
        pnDangKyLayout.setHorizontalGroup(
            pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangKyLayout.createSequentialGroup()
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lbDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDangKyLayout.createSequentialGroup()
                                .addComponent(lbMatKhauAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatKhauAgain)))
                            .addGroup(pnDangKyLayout.createSequentialGroup()
                                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnDangKyLayout.createSequentialGroup()
                                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(txtMatKhau))))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnDangKyLayout.setVerticalGroup(
            pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangKyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addComponent(lbHo)
                        .addGap(29, 29, 29)
                        .addComponent(lbTen))
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhauAgain)
                    .addComponent(txtMatKhauAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(pnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        kiemtraHopLe(txtHo, txtTen, txtEmail, txtMatKhau, txtMatKhauAgain, this);
    }//GEN-LAST:event_btnSignUpActionPerformed

    public static void kiemtraHopLe(JTextField txtHo, JTextField txtTen, JTextField txtEmail, JTextField txtMatKhau, JTextField txtMatKhauAgain, JFrame pnDangKy) {
        try {
            String ho = txtHo.getText();
            String ten = txtTen.getText();
            String matKhauagain = txtMatKhauAgain.getText();
            String email = txtEmail.getText();
            String matKhau = txtMatKhau.getText();
            String thongBaoLoi = "";

            if (kiemtraTrongInput(ho)) {
                thongBaoLoi += "Họ không được để trống\n";
            }
            if (kiemtraTrongInput(ten)) {
                thongBaoLoi += "Tên không được để trống\n";
            }
            if (kiemtraTrongInput(matKhauagain)) {
                thongBaoLoi += "Mật khẩu nhập lại không được để trống\n";
            }
            if (kiemtraTrongInput(matKhau)) {
                thongBaoLoi += "Mật khẩu không được để trống\n";
            }
            if (kiemtraTrongInput(email)) {
                thongBaoLoi += "Email không được để trống\n";
            } else if (!kiemtraEmail(email)) {
                JOptionPane.showMessageDialog(null, "Email không hợp lệ");
                return;
            }
            if (!matKhau.equals(matKhauagain)) {
                thongBaoLoi += "Mật khẩu và mật khẩu nhập lại phải trùng nhau\n";
            }
            if (!thongBaoLoi.isEmpty()) {
                JOptionPane.showMessageDialog(null, thongBaoLoi.trim());
            } else {
                JOptionPane.showMessageDialog(null, "Đăng kí thành công");
                pnDangKy.dispose();
            }

        } catch (HeadlessException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lbDangKy;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbMatKhauAgain;
    private javax.swing.JLabel lbTen;
    private javax.swing.JPanel pnDangKy;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauAgain;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
