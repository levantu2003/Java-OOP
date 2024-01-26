package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_5 {
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

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;
        if (delta >= 0) {
            x1 = -b + Math.sqrt(delta) / 2 * a;
            System.out.println("Nghiem cua x1 = " + x1);
            x2 = -b - Math.sqrt(delta) / 2 * a;
            System.out.println("Nghiem cua x2 = " + x2);
        } else {
            System.out.print("Phuong trinh vo nghiem\n");
        }
    }
}
