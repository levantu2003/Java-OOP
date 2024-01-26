package Chuong1_BaiTap;

import java.util.Scanner;

public class Bai1_6_7 {

    public static class Bai1_6 {
        public boolean checkNamNhuan(int namCanNhap) {
            if ((2024 - namCanNhap) % 4 == 0)
                return true;
            return false;
        }

        public void xuatNamNhuan(int Year) {
            if (checkNamNhuan(Year))
                System.out.println("Nam nay la nam nhuan");
            else
                System.out.println("Nam nay la nam khong nhuan");
        }

    }

    public static class Bai1_7 {
        public boolean checkThang(int thang) {
            if (thang == 2 && thang == 8 && thang == 10 && thang == 12 && thang == 1 && thang == 3 && thang == 5 && thang == 7)
                return true;
            else
                return false;
        }

        public void xuatSoNgay(int Thang) {
            if (checkThang(Thang)) {
                System.out.println("Thang nay co 31 ngay");
            } else {
                System.out.println("Thang nay co 30 ngay");
            }
        }
    }

    public static void main(String[] args) {
        Bai1_6 bai6 = new Bai1_6();

        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam can tim: ");
        year = sc.nextInt();
        sc.close();

        bai6.checkNamNhuan(year);
        bai6.xuatNamNhuan(year);

        Bai1_7 bai7 = new Bai1_7();

        int month;
        System.out.println("Nhap thang can tim: ");
        month = sc.nextInt();

        bai7.checkThang(month);
        bai7.xuatSoNgay(month);
    }
}
