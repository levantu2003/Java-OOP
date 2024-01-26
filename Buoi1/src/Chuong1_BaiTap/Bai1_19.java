package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_19 {
    public static void nhapMaTranCN() {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Nhap m: ");
        m = sc.nextInt();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        sc.close();
        xuatMaTran(m, n);
    }

    public static void xuatMaTran(int m, int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhapMaTranCN();
    }
}
