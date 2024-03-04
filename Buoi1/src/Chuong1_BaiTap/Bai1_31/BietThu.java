package Chuong1_BaiTap.Bai1_31;

public class BietThu extends BatDongSan {
    public BietThu(String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
    }

    @Override
    public double tinhGiaBan() {
        return chieuDai * chieuRong * 400000;
    }
}

