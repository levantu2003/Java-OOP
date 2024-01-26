package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_11 {
    public static void nhapDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int Ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        int Thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        int Nam = sc.nextInt();
        sc.close();

        if (checkDate(Ngay, Thang, Nam)) {
            xuatNgayTiepTheo(Ngay, Thang, Nam);
        } else {
            System.out.println("Ngay thang nam khong hop le");
        }
    }

    public static boolean checkDate(int Ngay, int Thang, int Nam) {
        if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
            if (Ngay > 30) {
                System.out.println("Thang " + Thang + " khong duoc qua 30 ngay");
                return false;
            }
        } else if (Thang == 2) {
            if ((Nam % 4 == 0 && Nam % 100 != 0) || (Nam % 400 == 0)) {
                if (Ngay > 29) {
                    System.out.println("Thang 2 khong duoc qua 29 ngay");
                    return false;
                }
            } else {
                if (Ngay > 28) {
                    System.out.println("Thang 2 khong duoc qua 28 ngay");
                    return false;
                }
            }
        } else return Ngay <= 31 && Ngay > 0 && Thang <= 12 && Thang > 0 && Nam > 0;
        return true;
    }

    public static void xuatNgayTiepTheo(int Ngay, int Thang, int Nam) {
        if (Thang == 2) {
            if (Ngay == 28 || Ngay == 29) {
                Ngay = 1;
                Thang = 3;
            } else {
                Ngay++;
            }
        } else if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
            if (Ngay == 30) {
                Ngay = 1;
                Thang++;
            } else {
                Ngay++;
            }
        } else if (Thang == 1 || Thang == 3 || Thang == 5 || Thang == 7
                || Thang == 8 || Thang == 10 || Thang == 12) {
            if (Ngay == 31 && Thang == 12) {
                Ngay = 1;
                Thang = 1;
                Nam++;
            } else if (Ngay == 31) {
                Ngay = 1;
                Thang++;
            } else {
                Ngay++;
            }
        }
        System.out.println("Ngay tiep theo la: " + Ngay + "/" + Thang + "/" + Nam);
    }

    public static void main(String[] args) {
        nhapDate();
    }
}
