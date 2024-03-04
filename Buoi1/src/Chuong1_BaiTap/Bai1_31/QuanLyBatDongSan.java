package Chuong1_BaiTap.Bai1_31;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyBatDongSan {
    public static void main(String[] args) {
        ArrayList<BatDongSan> danhSachBatDongSan = new ArrayList<>();

        danhSachBatDongSan.add(new DatTrong("DT001", 10, 20));
        danhSachBatDongSan.add(new NhaO("NO001", 15, 25, 2));
        danhSachBatDongSan.add(new KhachSan("KS001", 12, 18, 3));
        danhSachBatDongSan.add(new BietThu("BT001", 30, 40));

        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm đất trống");
            System.out.println("2. Thêm nhà ở");
            System.out.println("3. Thêm khách sạn");
            System.out.println("4. Thêm biệt thự");
            System.out.println("5. Hiển thị thông tin và giá bán");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    themDatTrong(scanner, danhSachBatDongSan);
                    break;
                case 2:
                    themNhaO(scanner, danhSachBatDongSan);
                    break;
                case 3:
                    themKhachSan(scanner, danhSachBatDongSan);
                    break;
                case 4:
                    themBietThu(scanner, danhSachBatDongSan);
                    break;
                case 5:
                    hienThiThongTinVaTinhGiaBan(danhSachBatDongSan);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (luaChon != 0);
    }

    private static void themDatTrong(Scanner scanner, ArrayList<BatDongSan> danhSachBatDongSan) {
        System.out.print("Nhập mã số: ");
        String maSo = scanner.next();
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        BatDongSan datTrong = new DatTrong(maSo, chieuDai, chieuRong);
        danhSachBatDongSan.add(datTrong);
        System.out.println("Thêm đất trống thành công!");
    }

    private static void themNhaO(Scanner scanner, ArrayList<BatDongSan> danhSachBatDongSan) {
        System.out.print("Nhập mã số: ");
        String maSo = scanner.next();
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();
        System.out.print("Nhập số lầu: ");
        int soLau = scanner.nextInt();

        BatDongSan nhaO = new NhaO(maSo, chieuDai, chieuRong, soLau);
        danhSachBatDongSan.add(nhaO);
        System.out.println("Thêm nhà ở thành công!");
    }

    private static void themKhachSan(Scanner scanner, ArrayList<BatDongSan> danhSachBatDongSan) {
        System.out.print("Nhập mã số: ");
        String maSo = scanner.next();
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();
        System.out.print("Nhập số sao: ");
        int soSao = scanner.nextInt();

        BatDongSan khachSan = new KhachSan(maSo, chieuDai, chieuRong, soSao);
        danhSachBatDongSan.add(khachSan);
        System.out.println("Thêm khách sạn thành công!");
    }

    private static void themBietThu(Scanner scanner, ArrayList<BatDongSan> danhSachBatDongSan) {
        System.out.print("Nhập mã số: ");
        String maSo = scanner.next();
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        BatDongSan bietThu = new BietThu(maSo, chieuDai, chieuRong);
        danhSachBatDongSan.add(bietThu);
        System.out.println("Thêm biệt thự thành công!");
    }

    private static void hienThiThongTinVaTinhGiaBan(ArrayList<BatDongSan> danhSachBatDongSan) {
        if (danhSachBatDongSan.isEmpty()) {
            System.out.println("Danh sách bất động sản trống!");
        } else {
            System.out.println("----- Danh sách bất động sản -----");
            for (BatDongSan batDongSan : danhSachBatDongSan) {
                batDongSan.hienThiThongTin();
                System.out.println("Giá bán: " + batDongSan.tinhGiaBan());
                System.out.println("-----------------------------");
            }
        }
    }
}
