/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chuong2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Kaiser
 */
public class Bai2_4 extends javax.swing.JFrame {

    /**
     * Creates new form Bai2_4
     */
    private double operand1;
    private double operand2;
    private char operator;
    private boolean newNumber = true;
    private char currentOperator;
    private String expression = "";
    private double result;

    public Bai2_4() {
        initComponents();
        setTitle("Máy tính");
        setLocationRelativeTo(null);

        // Khởi tạo các nút số
        JButton[] numberButtons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        for (int i = 0; i < numberButtons.length; i++) {
            addNumberButtonListener(numberButtons[i], String.valueOf(i));
        }

        // Khởi tạo các nút toán tử
        JButton[] operationButtons = {btnCong, btnTru, btnNhan, btnChia, btnChiaDu};

        for (JButton button : operationButtons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!newNumber) {
                        currentOperator = getOperator(button);
                        operand1 = Double.parseDouble(txtKQ.getText()); // Lưu số hiện tại trước khi nhập toán tử
                        operator = currentOperator; // Lưu toán tử
                        expression += currentOperator;
                        txtKQ.setText("");
                        newNumber = true;
                    }
                }
            });
        }

        // Nút clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearDisplay();
            }
        });

        //Nút chuyển âm/dương
        btnAmDuong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chuyenDau();
            }
        });

        // Nút lấy căn bậc 2
        btnSQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number;
                try {
                    number = Double.parseDouble(txtKQ.getText());
                    if (number < 0) {
                        txtKQ.setText("Không tính được căn bậc hai của số âm");
                    } else {
                        double result = Math.sqrt(number);
                        txtKQ.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    txtKQ.setText("Định dạng số không hợp lệ");
                }
            }
        });

        // Nút lấy nghịch đảo số
        btnPS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number;
                try {
                    number = Double.parseDouble(txtKQ.getText());
                    if (number == 0) {
                        txtKQ.setText("Chia cho 0");
                    } else {
                        double result = 1 / number;
                        txtKQ.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    txtKQ.setText("Định dạng số không hợp lệ");
                }
            }
        });

        // Nút show kết quả phép tính
        btnKetQua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!newNumber) {
                    operand2 = Double.parseDouble(txtKQ.getText());
                    calculateResult();
                    txtKQ.setText(String.valueOf(result));
                    newNumber = true;
                }
            }
        });

    }

    // Hàm update display
    private void addNumberButtonListener(JButton button, final String number) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDisplay(number);
            }
        });
    }

    private void updateDisplay(String text) {
        if (!newNumber) {
            String currentText = txtKQ.getText();
            txtKQ.setText(currentText + text);
        } else {
            txtKQ.setText(text);
            newNumber = false;
        }
    }

    private void clearDisplay() {
        txtKQ.setText("0");
        operand1 = 0;
        operator = ' ';
        newNumber = true;
    }

    private void chuyenDau() {
        String currentText = txtKQ.getText();
        if (currentText.isEmpty()) {
            return;
        }

        if (currentText.charAt(0) == '-') {
            txtKQ.setText(currentText.substring(1));
        } else {
            txtKQ.setText('-' + currentText);
        }
    }

    private void calculateResult() {
        operand2 = Double.parseDouble(txtKQ.getText());
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    txtKQ.setText("Lỗi: Chia cho 0");
                    return;
                }
                result = operand1 / operand2;
                break;
            case '%':
                result = operand1 % operand2;
                break;
        }
        operand1 = result;
        newNumber = true;
    }

    private char getOperator(JButton button) {
        if (button == btnCong) {
            return '+';
        } else if (button == btnTru) {
            return '-';
        } else if (button == btnNhan) {
            return '*';
        } else if (button == btnChia) {
            return '/';
        } else if (button == btnChiaDu) {
            return '%';
        }
        return ' '; // Lỗi nếu không xác định được button
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKQ = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnSQRT = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnChiaDu = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnPS = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnAmDuong = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnKetQua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtKQ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtKQ.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKQ.setText("0");

        jPanel1.setLayout(new java.awt.GridLayout(4, 5));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn1.setText("1");
        jPanel1.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn2.setText("2");
        jPanel1.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn3.setText("3");
        jPanel1.add(btn3);

        btnChia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChia.setText("/");
        jPanel1.add(btnChia);

        btnSQRT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSQRT.setText("sqrt");
        jPanel1.add(btnSQRT);

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn4.setText("4");
        jPanel1.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn5.setText("5");
        jPanel1.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn6.setText("6");
        jPanel1.add(btn6);

        btnNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNhan.setText("*");
        jPanel1.add(btnNhan);

        btnChiaDu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChiaDu.setText("%");
        jPanel1.add(btnChiaDu);

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn7.setText("7");
        jPanel1.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn8.setText("8");
        jPanel1.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn9.setText("9");
        jPanel1.add(btn9);

        btnTru.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTru.setText("-");
        jPanel1.add(btnTru);

        btnPS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPS.setText("1/x");
        jPanel1.add(btnPS);

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn0.setText("0");
        jPanel1.add(btn0);

        btnAmDuong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAmDuong.setText("+/-");
        jPanel1.add(btnAmDuong);

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);

        btnCong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel1.add(btnCong);

        btnKetQua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKetQua.setText("=");
        jPanel1.add(btnKetQua);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKQ)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Bai2_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAmDuong;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnChiaDu;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnKetQua;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPS;
    private javax.swing.JButton btnSQRT;
    private javax.swing.JButton btnTru;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtKQ;
    // End of variables declaration//GEN-END:variables
}
