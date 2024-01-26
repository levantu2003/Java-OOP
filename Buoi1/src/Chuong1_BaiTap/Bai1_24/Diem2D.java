package Chuong1_BaiTap.Bai1_24;

import java.util.Scanner;

public class Diem2D {
    int x;
    int y;

    public Diem2D() {
        x = 0;
        y = 0;
    }

    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tọa độ x: ");
        x = sc.nextInt();
        System.out.print("Nhập tọa độ y: ");
        y = sc.nextInt();
        System.out.println("Đọc tọa độ thành công");
    }

    public void hienThi() {
        Diem2D diem2TS = new Diem2D(x, y);
        System.out.printf("Điểm vừa nhập: (%d,%d)", diem2TS.x, diem2TS.y);
    }

    public void doiDiem(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
        System.out.println("Cộng vào thành công");
        System.out.printf("Điểm: (%d,%d)", this.x, this.y);
    }

    public int giaTriX() {
        return this.x;
    }

    public int giaTriY() {
        return this.y;
    }

    public float khoangCach() {
        return (float) Math.sqrt((x * x + y * y));
    }

    public float khoangCach(Diem2D d) {
        d.x = 6;
        d.y = 12;
        return (float) Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
    }

}
