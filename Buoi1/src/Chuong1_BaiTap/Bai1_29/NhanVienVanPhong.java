package Chuong1_BaiTap.Bai1_29;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;
    private float troCap;

    public NhanVienVanPhong(String hoTen, int namVaoLam, float luongCoBan, int soNgayLamViec, float troCap) {
        super(hoTen, namVaoLam, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
        this.troCap = troCap;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public float getTroCap() {
        return troCap;
    }

    public void setTroCap(float troCap) {
        this.troCap = troCap;
    }

    @Override
    public float tinhLuong() {
        return getLuongCoBan() + soNgayLamViec * 100000 + troCap;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSố ngày làm việc: " + soNgayLamViec + "\nTrợ cấp: " + troCap + "\nLương: " + tinhLuong();
    }
}

