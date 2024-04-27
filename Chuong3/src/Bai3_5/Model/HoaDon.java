/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Model;

import java.util.Date;

/**
 *
 * @author Kaiser
 */
public class HoaDon {

    private int HD_ID;
    private Date Ngay;
    private String NhanVien;
    private String TenKhachHang;
    private String GhiChu;

    public HoaDon() {
    }

    public HoaDon(int HD_ID, Date Ngay, String NhanVien, String TenKhachHang, String GhiChu) {
        this.HD_ID = HD_ID;
        this.Ngay = Ngay;
        this.NhanVien = NhanVien;
        this.TenKhachHang = TenKhachHang;
        this.GhiChu = GhiChu;
    }

    public int getHD_ID() {
        return HD_ID;
    }

    public void setHD_ID(int HD_ID) {
        this.HD_ID = HD_ID;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public String getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(String NhanVien) {
        this.NhanVien = NhanVien;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
