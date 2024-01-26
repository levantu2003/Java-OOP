package Chuong1_BaiTap.Bai1_24;

public class SDDiem {
    public static Diem2D taoDiemA() {
        Diem2D diemA = new Diem2D(3, 4);
        diemA.hienThi();
        return diemA;
    }

    public static Diem2D taoDiemB() {
        Diem2D diemB = new Diem2D();
        diemB.nhapDiem();
        diemB.hienThi();
        return diemB;
    }

    public static void taoDiemC(Diem2D diemB) {
        Diem2D diemC = new Diem2D(-diemB.giaTriX(), -diemB.giaTriY());
        diemC.hienThi();
    }

    public static void khoangCachDenO(Diem2D diemB) {
        System.out.printf("Khoảng cách từ điểm B đến tâm O: %.2f\n", diemB.khoangCach());
    }

    public static void khoangCachAB(Diem2D diemA, Diem2D diemB) {
        System.out.printf("Khoảng cách từ điểm A đến điểm B: %.2f\n", diemA.khoangCach(diemB));
    }
}