/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Model;

/**
 *
 * @author Kaiser
 */
public class ChiTietPhieuNhapSach {

    private int CTPNS_ID;
    private int IDPhieuNhapSach;
    private int IDSach;
    private int SoLuong;
    private float DonGia;

    public ChiTietPhieuNhapSach() {
    }

    public ChiTietPhieuNhapSach(int CTPNS_ID, int IDPhieuNhapSach, int IDSach, int SoLuong, float DonGia) {
        this.CTPNS_ID = CTPNS_ID;
        this.IDPhieuNhapSach = IDPhieuNhapSach;
        this.IDSach = IDSach;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public int getCTPNS_ID() {
        return CTPNS_ID;
    }

    public void setCTPNS_ID(int CTPNS_ID) {
        this.CTPNS_ID = CTPNS_ID;
    }

    public int getIDPhieuNhapSach() {
        return IDPhieuNhapSach;
    }

    public void setIDPhieuNhapSach(int IDPhieuNhapSach) {
        this.IDPhieuNhapSach = IDPhieuNhapSach;
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

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

}
