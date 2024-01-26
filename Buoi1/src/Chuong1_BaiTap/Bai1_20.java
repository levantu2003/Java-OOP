package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_20 {
    public static void nhapVaXuatTamGiacCan() {
        Scanner sc = new Scanner(System.in);
        int h;
        System.out.print("Nhap chieu cao tam giac: ");
        h = sc.nextInt();
        sc.close();
        xuatTamGiacCan(h);
    }

    public static void xuatTamGiacCan(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhapVaXuatTamGiacCan();
    }
}