package Chuong1_BaiTap.Bai1_25;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSoMoi, int mauSoMoi) {
        this.tuSo = tuSoMoi;
        this.mauSo = mauSoMoi;
    }

    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập tử số: ");
            tuSo = sc.nextInt();
            System.out.print("Nhập mẫu số (khác 0): ");
            mauSo = sc.nextInt();
            if (mauSo == 0) {
                System.out.println("Mẫu số phải khác 0. Vui lòng nhập lại!");
            }
        } while (mauSo == 0);
    }


    public void hienThiPhanSo() {
        if (tuSo == 0) {
            System.out.println(0);
        } else if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public void nghichDaoPhanSo() {
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }

    public PhanSo phanSoNghichDao() {
        return new PhanSo(mauSo, tuSo);
    }

    public double giaTriThuc() {
        return (double) tuSo / mauSo;
    }

    public boolean lonHon(PhanSo a) {
        return this.giaTriThuc() > a.giaTriThuc();
    }

    public PhanSo cong(PhanSo a) {
        int tuSoMoi = this.tuSo * a.mauSo + a.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * a.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo tru(PhanSo a) {
        int tuSoMoi = this.tuSo * a.mauSo - a.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * a.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo nhan(PhanSo a) {
        int tuSoMoi = this.tuSo * a.tuSo;
        int mauSoMoi = this.mauSo * a.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo chia(PhanSo a) {
        int tuSoMoi = this.tuSo * a.mauSo;
        int mauSoMoi = this.mauSo * a.tuSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo cong(int n) {
        int tuSoMoi = this.tuSo + n * this.mauSo;
        return new PhanSo(tuSoMoi, this.mauSo);
    }

    public PhanSo tru(int n) {
        int tuSoMoi = this.tuSo - n * this.mauSo;
        return new PhanSo(tuSoMoi, this.mauSo);
    }

    public PhanSo nhan(int n) {
        int tuSoMoi = this.tuSo * n;
        return new PhanSo(tuSoMoi, this.mauSo);
    }

    public PhanSo chia(int n) {
        int mauSoMoi = this.mauSo * n;
        return new PhanSo(this.tuSo, mauSoMoi);
    }
}