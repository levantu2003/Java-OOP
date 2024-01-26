package Chuong1_BaiTap.Bai1_26;

import java.util.Scanner;

public class TamGiac {
    private Diem diem1;
    private Diem diem2;
    private Diem diem3;

    public TamGiac() {
        this.diem1 = new Diem();
        this.diem2 = new Diem();
        this.diem3 = new Diem();
    }

    public TamGiac(Diem diem1, Diem diem2, Diem diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public TamGiac(TamGiac other) {
        this.diem1 = new Diem(other.diem1.getX(), other.diem1.getY());
        this.diem2 = new Diem(other.diem2.getX(), other.diem2.getY());
        this.diem3 = new Diem(other.diem3.getX(), other.diem3.getY());
    }

    public Diem getDiem1() {
        return diem1;
    }

    public void setDiem1(Diem diem1) {
        this.diem1 = diem1;
    }

    public Diem getDiem2() {
        return diem2;
    }

    public void setDiem2(Diem diem2) {
        this.diem2 = diem2;
    }

    public Diem getDiem3() {
        return diem3;
    }

    public void setDiem3(Diem diem3) {
        this.diem3 = diem3;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem 1:");
        this.diem1.setX(scanner.nextDouble());
        this.diem1.setY(scanner.nextDouble());
        System.out.println("Nhap diem 2:");
        this.diem2.setX(scanner.nextDouble());
        this.diem2.setY(scanner.nextDouble());
        System.out.println("Nhap diem 3:");
        this.diem3.setX(scanner.nextDouble());
        this.diem3.setY(scanner.nextDouble());
    }

    public void xuat() {
        System.out.println("Diem 1: (" + diem1.getX() + ", " + diem1.getY() + ")");
        System.out.println("Diem 2: (" + diem2.getX() + ", " + diem2.getY() + ")");
        System.out.println("Diem 3: (" + diem3.getX() + ", " + diem3.getY() + ")");
    }

    public double tinhChuVi() {
        double canh1 = diem1.khoangCach(diem2);
        double canh2 = diem2.khoangCach(diem3);
        double canh3 = diem3.khoangCach(diem1);
        return canh1 + canh2 + canh3;
    }

    public double tinhDienTich() {
        double canh1 = diem1.khoangCach(diem2);
        double canh2 = diem2.khoangCach(diem3);
        double canh3 = diem3.khoangCach(diem1);
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }
}