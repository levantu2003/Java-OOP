package Chuong1_BaiTap.Bai1_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TamGiac tamGiac = new TamGiac();
        int choice;

        do {
            System.out.println("1. Nhap tam giac");
            System.out.println("2. Xuat tam giac");
            System.out.println("3. Tinh chu vi");
            System.out.println("4. Tinh dien tich");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tamGiac.nhap();
                    break;
                case 2:
                    tamGiac.xuat();
                    break;
                case 3:
                    System.out.println("Chu vi tam giac: " + tamGiac.tinhChuVi());
                    break;
                case 4:
                    System.out.println("Dien tich tam giac: " + tamGiac.tinhDienTich());
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
