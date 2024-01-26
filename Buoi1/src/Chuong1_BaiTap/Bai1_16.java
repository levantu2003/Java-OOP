package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_16 {
    public static int demChuSoLe(int n) {
        if (n == 0)
            return 0;
        int sole = n % 10;
        if (sole % 2 == 1)
            return 1 + demChuSoLe(n / 10);
        else
            return demChuSoLe(n / 10);
    }

    public static void main(String[] args) {
        int songuyen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        songuyen = sc.nextInt();
        sc.close();
        System.out.println("So le trong " + songuyen + " la " + demChuSoLe(songuyen));
    }
}
