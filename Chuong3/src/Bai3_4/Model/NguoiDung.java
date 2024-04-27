/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_4.Model;

/**
 *
 * @author Kaiser
 */
public class NguoiDung {

    private String maND;
    private String tenND;
    private String matKhau;
    private int vaitro;

    public NguoiDung() {
    }

    public NguoiDung(String maND, String tenND, String matKhau, int vaitro) {
        this.maND = maND;
        this.tenND = tenND;
        this.matKhau = matKhau;
        this.vaitro = vaitro;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getVaitro() {
        return vaitro;
    }

    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "maND=" + maND + ", tenND=" + tenND + ", matKhau=" + matKhau + ", vaitro=" + vaitro + '}';
    }
}
