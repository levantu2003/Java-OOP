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
public class PhieuNhapSach {

    private int PNS_ID;
    private String GhiChu;
    private Date Ngay;
    private String NhanVien;

    public PhieuNhapSach() {
    }

    public PhieuNhapSach(int PNS_ID, String GhiChu, Date Ngay, String NhanVien) {
        this.PNS_ID = PNS_ID;
        this.GhiChu = GhiChu;
        this.Ngay = Ngay;
        this.NhanVien = NhanVien;
    }

    public int getPNS_ID() {
        return PNS_ID;
    }

    public void setPNS_ID(int PNS_ID) {
        this.PNS_ID = PNS_ID;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
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

}
