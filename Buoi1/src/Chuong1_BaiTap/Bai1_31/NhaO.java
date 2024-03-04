package Chuong1_BaiTap.Bai1_31;

public class NhaO extends BatDongSan {
    private int soLau;

    public NhaO(String maSo, double chieuDai, double chieuRong, int soLau) {
        super(maSo, chieuDai, chieuRong);
        this.soLau = soLau;
    }

    @Override
    public double tinhGiaBan() {
        return chieuDai * chieuRong * 10000 + soLau * 100000;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số lầu: " + soLau);
    }
}

