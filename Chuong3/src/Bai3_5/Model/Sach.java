/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_5.Model;

/**
 *
 * @author Kaiser
 */
public class Sach {

    private int S_ID;
    private String TieuDe;
    private String TacGia;
    private int NamXuatBan;
    private int TheLoai;
    private String MoTa;

    public Sach() {
    }

    public Sach(int S_ID, String TieuDe, String TacGia, int NamXuatBan, int TheLoai, String MoTa) {
        this.S_ID = S_ID;
        this.TieuDe = TieuDe;
        this.TacGia = TacGia;
        this.NamXuatBan = NamXuatBan;
        this.TheLoai = TheLoai;
        this.MoTa = MoTa;
    }

    public int getS_ID() {
        return S_ID;
    }

    public void setS_ID(int S_ID) {
        this.S_ID = S_ID;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public int getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(int TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

}
