package Chuong1_BaiTap.Bai1_28;

import java.util.Scanner;

public class Diem {
    protected int x;
    protected int y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ x:");
        this.x = scanner.nextInt();

        System.out.println("Nhập tọa độ y:");
        this.y = scanner.nextInt();
    }

    public void hienThi() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
