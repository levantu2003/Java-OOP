package Chuong1_BaiTap.Bai1_28;

import java.util.Scanner;

public class SDDiemMau {
    public static void main(String[] args) {
        DiemMau diemA = new DiemMau(5, 10, "trắng");
        diemA.hienThi();

        DiemMau diemB = new DiemMau(0, 0, "không màu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ x, y cho điểm B:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        diemB.doiDiem(x, y);
        diemB.hienThi();
        diemB.GanMau("Vàng");
        diemB.hienThi();
        scanner.close();
    }
}
