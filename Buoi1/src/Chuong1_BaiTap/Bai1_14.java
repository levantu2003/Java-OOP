package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_14 {
    public static boolean kiemtraSNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int soduongN;
        System.out.print("Nhap so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        soduongN = sc.nextInt();
        sc.close();
        if (kiemtraSNT(soduongN)) {
            System.out.println("So " + soduongN + " la so nguyen to");
        } else {
            System.out.println("So " + soduongN + " khong la so nguyen to");
        }
    }
}
