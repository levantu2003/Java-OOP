/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.students;
import Model.users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class CDController {

    public users dangNhap(String username, String password) {
        users nd = null;

        try {
            Connection con = KetNoiDB.ketnoiCSDL();
            String sql = "Select * from users where username = ? and password=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new users();
                nd.setUsername(rs.getString("username"));
                nd.setPassword(rs.getString("password"));
                nd.setRole(rs.getString("role"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }

    public List<students> docTatCaCD() {
        List<students> list = new ArrayList<>();
        try {
            String sql = "Select * from students";
            Connection con = KetNoiDB.ketnoiCSDL();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                students sv = new students();
                sv.setMasv(rs.getString(1));
                sv.setHoten(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSodt(rs.getString(4));
                sv.setGioitinh(Byte.parseByte(rs.getString(5)));
                sv.setDiachi(rs.getString(6));
                sv.setHinh(rs.getString(7));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int xoaSanPham(String maSP) {
        try {
            String sql = "Delete from students Where masv = ?";
            Connection con = KetNoiDB.ketnoiCSDL();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maSP);
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int suaSanPham(students cd) {
        try {
            String sql = "Update students set tensv = ?, email = ?, sdt = ?, gioitinh = ?, diachi = ?, hinh = ?, Where masv = ?";
            Connection con = KetNoiDB.ketnoiCSDL();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cd.getMa());
            pstm.setString(2, cd.getTieuDe());
            pstm.setString(3, cd.getLoai());
            pstm.setInt(4, cd.getNamXB());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
