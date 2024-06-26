/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_2.Controller;

import Bai3_2.Model.CD;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;

/**
 *
 * @author Kaiser
 */
public class CDController {

    public List<CD> docTatCaCD() {
        List<CD> list = new ArrayList<>();
        try {
            String sql = "Select * from CDDVDCollection";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                CD cd = new CD();
                cd.setMa(rs.getString(1));
                cd.setTieuDe(rs.getString(2));
                cd.setLoai(rs.getString(3));
                cd.setNamXB(Integer.parseInt(rs.getString(4)));
                list.add(cd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int themSanPham(CD cd) {
        try {
            String sql = "Insert into CDDVDCollection values(?,?,?,?)";
            Connection con = KetNoiCSDL.ketnoiCSDL();
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

    public int suaSanPham(CD cd) {
        try {
            String sql = "Update CDDVDCollection set TieuDe = ?, LoaiDia = ?, NamXB = ? Where Ma = ?";
            Connection con = KetNoiCSDL.ketnoiCSDL();
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

    public int xoaSanPham(String maSP) {
        try {
            String sql = "Delete CDDVDCollection Where Ma = ?";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maSP);
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public List<CD> timTheoMa(String ma) {
        List<CD> listCD = new ArrayList<>();
        try {
            String sql = "Select * from CDDVDCollection Where Ma = ?";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            listCD.clear();
            while (rs.next()) {
                CD cd = new CD();
                cd.setMa(rs.getString(1));
                cd.setTieuDe(rs.getString(2));
                cd.setLoai(rs.getString(3));
                cd.setNamXB(Integer.parseInt(rs.getString(4)));
                listCD.add(cd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCD;
    }

    public List<CD> proc_showALL() {
        List<CD> list = new ArrayList<>();
        try {
            String sql = "{call sp_LietKeAllCDDVD}";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            CallableStatement cstm = con.prepareCall(sql);
            ResultSet rs = cstm.executeQuery();

            while (rs.next()) {
                CD cd = new CD();
                cd.setMa(rs.getString("Ma"));
                cd.setTieuDe(rs.getString("TieuDe"));
                cd.setLoai(rs.getString("LoaiDia"));
                cd.setNamXB(rs.getInt("NamXB"));
                list.add(cd);
            }

            rs.close();
            cstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<CD> proc_showAllTheoNam(int namXB) {
        List<CD> list = new ArrayList<>();
        try {
            String sql = "{call sp_LietKeAllCDDVDTheoNam(?)}";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setInt(1, namXB);
            ResultSet rs = cstm.executeQuery();

            while (rs.next()) {
                CD cd = new CD();
                cd.setMa(rs.getString("Ma"));
                cd.setTieuDe(rs.getString("TieuDe"));
                cd.setLoai(rs.getString("LoaiDia"));
                cd.setNamXB(rs.getInt("NamXB"));
                list.add(cd);
            }

            rs.close();
            cstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<CD> proc_showAllheoNamVaTheLoai(int namXB, String loaiDia) {
        List<CD> list = new ArrayList<>();
        try {
            String sql = "{call sp_LietKeAllCDDVDTheoNamVaTheLoai(?, ?)}";
            Connection con = KetNoiCSDL.ketnoiCSDL();
            CallableStatement cstm = con.prepareCall(sql);
            cstm.setInt(1, namXB);
            cstm.setString(2, loaiDia);
            ResultSet rs = cstm.executeQuery();

            while (rs.next()) {
                CD cd = new CD();
                cd.setMa(rs.getString("Ma"));
                cd.setTieuDe(rs.getString("TieuDe"));
                cd.setLoai(rs.getString("LoaiDia"));
                cd.setNamXB(rs.getInt("NamXB"));
                list.add(cd);
            }
            rs.close();
            cstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
