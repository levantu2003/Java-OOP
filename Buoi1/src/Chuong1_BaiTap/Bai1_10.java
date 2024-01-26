package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_10 {
    public static void nhapDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int Ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        int Thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        int Nam = sc.nextInt();
        sc.close();

        checkDate(Ngay, Thang, Nam);
    }

    public static void checkDate(int Ngay, int Thang, int Nam) {
        if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
            if (Ngay > 30) {
                System.out.println("Thang " + Thang + " khong duoc qua 30 ngay");
            }
        } else if (Thang == 2) {
            // Kiem tra nam nhuan
            if ((Nam % 4 == 0 && Nam % 100 != 0) || (Nam % 400 == 0)) {
                if (Ngay > 29) {
                    System.out.println("Thang 2 khong duoc qua 29 ngay");
                }
            } else {
                if (Ngay > 28) {
                    System.out.println("Thang 2 khong duoc qua 28 ngay");
                }
            }
        } else if (Ngay > 31 || Ngay <= 0 || Thang > 12 || Thang <= 0 || Nam <= 0) {
            System.out.println("Ngay thang nam khong hop le");
        } else {
            System.out.println("Ngay thang nam hop le");
        }
    }

    public static void main(String[] args) {
        nhapDate();
    }
}
