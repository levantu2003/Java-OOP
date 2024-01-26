package Chuong1_BaiTap.Bai1_27;

public class Main {
    public static void main(String[] args) {
        DaGiac daGiac = new DaGiac();
        daGiac.nhap();
        daGiac.xuat();
        Diem dinhXaNhat = daGiac.timDinhXaGocToaDoNhat();
        System.out.println("Đỉnh xa gốc tọa độ nhất: (" + dinhXaNhat.getX() + ", " + dinhXaNhat.getY() + ")");
    }
}
