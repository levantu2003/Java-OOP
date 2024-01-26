package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_21 {
    public static void nhapVaXuatTamGiacCanRong() {
        Scanner sc = new Scanner(System.in);
        int h;
        System.out.print("Nhap chieu cao tam giac: ");
        h = sc.nextInt();
        sc.close();
        xuatTamGiacCanRong(h);
    }

    public static void xuatTamGiacCanRong(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhapVaXuatTamGiacCanRong();
    }
}