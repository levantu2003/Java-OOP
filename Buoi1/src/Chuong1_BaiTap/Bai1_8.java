package Chuong1_BaiTap;

import java.util.Locale;
import java.util.Scanner;

public class Bai1_8 {
    public static void main(String[] args) {
        float diem;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhap diem = ");
        diem = sc.nextFloat();
        sc.close();
        if (diem <= 10 && diem >= 8.5)
            System.out.println("Loai A");
        else if (diem < 8.5 && diem >= 7.0)
            System.out.println("Loai B");
        else if (diem < 7.0 && diem >= 5.5)
            System.out.println("Loai C");
        else if (diem < 5.5 && diem >= 4.0)
            System.out.println("Loai D");
        else if (diem < 4)
            System.out.println("Loai F");
        else
            System.out.println("Diem khong hop le");
    }
}
