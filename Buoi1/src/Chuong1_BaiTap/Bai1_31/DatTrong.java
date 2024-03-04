package Chuong1_BaiTap.Bai1_31;

public class DatTrong extends BatDongSan {
    public DatTrong(String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
    }

    @Override
    public double tinhGiaBan() {
        return chieuDai * chieuRong * 10000;
    }
}

