package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_15 {
    public static void TongSoNhap() {
        float sothuc, tong = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so thuc: ");
            sothuc = sc.nextFloat();
            sc.close();
            if (sothuc == 0) {
                System.out.println("Khong duoc nhap so 0");
            }
            tong += sothuc;
        } while (sothuc != 0);
        System.out.println("Tong so thuc vua nhap la: " + tong);
    }

    public static void main(String[] args) {
        TongSoNhap();
    }
}
