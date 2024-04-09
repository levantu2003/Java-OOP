/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Kaiser
 */
public class ConnectDB {

    public static void main(String[] args) {
        try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);

            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhachHang;integratedSecurity=false;encrypt=false;trustServerCertificate=true;";
            String user = "sa";
            String password = "123";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong");

            String sql = "Select * From KhachHang";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maKH = rs.getString(1);
                String tenKH = rs.getString(2);
                int namSinh = rs.getInt(3);
                String maNhom = rs.getString(4);
                System.out.println(maKH + " - " + tenKH + " - " + namSinh + " - " + maNhom);
            }

            String sqlInsert = "Insert into KhachHang values('KH07','Phuc',2000,'N3')";
            st.execute(sqlInsert);
            System.out.println("THêm dữ liệu thành công");

            String sqlUpdate = "Update KhachHang SET TenKH = N'Lê Phúc', NamSinh = 1990 WHERE MaKH = 'KH9'";
            st.execute(sqlUpdate);
            System.out.println("Cập nhật thành công");

            String sqlDelete = "DELETE FROM KhachHang WHERE MaKH = 'KH9'";
            st.execute(sqlDelete);
            System.out.println("Xoá thành công");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
