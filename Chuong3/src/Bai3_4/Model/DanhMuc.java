/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_4.Model;

/**
 *
 * @author Kaiser
 */
public class DanhMuc {

    private String maDM;
    private String tenDM;
    private int isDelete;

    public DanhMuc() {
    }

    public DanhMuc(String maDM, String tenDM, int isDelete) {
        this.maDM = maDM;
        this.tenDM = tenDM;
        this.isDelete = isDelete;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

}
