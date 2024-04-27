/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_4.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Bai3_4.Model.NguoiDung;

/**
 *
 * @author Kaiser
 */
public class NguoiDungController {

    public NguoiDung dangNhap(String tennd, String password) {
        NguoiDung nd = null;

        try {
            Connection con = KetNoiCSDL.ketnoiCSDL();
            String sql = "Select * from NguoiDung where TenND = ? and MatKhau=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, tennd);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new NguoiDung();
                nd.setMaND(rs.getString("MaND"));
                nd.setTenND(rs.getString("TenND"));
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setVaitro(rs.getInt("VaiTro"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }
}
