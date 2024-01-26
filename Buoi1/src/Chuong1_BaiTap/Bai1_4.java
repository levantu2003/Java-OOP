package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        System.out.print("Nhap c = ");
        c = sc.nextInt();
        sc.close();
        int max, min;
        if (a > b && a > c) {
            max = a;
            min = (b > c) ? c : b;
        } else if (b > a && b > c) {
            max = b;
            min = (a > c) ? c : a;
        } else {
            max = c;
            min = (a > b) ? b : a;
        }
        System.out.println("So lon nhat la:" + max);
        System.out.println("So be nhat la:" + min);
    }
}
