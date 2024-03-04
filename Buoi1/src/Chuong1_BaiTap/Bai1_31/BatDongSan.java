package Chuong1_BaiTap.Bai1_31;

public abstract class BatDongSan {
    protected String maSo;
    protected double chieuDai;
    protected double chieuRong;

    public BatDongSan(String maSo, double chieuDai, double chieuRong) {
        this.maSo = maSo;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public abstract double tinhGiaBan();

    public void hienThiThongTin() {
        System.out.println("Mã số: " + maSo);
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
    }
}


