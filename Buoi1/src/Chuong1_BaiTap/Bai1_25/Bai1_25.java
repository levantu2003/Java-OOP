package Chuong1_BaiTap.Bai1_25;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1_25 {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int chon;
        do {
            Scanner sc = new Scanner(System.in);
            PhanSo phanSo = new PhanSo(1, 1);
            PhanSo[] danhSachPhanSo = null;

            System.out.println("\n================================ĐỀ BÀI=======================================");
            System.out.println("================================PhanSo=======================================");
            System.out.println("1. Hàm nhập giá trị cho 1 phân số. Nếu phân số vừa nhập có mẫu số = 0 thì yêu cầu nhập lại.");
            System.out.println("2. Hàm hiển thị phân số theo dạng tu/mau hoặc -tu/mau. Yêu cầu: nếu tử số =0 thì chỉ\n" +
                    "in ra số 0, nếu mẫu số =1 thì chỉ in ra tử số.");
            System.out.println("3. Hàm nghịch đảo phân số (làm thay đổi giá trị phân số)");
            System.out.println("4. Hàm tính ra phân số nghịch đảo của 1 phân số (phân số sẽ giữ nguyên nhưng hàm trả\n" +
                    "về giá trị là phân số nghịch đảo của nó). ");
            System.out.println("5. Hàm tính ra giá trị thực của phân số. Chẳng hạn phân số 1/2 có giá trị là 0.5.");
            System.out.println("6. Hàm so sánh lớn hơn với phân số a");
            System.out.println("7. Hàm cộng, trừ, nhân, chia phân số với 1 phân số a. Kết quả của hàm là 1 phân số.");
            System.out.println("8. Hàm cộng, trừ, nhân, chia phân số với 1 số nguyên. Kết quả của hàm là 1 phân số.");
            System.out.println("================================SDPhanSo=====================================");
            System.out.println("9. Tạo phân số a = 3/7 , b = 4/9 . Hiển thị giá trị của chúng ra màn hình.");
            System.out.println("10. Tạo 2 phân số x và y. Nhập giá trị cho x và y từ bàn phím.");
            System.out.println("11. Hiển thị giá trị nghịch đảo của phân số x ra màn hình (không làm thay đổi giá trị của\n" +
                    "x).");
            System.out.println("12. Tính tổng của x + y và in kết quả ra màn hình.");
            System.out.println("13. Nhập vào 1 danh sách gồm n phân số (n : nhập từ bàn phím ).");
            System.out.println("14. Tính tổng n phân số đó.");
            System.out.println("15. Tìm phân số lớn nhất trong danh sách phân số trên.");
            System.out.println("16. Sắp xếp danh sách phân số theo thứ tự tăng dần");
            System.out.println("============================================================================");
            System.out.println("0. Thoát");
            System.out.print("Nhap so: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    phanSo.nhapPhanSo();
                    break;
                case 2:
                    phanSo.hienThiPhanSo();
                    break;
                case 3:
                    phanSo.nghichDaoPhanSo();
                    break;
                case 4:
                    PhanSo phanSoNghichDao = phanSo.phanSoNghichDao();
                    phanSoNghichDao.hienThiPhanSo();
                    break;
                case 5:
                    System.out.println(phanSo.giaTriThuc());
                    break;
                case 6:
                    PhanSo a = new PhanSo(1, 2);
                    System.out.println(phanSo.lonHon(a));
                    break;
                case 7:
                    PhanSo b = new PhanSo(1, 2);
                    phanSo.cong(b).hienThiPhanSo();
                    phanSo.tru(b).hienThiPhanSo();
                    phanSo.nhan(b).hienThiPhanSo();
                    phanSo.chia(b).hienThiPhanSo();
                    break;
                case 8:
                    int n = 2;
                    phanSo.cong(n).hienThiPhanSo();
                    phanSo.tru(n).hienThiPhanSo();
                    phanSo.nhan(n).hienThiPhanSo();
                    phanSo.chia(n).hienThiPhanSo();
                    break;
                case 9:
                    SDPhanSo.taoVaHienThiPhanSo();
                    break;
                case 10:
                    PhanSo x = new PhanSo(1, 1);
                    PhanSo y = new PhanSo(1, 1);
                    System.out.println("Nhập phân số x:");
                    x.nhapPhanSo();
                    System.out.println("Nhập phân số y:");
                    y.nhapPhanSo();
                    break;
                case 11:
                    SDPhanSo.hienThiNghichDaoPhanSoX();
                    break;
                case 12:
                    SDPhanSo.tinhTongXY();
                    break;
                case 13:
                    danhSachPhanSo = SDPhanSo.nhapDanhSachPhanSo();
                    System.out.println(Arrays.toString(danhSachPhanSo));
                    break;
                case 14:
                    if (danhSachPhanSo != null) {
                        SDPhanSo.tinhTongDanhSachPhanSo(danhSachPhanSo);
                    } else {
                        System.out.println("Vui lòng nhập danh sách phân số trước (chọn 13)!");
                    }
                    break;
                case 15:
                    if (danhSachPhanSo != null) {
                        SDPhanSo.timPhanSoLonNhat(danhSachPhanSo);
                    } else {
                        System.out.println("Vui lòng nhập danh sách phân số trước (chọn 13)!");
                    }
                    break;
                case 16:
                    if (danhSachPhanSo != null) {
                        SDPhanSo.sapXepDanhSachPhanSo(danhSachPhanSo);
                    } else {
                        System.out.println("Vui lòng nhập danh sách phân số trước (chọn 13)!");
                    }
                    break;
                default:
            }
        } while (chon != 0);
    }
}
