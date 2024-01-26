package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_17 {
    public static int TongChuSoChan(int n) {
        if (n == 0)
            return 0;
        int sochan = n % 10;
        if (sochan % 2 == 0)
            return sochan + TongChuSoChan(n / 10);
        else
            return TongChuSoChan(n / 10);
    }

    public static void main(String[] args) {
        int songuyen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        songuyen = sc.nextInt();
        sc.close();
        System.out.println("Tong so chan trong " + songuyen + " la " + TongChuSoChan(songuyen));
    }
}
