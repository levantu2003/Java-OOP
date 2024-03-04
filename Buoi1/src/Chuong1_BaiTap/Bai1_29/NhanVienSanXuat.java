package Chuong1_BaiTap.Bai1_29;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    public NhanVienSanXuat(String hoTen, int namVaoLam, float luongCoBan, int soSanPham) {
        super(hoTen, namVaoLam, luongCoBan);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public float tinhLuong() {
        return getLuongCoBan() + soSanPham * 2000;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSố sản phẩm: " + soSanPham + "\nLương: " + tinhLuong();
    }
}
