/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Model;

/**
 *
 * @author Kaiser
 */
public class ChiTietHoaDon {

    private int CTHD_ID;
    private int IDHoaDon;
    private int IDSach;
    private int SoLuong;
    private float GiaBan;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int CTHD_ID, int IDHoaDon, int IDSach, int SoLuong, float GiaBan) {
        this.CTHD_ID = CTHD_ID;
        this.IDHoaDon = IDHoaDon;
        this.IDSach = IDSach;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
    }

    public int getCTHD_ID() {
        return CTHD_ID;
    }

    public void setCTHD_ID(int CTHD_ID) {
        this.CTHD_ID = CTHD_ID;
    }

    public int getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(int IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getIDSach() {
        return IDSach;
    }

    public void setIDSach(int IDSach) {
        this.IDSach = IDSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

}
