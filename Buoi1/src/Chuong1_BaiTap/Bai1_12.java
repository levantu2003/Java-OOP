package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_12 {
    public static int demUoc(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                dem++;
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nguyen duong: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("So luong uoc so cua " + n + " la " + demUoc(n));
    }
}
