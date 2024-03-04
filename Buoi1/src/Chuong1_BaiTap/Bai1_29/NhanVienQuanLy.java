package Chuong1_BaiTap.Bai1_29;

public class NhanVienQuanLy extends NhanVien {
    private float heSoChucVu;
    private float thuong;

    public NhanVienQuanLy(String hoTen, int namVaoLam, float luongCoBan, float heSoChucVu, float thuong) {
        super(hoTen, namVaoLam, luongCoBan);
        this.heSoChucVu = heSoChucVu;
        this.thuong = thuong;
    }

    public float getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(float heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    @Override
    public float tinhLuong() {
        return getLuongCoBan() * heSoChucVu + thuong;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHệ số chức vụ: " + heSoChucVu + "\nThưởng: " + thuong + "\nLương: " + tinhLuong();
    }
}


