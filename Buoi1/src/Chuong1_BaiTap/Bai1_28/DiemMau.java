package Chuong1_BaiTap.Bai1_28;

public class DiemMau extends Diem {
    private String mau;

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public void GanMau(String mau) {
        this.mau = mau;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Màu: " + mau);
    }
}
