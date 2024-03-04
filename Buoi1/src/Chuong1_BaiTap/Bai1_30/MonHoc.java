package Chuong1_BaiTap.Bai1_30;

import java.util.Scanner;

public abstract class MonHoc {
    protected String maMonHoc;
    protected String tenMonHoc;
    protected int soTinChi;

    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public double tinhDiemTrungBinh() {
        return 0; // Phương thức này sẽ được ghi đè trong các lớp con
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập mã môn học: ");
        maMonHoc = scanner.next();
        System.out.print("Nhập tên môn học: ");
        tenMonHoc = scanner.next();
        System.out.print("Nhập số tín chỉ: ");
        soTinChi = scanner.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Mã môn học: " + maMonHoc);
        System.out.println("Tên môn học: " + tenMonHoc);
        System.out.println("Số tín chỉ: " + soTinChi);
    }
}

