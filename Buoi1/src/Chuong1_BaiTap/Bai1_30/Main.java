package Chuong1_BaiTap.Bai1_30;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MonHoc> danhSachMonHoc = new ArrayList<>();

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập danh sách môn học");
            System.out.println("2. Xuất danh sách môn học");
            System.out.println("3. Tính điểm trung bình môn học");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSachMonHoc(scanner, danhSachMonHoc);
                    break;
                case 2:
                    xuatDanhSachMonHoc(danhSachMonHoc);
                    break;
                case 3:
                    tinhDiemTrungBinhMonHoc(scanner, danhSachMonHoc);
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai, vui lòng chọn lại.");
            }
        }
    }

    private static void nhapDanhSachMonHoc(Scanner scanner, ArrayList<MonHoc> danhSachMonHoc) {
        System.out.println("----- NHẬP DANH SÁCH MÔN HỌC -----");
        System.out.print("Nhập số lượng môn học: ");
        int soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Chọn loại môn học (1: Lý thuyết, 2: Thực hành, 3: Đồ án): ");
            int loaiMonHoc = scanner.nextInt();

            switch (loaiMonHoc) {
                case 1:
                    MonLyThuyet monLyThuyet = new MonLyThuyet("", "", 0, 0, 0);
                    monLyThuyet.nhapThongTin(scanner);
                    danhSachMonHoc.add(monLyThuyet);
                    break;
                case 2:
                    MonThucHanh monThucHanh = new MonThucHanh("", "", 0, new ArrayList<>());
                    monThucHanh.nhapThongTin(scanner);
                    danhSachMonHoc.add(monThucHanh);
                    break;
                case 3:
                    MonDoAn monDoAn = new MonDoAn("", "", 0, 0, 0);
                    monDoAn.nhapThongTin(scanner);
                    danhSachMonHoc.add(monDoAn);
                    break;
                default:
                    System.out.println("Loại môn học không hợp lệ.");
            }
        }
    }

    private static void xuatDanhSachMonHoc(ArrayList<MonHoc> danhSachMonHoc) {
        System.out.println("----- XUẤT DANH SÁCH MÔN HỌC -----");
        for (MonHoc monHoc : danhSachMonHoc) {
            monHoc.xuatThongTin();
            System.out.println("Điểm trung bình: " + monHoc.tinhDiemTrungBinh());
            System.out.println("------------------------------");
        }
    }

    private static void tinhDiemTrungBinhMonHoc(Scanner scanner, ArrayList<MonHoc> danhSachMonHoc) {
        System.out.println("----- TÍNH ĐIỂM TRUNG BÌNH MÔN HỌC -----");
        System.out.print("Nhập mã môn học cần tính điểm trung bình: ");
        String maMonHocCanTinh = scanner.next();

        for (MonHoc monHoc : danhSachMonHoc) {
            if (monHoc.getMaMonHoc().equals(maMonHocCanTinh)) {
                System.out.println("----- THÔNG TIN MÔN HỌC -----");
                monHoc.xuatThongTin();
                System.out.println("Điểm trung bình: " + monHoc.tinhDiemTrungBinh());
                System.out.println("------------------------------");
                return;
            }
        }

        System.out.println("Không tìm thấy môn học có mã " + maMonHocCanTinh);
    }
}


