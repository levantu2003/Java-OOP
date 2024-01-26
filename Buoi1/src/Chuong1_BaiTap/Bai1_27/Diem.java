package Chuong1_BaiTap.Bai1_27;

public class Diem {
    private double x;
    private double y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Các phương thức get/set
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double khoangCach() {
        return Math.sqrt(x * x + y * y);
    }
}
