package Chuong1_BaiTap.Bai1_25;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class SDPhanSo {

    public static void taoVaHienThiPhanSo() {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.print("Phân số a: ");
        a.hienThiPhanSo();
        System.out.print("Phân số b: ");
        b.hienThiPhanSo();
    }

    public static void hienThiNghichDaoPhanSoX() {
        PhanSo x = new PhanSo(1, 1); // Giá trị mặc định, cần nhập từ bàn phím
        x.nhapPhanSo();
        PhanSo nghichDaoX = x.phanSoNghichDao();
        System.out.print("Phân số nghịch đảo của x: ");
        nghichDaoX.hienThiPhanSo();
    }

    public static void tinhTongXY() {
        PhanSo x = new PhanSo(1, 1);
        PhanSo y = new PhanSo(1, 1);
        x.nhapPhanSo();
        y.nhapPhanSo();
        PhanSo tongXY = x.cong(y);
        System.out.print("Tổng của x + y: ");
        tongXY.hienThiPhanSo();
    }

    public static PhanSo[] nhapDanhSachPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phân số n: ");
        int n = sc.nextInt();
        PhanSo[] danhSach = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            danhSach[i] = new PhanSo(1, 1); // Khởi tạo giá trị mặc định
            System.out.println("Nhập phân số thứ " + (i + 1) + ":");
            danhSach[i].nhapPhanSo();
        }
        return danhSach;
    }

    public static void tinhTongDanhSachPhanSo(PhanSo[] danhSach) {
        PhanSo tong = new PhanSo(0, 1); // Khởi tạo tổng là phân số 0/1
        for (PhanSo ps : danhSach) {
            tong = tong.cong(ps);
        }
        System.out.print("Tổng của danh sách phân số: ");
        tong.hienThiPhanSo();
    }

    public static void timPhanSoLonNhat(PhanSo[] danhSach) {
        PhanSo max = danhSach[0];
        for (int i = 1; i < danhSach.length; i++) {
            if (danhSach[i].lonHon(max)) {
                max = danhSach[i];
            }
        }
        System.out.print("Phân số lớn nhất trong danh sách: ");
        max.hienThiPhanSo();
    }

    public static void sapXepDanhSachPhanSo(PhanSo[] danhSach) {
        Arrays.sort(danhSach, Comparator.comparingDouble(PhanSo::giaTriThuc));
        System.out.println("Danh sách phân số sau khi sắp xếp:");
        for (PhanSo ps : danhSach) {
            ps.hienThiPhanSo();
        }
    }
}