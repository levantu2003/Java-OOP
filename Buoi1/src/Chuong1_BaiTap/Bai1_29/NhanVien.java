package Chuong1_BaiTap.Bai1_29;

public abstract class NhanVien {
    private String hoTen;
    private int namVaoLam;
    private float luongCoBan;

    public NhanVien(String hoTen, int namVaoLam, float luongCoBan) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public abstract float tinhLuong();

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + "\nNăm vào làm: " + namVaoLam + "\nLương cơ bản: " + luongCoBan;
    }
}
