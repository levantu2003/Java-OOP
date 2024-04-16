/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_2.Model;

/**
 *
 * @author Kaiser
 */
public class CD {

    private String ma;
    private String tieuDe;
    private String loai;
    private int namXB;

    public CD() {
    }

    public CD(String ma, String tieuDe, String loai, int namXB) {
        this.ma = ma;
        this.tieuDe = tieuDe;
        this.loai = loai;
        this.namXB = namXB;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

}
