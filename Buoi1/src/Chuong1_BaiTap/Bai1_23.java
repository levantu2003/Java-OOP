package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_23 {
    static int[][] mang2C;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n================================ĐỀ BÀI=======================================");
            System.out.println("1. Nhập giá trị cho mxn phần tử của mảng từ bàn phím (m <= 50, n <= 100)");
            System.out.println("2. Phát sinh giá trị ngẫu nhiên từ -99 đến 99 cho mxn phần tử của mảng (n <= 100)");
            System.out.println("3. Xuất giá trị các phần tử ra màn hình");
            System.out.println("4. Tính tổng giá trị các số lẻ");
            System.out.println("5. Tính tổng các giá trị dương trên dòng k cho trước");
            System.out.println("6. Đếm số lượng số dương");
            System.out.println("7. Đếm số lượng số nguyên tố trên một dòng của ma trận");
            System.out.println("8. Kiểm tra ma trận có tồn tại số âm hay không");
            System.out.println("9. Kiểm tra các phần tử trên dòng k cho trước có tăng dần từ trái qua phải hay không");
            System.out.println("10. Liệt kê dòng có chứa số nguyên tố");
            System.out.println("11. Liệt kê dòng chứa toàn giá trị chẵn");
            System.out.println("0. Thoát");
            System.out.print("Nhap so: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    nhapMaTran();
                    break;
                case 2:
                    phatSinhNgauNhien();
                    break;
                case 3:
                    xuatMaTran();
                    break;
                case 4:
                    tinhTongSoLe();
                    break;
                case 5:
                    tinhTongDuongDongK();
                    break;
                case 6:
                    demSoLuongDuong();
                    break;
                case 7:
                    demSoLuongNguyenToDong();
                    break;
                case 8:
                    kiemTraTonTaiSoAm();
                    break;
                case 9:
                    kiemTraTangDanDongK();
                    break;
                case 10:
                    lietKeDongChuaNguyenTo();
                    break;
                case 11:
                    lietKeDongChuaGiaTriChan();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (chon != 0);
    }

    public static void nhapMaTran() {
        System.out.print("Nhập số hàng: ");
        int m = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int n = sc.nextInt();

        mang2C = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                mang2C[i][j] = sc.nextInt();
            }
        }
    }

    public static void phatSinhNgauNhien() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng. Vui lòng nhập mảng trước.");
            return;
        }

        for (int i = 0; i < mang2C.length; i++) {
            for (int j = 0; j < mang2C[i].length; j++) {
                mang2C[i][j] = (int) (Math.random() * 199 - 99);
            }
        }

        System.out.println("Phát sinh giá trị ngẫu nhiên thành công");
    }

    public static void xuatMaTran() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        for (int[] ints : mang2C) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void tinhTongSoLe() {
        // Kiểm tra xem đã nhập mảng chưa
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        int tongSoLe = 0;
        for (int[] ints : mang2C) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    tongSoLe += anInt;
                }
            }
        }

        System.out.println("Tổng giá trị số lẻ của mảng là: " + tongSoLe);
    }

    public static void tinhTongDuongDongK() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        System.out.print("Nhập dòng k cần tính tổng: ");
        int k = sc.nextInt();

        if (k < 0 || k >= mang2C.length) {
            System.out.println("Dòng k không hợp lệ. Vui lòng nhập lại!");
            return;
        }

        int tongDuongDongK = 0;
        for (int j = 0; j < mang2C[k].length; j++) {
            if (mang2C[k][j] > 0) {
                tongDuongDongK += mang2C[k][j];
            }
        }

        System.out.println("Tổng giá trị trên dòng " + k + " là: " + tongDuongDongK);
    }

    public static void demSoLuongDuong() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        int demDuong = 0;
        for (int[] ints : mang2C) {
            for (int anInt : ints) {
                if (anInt > 0) {
                    demDuong++;
                }
            }
        }

        System.out.println("Số lượng số dương trong mảng là: " + demDuong);
    }

    public static void demSoLuongNguyenToDong() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        System.out.print("Nhập dòng cần kiểm tra: ");
        int dong = sc.nextInt();

        if (dong < 0 || dong >= mang2C.length) {
            System.out.println("Dòng không hợp lệ. Vui lòng nhập lại!");
            return;
        }

        int demNguyenTo = 0;
        for (int j = 0; j < mang2C[dong].length; j++) {
            if (isNguyenTo(mang2C[dong][j])) {
                demNguyenTo++;
            }
        }

        System.out.println("Số lượng số nguyên tố trên " + dong + " là: " + demNguyenTo);
    }

    public static boolean isNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void kiemTraTonTaiSoAm() {
        // Kiểm tra xem đã nhập mảng chưa
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        boolean tonTaiSoAm = false;
        for (int[] ints : mang2C) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    tonTaiSoAm = true;
                    break;
                }
            }
            if (tonTaiSoAm) {
                break;
            }
        }

        if (tonTaiSoAm) {
            System.out.println("Ma trận có tồn tại số âm");
        } else {
            System.out.println("Ma trận không có tồn tại số âm");
        }
    }

    public static void kiemTraTangDanDongK() {

        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        System.out.print("Nhập dòng k cần kiểm tra: ");
        int dong = sc.nextInt();


        if (dong < 0 || dong >= mang2C.length) {
            System.out.println("Dòng không hợp lệ. Vui lòng nhập lại");
            return;
        }

        boolean tangDan = true;
        for (int j = 1; j < mang2C[dong].length; j++) {
            if (mang2C[dong][j] < mang2C[dong][j - 1]) {
                tangDan = false;
                break;
            }
        }

        if (tangDan) {
            System.out.println("Các phần tử trên dòng " + dong + " tăng dần.");
        } else {
            System.out.println("Các phần tử trên dòng " + dong + " không tăng dần.");
        }
    }

    public static boolean kiemTraDongChuaNguyenTo(int dong) {
        for (int j = 0; j < mang2C[dong].length; j++) {
            if (isNguyenTo(mang2C[dong][j])) {
                return true;
            }
        }
        return false;
    }

    public static void lietKeDongChuaNguyenTo() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        System.out.println("Cac dong chua so nguyen to la:");
        for (int i = 0; i < mang2C.length; i++) {
            if (kiemTraDongChuaNguyenTo(i)) {
                System.out.println("Dong " + i);
            }
        }
    }

    public static void lietKeDongChuaGiaTriChan() {
        if (mang2C == null) {
            System.out.println("Chưa nhập mảng hoặc mảng trống. Vui lòng kiểm tra lại.");
            return;
        }

        System.out.println("Các dòng chứa giá trị chẵn là:");
        for (int i = 0; i < mang2C.length; i++) {
            if (kiemTraDongChuaGiaTriChan(i)) {
                System.out.println("Dòng: " + i);
            }
        }
    }

    public static boolean kiemTraDongChuaGiaTriChan(int dong) {
        for (int j = 0; j < mang2C[dong].length; j++) {
            if (mang2C[dong][j] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}