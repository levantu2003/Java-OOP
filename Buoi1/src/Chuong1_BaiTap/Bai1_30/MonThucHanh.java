package Chuong1_BaiTap.Bai1_30;


import java.util.ArrayList;
import java.util.Scanner;

public class MonThucHanh extends MonHoc {
    private ArrayList<Double> diemKiemTra = new ArrayList<>();

    public MonThucHanh(String maMonHoc, String tenMonHoc, int soTinChi, ArrayList<Double> diemKiemTra) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.diemKiemTra = diemKiemTra;
    }

    @Override
    public double tinhDiemTrungBinh() {
        if (diemKiemTra.isEmpty()) return 0;

        double sum = 0;
        for (double diem : diemKiemTra) {
            sum += diem;
        }

        return sum / diemKiemTra.size();
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập số lượng bài kiểm tra: ");
        int soLuong = scanner.nextInt();

        System.out.println("Nhập điểm cho từng bài kiểm tra:");
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Bài kiểm tra " + (i + 1) + ": ");
            diemKiemTra.add(scanner.nextDouble());
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Điểm kiểm tra: " + diemKiemTra);
    }
}


