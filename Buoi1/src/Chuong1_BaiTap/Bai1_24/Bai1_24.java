package Chuong1_BaiTap.Bai1_24;

import java.util.Scanner;

public class Bai1_24 {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int chon;
        Diem2D diem2TS = new Diem2D();
        Diem2D diemA = null;
        Diem2D diemB = null;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n================================ĐỀ BÀI=======================================");
            System.out.println("================================Diem2D=======================================");
            System.out.println("1. Hàm khởi tạo mặc định");
            System.out.println("2. Hàm khởi tạo có 2 tham số");
            System.out.println("3. Nhập tọa độ cho điểm từ bàn phím");
            System.out.println("4. Hiển thị ra màn hình tọa độ điểm theo dạng (x,y)");
            System.out.println("5. Dời điểm đi 1 độ dời (dx, dy)");
            System.out.println("6. Lấy ra giá trị hoành độ của điểm");
            System.out.println("7. Lấy ra giá trị tung độ của điểm");
            System.out.println("8. Tính khoảng cách từ điểm đó đến gốc tọa độ");
            System.out.println("9. Tính khoảng cách từ điểm đó đến 1 điểm khác");
            System.out.println("================================SDDiem=======================================");
            System.out.println("10. Tạo ra điểm A tọa độ (3,4). Hiển thị tọa độ điểm A ra màn hình.");
            System.out.println("11. Tạo ra điểm B với giá trị nhập từ bàn phím. Hiển thị tọa độ điểm B ra màn hình.");
            System.out.println("12. Tạo ra điểm C đối xứng với điểm B qua gốc tọa độ. Hiển thị tọa độ điểm C ra màn hình.");
            System.out.println("13. Hiển thị ra màn hình khoảng cách từ điểm B đến tâm O.");
            System.out.println("14. Hiển thị ra màn hình khoảng cách từ điểm A đến điểm B.");
            System.out.println("============================================================================");
            System.out.println("0. Thoát");
            System.out.print("Nhap so: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.printf("Điểm Default: (%d;%d)", diem2TS.x, diem2TS.y);
                    break;
                case 2:
                    diem2TS = new Diem2D(4, 5);
                    System.out.printf("Điểm Default: (%d;%d)", diem2TS.x, diem2TS.y);
                    break;
                case 3:
                    diem2TS.nhapDiem();
                    break;
                case 4:
                    diem2TS.hienThi();
                    break;
                case 5:
                    diem2TS.doiDiem(4, 6);
                    break;
                case 6:
                    System.out.println("Diem x:" + diem2TS.giaTriX());
                    break;
                case 7:
                    System.out.println("Diem y:" + diem2TS.giaTriY());
                    break;
                case 8:
                    System.out.println("Khoảng cách từ điểm tới O(0,0) là: " + diem2TS.khoangCach());
                    break;
                case 9:
                    Diem2D d = new Diem2D();
                    System.out.println("Khoảng cách từ điểm tới điểm (6,12) là: " + diem2TS.khoangCach(d));
                    break;
                case 10:
                    diemA = SDDiem.taoDiemA();
                    break;
                case 11:
                    diemB = SDDiem.taoDiemB();
                    break;
                case 12:
                    if (diemB != null) {
                        SDDiem.taoDiemC(diemB);
                    } else {
                        System.out.println("Bạn cần tạo điểm B trước");
                    }
                    break;
                case 13:
                    if (diemB != null) {
                        SDDiem.khoangCachDenO(diemB);
                    } else {
                        System.out.println("Bạn cần tạo điểm B trước");
                    }
                    break;
                case 14:
                    if (diemA != null && diemB != null) {
                        SDDiem.khoangCachAB(diemA, diemB);
                    } else {
                        System.out.println("Bạn cần tạo cả điểm A và B trước");
                    }
                    break;
                default:
                    System.out.println("Chức năng chưa cập nhật");
                    break;
            }

        } while (chon != 0);
    }

}
