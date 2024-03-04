package Chuong1_BaiTap.Bai1_30;

import java.util.Scanner;

public class MonLyThuyet extends MonHoc {
    private double diemTieuLuan;
    private double diemCuoiKy;

    public MonLyThuyet(String maMonHoc, String tenMonHoc, int soTinChi, double diemTieuLuan, double diemCuoiKy) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.diemTieuLuan = diemTieuLuan;
        this.diemCuoiKy = diemCuoiKy;
    }

    @Override
    public double tinhDiemTrungBinh() {
        return diemTieuLuan * 0.2 + diemCuoiKy * 0.3;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập điểm tiểu luận: ");
        diemTieuLuan = scanner.nextDouble();
        System.out.print("Nhập điểm cuối kỳ: ");
        diemCuoiKy = scanner.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Điểm tiểu luận: " + diemTieuLuan);
        System.out.println("Điểm cuối kỳ: " + diemCuoiKy);
    }
}


