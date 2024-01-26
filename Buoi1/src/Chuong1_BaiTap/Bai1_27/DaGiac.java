package Chuong1_BaiTap.Bai1_27;

import java.util.ArrayList;
import java.util.Scanner;

public class DaGiac {
    private ArrayList<Diem> danhSachDiem;

    public DaGiac() {
        danhSachDiem = new ArrayList<>();
    }

    public DaGiac(ArrayList<Diem> danhSachDiem) {
        this.danhSachDiem = danhSachDiem;
    }

    public DaGiac(DaGiac daGiac) {
        this.danhSachDiem = new ArrayList<>(daGiac.danhSachDiem);
    }

    public ArrayList<Diem> getDanhSachDiem() {
        return danhSachDiem;
    }

    public void setDanhSachDiem(ArrayList<Diem> danhSachDiem) {
        this.danhSachDiem = danhSachDiem;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng đỉnh của đa giác:");
        int soLuongDinh = scanner.nextInt();
        for (int i = 0; i < soLuongDinh; i++) {
            System.out.println("Nhập đỉnh thứ " + (i + 1) + ":");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            danhSachDiem.add(new Diem(x, y));
        }
    }

    public void xuat() {
        System.out.println("Đa giác có các đỉnh sau:");
        for (int i = 0; i < danhSachDiem.size(); i++) {
            Diem diem = danhSachDiem.get(i);
            System.out.println("Đỉnh " + (i + 1) + ": (" + diem.getX() + ", " + diem.getY() + ")");
        }
    }

    public Diem timDinhXaGocToaDoNhat() {
        Diem dinhXaNhat = danhSachDiem.getFirst();
        for (Diem diem : danhSachDiem) {
            if (diem.khoangCach() > dinhXaNhat.khoangCach()) {
                dinhXaNhat = diem;
            }
        }
        return dinhXaNhat;
    }
}
