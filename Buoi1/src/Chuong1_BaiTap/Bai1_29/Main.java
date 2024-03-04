package Chuong1_BaiTap.Bai1_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<NhanVien> danhSachNhanVien = new ArrayList<>();

        danhSachNhanVien.add(new NhanVienVanPhong("Nguyễn Văn A", 2020, 1490000, 22, 500000));
        danhSachNhanVien.add(new NhanVienVanPhong("Trần Thị B", 2021, 1490000, 25, 300000));

        danhSachNhanVien.add(new NhanVienSanXuat("Lê Văn C", 2022, 1490000, 100));
        danhSachNhanVien.add(new NhanVienSanXuat("Phạm Thị D", 2023, 1490000, 120));

        danhSachNhanVien.add(new NhanVienQuanLy("Đặng Văn E", 2020, 1490000, 2.5f, 1000000));
        danhSachNhanVien.add(new NhanVienQuanLy("Trương Thị F", 2021, 1490000, 3.0f, 1500000));

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Xuất thông tin nhân viên");
            System.out.println("3. Tính lương");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    themNhanVien(danhSachNhanVien, scanner);
                    break;
                case 2:
                    xuatThongTinNhanVien(danhSachNhanVien);
                    break;
                case 3:
                    tinhLuong(danhSachNhanVien);
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void themNhanVien(List<NhanVien> danhSachNhanVien, Scanner scanner) {
        System.out.println("Nhập loại nhân viên (1 - Văn phòng, 2 - Sản xuất, 3 - Quản lý): ");
        int loaiNhanVien = scanner.nextInt();

        // Nhập thông tin chung
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nhập năm vào làm: ");
        int namVaoLam = scanner.nextInt();

        System.out.print("Nhập lương cơ bản: ");
        float luongCoBan = scanner.nextFloat();

        // Nhập thông tin riêng theo loại nhân viên
        switch (loaiNhanVien) {
            case 1:
                System.out.print("Nhập số ngày nghỉ phép: ");
                int soNgayNghiPhep = scanner.nextInt();

                System.out.print("Nhập phụ cấp: ");
                float phuCap = scanner.nextFloat();

                danhSachNhanVien.add(new NhanVienVanPhong(hoTen, namVaoLam, luongCoBan, soNgayNghiPhep, phuCap));
                break;
            case 2:
                System.out.print("Nhập số sản phẩm: ");
                int soSanPham = scanner.nextInt();

                danhSachNhanVien.add(new NhanVienSanXuat(hoTen, namVaoLam, luongCoBan, soSanPham));
                break;
            case 3:
                System.out.print("Nhập hệ số chức vụ: ");
                float heSoChucVu = scanner.nextFloat();

                System.out.print("Nhập thưởng: ");
                float thuong = scanner.nextFloat();

                danhSachNhanVien.add(new NhanVienQuanLy(hoTen, namVaoLam, luongCoBan, heSoChucVu, thuong));
                break;
            default:
                System.out.println("Loại nhân viên không hợp lệ!");
        }
    }

    private static void xuatThongTinNhanVien(List<NhanVien> danhSachNhanVien) {
        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien.toString());
        }
    }

    private static void tinhLuong(List<NhanVien> danhSachNhanVien) {
        float tongLuongCongTy = 0;
        float tongLuongVanPhong = 0;
        float tongLuongSanXuat = 0;
        float tongLuongQuanLy = 0;

        for (NhanVien nhanVien : danhSachNhanVien) {
            float luong = nhanVien.tinhLuong();
            System.out.println(nhanVien + "\nLương: " + luong);

            tongLuongCongTy += luong;

            switch (nhanVien.getClass().getSimpleName()) {
                case "NhanVienVanPhong":
                    tongLuongVanPhong += luong;
                    break;
                case "NhanVienSanXuat":
                    tongLuongSanXuat += luong;
                    break;
                case "NhanVienQuanLy":
                    tongLuongQuanLy += luong;
                    break;
            }

        }

        System.out.println("\nTổng lương công ty: " + tongLuongCongTy);
        System.out.println("Tổng lương nhân viên văn phòng: " + tongLuongVanPhong);
        System.out.println("Tổng lương nhân viên sản xuất: " + tongLuongSanXuat);
        System.out.println("Tổng lương nhân viên quản lý: " + tongLuongQuanLy);
    }
}