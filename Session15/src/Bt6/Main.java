package Bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số bị chia: ");
        int dividend = scanner.nextInt();

        System.out.print("Nhập số chia: ");
        int divisor = scanner.nextInt();

        try {
            int result = divide(dividend, divisor);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Số chia không thể bằng 0.");
        }

        return dividend / divisor;
    }
}
