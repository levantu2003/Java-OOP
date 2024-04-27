/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Controller;

import Bai3_5.Model.LoaiSach;
import Bai3_5.Model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class DBController {

    Connection con = KetNoiDB.ketnoiCSDL();

    public NguoiDung dangNhap(String tendn, String password) {
        NguoiDung nd = null;

        try {
            String sql = "Select * from NguoiDung where TenDangNhap = ? and MatKhau=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, tendn);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new NguoiDung();
                nd.setND_ID(rs.getInt("ND_ID"));
                nd.setTenDangNhap(rs.getString("TenDangNhap"));
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setHoTen(rs.getString("HoTen"));
                nd.setEmail(rs.getString("Email"));
                nd.setDiaChi(rs.getString("DiaChi"));
                nd.setNgaySinh(rs.getDate("NgaySinh"));
                nd.setGioiTinh(rs.getString("GioiTinh"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }

    public List<LoaiSach> listLoaiSach() {
        List<LoaiSach> listLS = new ArrayList<>();
        try {
            String sql = "Select * from LoaiSach";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                LoaiSach ls = new LoaiSach();
                ls.setLS_ID(rs.getInt("LS_ID"));
                ls.setMoTa(rs.getString("Ten"));
                ls.setTen(rs.getString("MoTa"));
                listLS.add(ls);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLS;
    }

    public boolean insertLoaiSach(LoaiSach loaiSach) {
        String sql = "INSERT INTO LoaiSach(Ten, MoTa) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, loaiSach.getTen());
            ps.setString(2, loaiSach.getMoTa());

            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateLoaiSach(LoaiSach loaiSach) {
        try {
            String sql = "UPDATE LoaiSach SET Ten = ?, MoTa = ? WHERE LS_ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, loaiSach.getTen());
            ps.setString(2, loaiSach.getMoTa());
            ps.setInt(3, loaiSach.getLS_ID());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deleteLoaiSach(int id) {
        try {
            String sql = "DELETE FROM LoaiSach WHERE LS_ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
