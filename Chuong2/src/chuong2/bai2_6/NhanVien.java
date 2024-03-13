/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.bai2_6;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Kaiser
 */
class NhanVien {

    String MaNV;
    String HoTen;
    String NgayVL;
    String NamSinh;
    String PhongBan;

    public NhanVien() {

    }

    public NhanVien(String MaNV, String HoTen, String NgayVL, String NamSinh, String PhongBan) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.NgayVL = NgayVL;
        this.NamSinh = NamSinh;
        this.PhongBan = PhongBan;
    }
}
