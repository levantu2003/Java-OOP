package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_22 {
    static int[] mang1C;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n================================ĐỀ BÀI=======================================");
            System.out.println("1. Nhập giá trị cho n phần tử mảng từ bàn phím (n <= 500)");
            System.out.println("2. Phát sinh giá trị ngẫu nhiên từ -199 đến 199 cho n phần tử mảng (n <= 500)");
            System.out.println("3. Xuất mảng ra màn hình");
            System.out.println("4. Liệt kê các giá trị âm có trong mảng");
            System.out.println("5. Liệt kê các số nguyên tố có trong mảng");
            System.out.println("6. Liệt kê các phần tử có giá trị nằm trong đoạn [a, b] cho trước");
            System.out.println("7. Tính tổng giá trị các phần tử là số nguyên tố");
            System.out.println("8. Tính trung bình cộng của các phần tử dương có trong mảng");
            System.out.println("9. Đếm số phần tử có giá trị lớn hơn x cho trước");
            System.out.println("10. Đếm số phần tử có giá trị là số nguyên tố trong mảng");
            System.out.println("11. Kiểm tra mảng có phải là mảng chứa toàn số nguyên tố");
            System.out.println("12. Kiểm tra mảng có phải là mảng tăng dần");
            System.out.println("13. Tìm giá trị lớn nhất trong mảng");
            System.out.println("14. Tìm giá trị nhỏ nhất trong mảng");
            System.out.println("15. Tìm số âm lớn nhất trong mảng");
            System.out.println("16. Đảo ngược mảng");
            System.out.println("0. Thoát");
            System.out.print("Nhap so: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    nhapGiaTriMang();
                    break;
                case 2:
                    phatSinhGiaTriNgauNhien();
                    break;
                case 3:
                    xuatMang();
                    break;
                case 4:
                    lietKeGiaTriAm();
                    break;
                case 5:
                    lietKeSoNguyenTo();
                    break;
                case 6:
                    lietKePhanTuTrongDoan();
                    break;
                case 7:
                    tinhTongSoNguyenTo();
                    break;
                case 8:
                    tinhTrungBinhCongSoDuong();
                    break;
                case 9:
                    demSoPhanTuLonHonX();
                    break;
                case 10:
                    demSoNguyenToTrongMang();
                    break;
                case 11:
                    kiemTraMangToanSoNguyenTo();
                    break;
                case 12:
                    kiemTraMangTangDan();
                    break;
                case 13:
                    timGiaTriLonNhat();
                    break;
                case 14:
                    timGiaTriNhoNhat();
                    break;
                case 15:
                    timSoAmLonNhat();
                    break;
                case 16:
                    daoNguocMang();
                    break;
                default:
                    System.out.println("Chức năng chưa cập nhật");
                    break;
            }

        } while (chon != 0);
    }

    public static void nhapGiaTriMang() {
        System.out.print("\nNhap so luong phan tu: ");
        int soluong = sc.nextInt();
        if (soluong <= 500) {
            mang1C = new int[soluong];
            // Nhap mang 1C
            for (int i = 0; i < soluong; i++) {
                System.out.print("Nhập phần thử thứ " + (i + 1) + " : ");
                mang1C[i] = sc.nextInt();
            }
        } else {
            System.out.println("Số lượng phần tử không hợp lệ. Vui lòng nhập lại (n <= 500).");
        }
    }

    public static void phatSinhGiaTriNgauNhien() {
        System.out.print("Nhap so luong phan tu: ");
        int soluong = sc.nextInt();
        if (soluong <= 500) {
            mang1C = new int[soluong];
            // Phat sinh gia tri ngau nhien cho mang 1C
            for (int i = 0; i < soluong; i++) {
                int randomNum = (int) (Math.random() * (199 + 199 + 1)) - 199;
                mang1C[i] = randomNum;
            }
        } else {
            System.out.println("Số lượng phần tử không hợp lệ. Vui lòng nhập lại (n <= 500).");
        }
    }

    public static void xuatMang() {
        if (mang1C == null) {
            System.out.println("Mảng chưa được khởi tạo.");
            return;
        }
        System.out.println("Số phần tử của mảng: " + mang1C.length);
        System.out.print("Phần tử của mảng là: ");
        for (int pt : mang1C) {
            System.out.printf("%d ", pt);
        }
    }

    public static void lietKeGiaTriAm() {
        for (int pt : mang1C) {
            if (pt < 0) {
                System.out.printf("%d ", pt);
            }
        }
    }

    public static void lietKeSoNguyenTo() {
        for (int pt : mang1C) {
            if (laSoNguyenTo(pt)) {
                System.out.printf("%d ", pt);
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void lietKePhanTuTrongDoan() {
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        for (int pt : mang1C) {
            if (pt >= a && pt <= b) {
                System.out.printf("%d ", pt);
            }
        }
    }

    public static void tinhTongSoNguyenTo() {
        int tong = 0;
        for (int pt : mang1C) {
            if (laSoNguyenTo(pt)) {
                tong += pt;
            }
        }
        System.out.println("Tổng các số nguyên tố trong mảng: " + tong);
    }

    public static void tinhTrungBinhCongSoDuong() {
        int tong = 0, dem = 0;
        for (int pt : mang1C) {
            if (pt > 0) {
                tong += pt;
                dem++;
            }
        }
        if (dem > 0) {
            System.out.println("Trung bình cộng của các số dương: " + (double) tong / dem);
        } else {
            System.out.println("Không có số dương trong mảng");
        }
    }

    public static void demSoPhanTuLonHonX() {
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        int dem = 0;
        for (int pt : mang1C) {
            if (pt > x) {
                dem++;
            }
        }
        System.out.println("Số phần tử lớn hơn " + x + " là: " + dem);
    }

    public static void demSoNguyenToTrongMang() {
        int dem = 0;
        for (int pt : mang1C) {
            if (laSoNguyenTo(pt)) {
                dem++;
            }
        }
        System.out.println("Số phần tử là số nguyên tố: " + dem);
    }

    public static void kiemTraMangToanSoNguyenTo() {
        boolean toanSoNguyenTo = true;
        for (int pt : mang1C) {
            if (!laSoNguyenTo(pt)) {
                toanSoNguyenTo = false;
                break;
            }
        }
        if (toanSoNguyenTo) {
            System.out.println("Mảng chứa toàn số nguyên tố.");
        } else {
            System.out.println("Mảng không chứa toàn số nguyên tố.");
        }
    }

    public static void kiemTraMangTangDan() {
        boolean tangDan = true;
        for (int i = 0; i < mang1C.length - 1; i++) {
            if (mang1C[i] > mang1C[i + 1]) {
                tangDan = false;
                break;
            }
        }
        if (tangDan) {
            System.out.println("Mảng tăng dần.");
        } else {
            System.out.println("Mảng không tăng dần.");
        }
    }

    public static void timGiaTriLonNhat() {
        int max = mang1C[0];
        for (int pt : mang1C) {
            if (pt > max) {
                max = pt;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
    }

    public static void timGiaTriNhoNhat() {
        int min = mang1C[0];
        for (int pt : mang1C) {
            if (pt < min) {
                min = pt;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }

    public static void timSoAmLonNhat() {
        int maxAm = Integer.MIN_VALUE;
        for (int pt : mang1C) {
            if (pt < 0 && pt > maxAm) {
                maxAm = pt;
            }
        }
        if (maxAm == Integer.MIN_VALUE) {
            System.out.println("Không có số âm trong mảng.");
        } else {
            System.out.println("Số âm lớn nhất trong mảng: " + maxAm);
        }
    }

    public static void daoNguocMang() {
        for (int i = 0; i < mang1C.length / 2; i++) {
            int temp = mang1C[i];
            mang1C[i] = mang1C[mang1C.length - 1 - i];
            mang1C[mang1C.length - 1 - i] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        xuatMang();
    }
}
