package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_9 {
    public void tinhTienDien(int socu, int somoi) {
        int sodien = somoi - socu;
        long tiendien1 = 0, tiendien2 = 0, tiendien3 = 0, tiendien4 = 0, tiendien5;
        if (sodien >= 0 && sodien <= 50) {
            tiendien1 = sodien * 1480;
            System.out.println("Tien dien thang nay la: " + tiendien1);
        } else if (sodien >= 51 && sodien <= 100) {
            tiendien2 = tiendien1 + (sodien - 50) * 1533;
            System.out.println("Tien dien thang nay la: " + tiendien2);
        } else if (sodien >= 101 && sodien <= 200) {
            tiendien3 = tiendien2 + (sodien - 100) * 1786;
            System.out.println("Tien dien thang nay la: " + tiendien3);
        } else if (sodien >= 201 && sodien <= 300) {
            tiendien4 = tiendien3 + (sodien - 200) * 2242;
            System.out.println("Tien dien thang nay la: " + tiendien4);
        } else {
            tiendien5 = tiendien4 + (long) (sodien - 300) * 2503;
            System.out.println("Tien dien thang nay la: " + tiendien5);
        }
    }

    public static void main(String[] args) {
        int chisocu, chisomoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chi so cu: ");
        chisocu = sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chisomoi = sc.nextInt();
        sc.close();

        Bai1_9 bai9 = new Bai1_9();
        bai9.tinhTienDien(chisocu, chisomoi);
    }
}
