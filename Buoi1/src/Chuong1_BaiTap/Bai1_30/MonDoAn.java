package Chuong1_BaiTap.Bai1_30;

import java.util.Scanner;

public class MonDoAn extends MonHoc {
    private double diemGVHD;
    private double diemGVPB;

    public MonDoAn(String maMonHoc, String tenMonHoc, int soTinChi, double diemGVHD, double diemGVPB) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.diemGVHD = diemGVHD;
        this.diemGVPB = diemGVPB;
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (diemGVHD + diemGVPB) / 2;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập điểm GVHD: ");
        diemGVHD = scanner.nextDouble();
        System.out.print("Nhập điểm GVPB: ");
        diemGVPB = scanner.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Điểm GVHD: " + diemGVHD);
        System.out.println("Điểm GVPB: " + diemGVPB);
    }
}

