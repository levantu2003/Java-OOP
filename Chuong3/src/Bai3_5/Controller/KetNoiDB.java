/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kaiser
 */
public class KetNoiDB {

    public static Connection ketnoiCSDL() {
        Connection con = null;
        try {
            System.out.println("Khoi chay driver...");
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);

            System.out.println("Dang ket noi...");
            String user = "sa";
            String pass = "123";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=false;encrypt=false;trustServerCertificate=true;";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi thanh cong");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
