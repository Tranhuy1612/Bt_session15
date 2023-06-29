package Bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soThuNhat, soThuHai;

        try {
            System.out.print("Nhập số thứ nhất: ");
            soThuNhat = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            soThuHai = scanner.nextInt();

            int tong = soThuNhat + soThuHai;
            System.out.println("Tổng hai số nguyên là: " + tong);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            System.out.println("Vui lòng nhập lại các số nguyên!");
            main(args); // Đệ quy gọi lại hàm main để người dùng nhập lại
        }
    }
}
