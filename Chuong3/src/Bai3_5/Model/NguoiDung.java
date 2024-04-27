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
public class NguoiDung {

    private int ND_ID;
    private String TenDangNhap;
    private String MatKhau;
    private String HoTen;
    private String Email;
    private String DiaChi;
    private Date NgaySinh;
    private String GioiTinh;

    public NguoiDung() {
    }

    public NguoiDung(int ND_ID, String TenDangNhap, String MatKhau, String HoTen, String Email, String DiaChi, Date NgaySinh, String GioiTinh) {
        this.ND_ID = ND_ID;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    public int getND_ID() {
        return ND_ID;
    }

    public void setND_ID(int ND_ID) {
        this.ND_ID = ND_ID;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

}
