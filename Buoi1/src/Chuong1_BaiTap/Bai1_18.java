package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_18 {
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        nhapMaTranCN();
    }
}
