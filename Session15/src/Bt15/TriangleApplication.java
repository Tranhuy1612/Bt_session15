package Bt15;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class TriangleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double side1 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double side2 = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double side3 = scanner.nextDouble();

            checkTriangle(side1, side2, side3);
            System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Ngoại lệ: " + e.getMessage());
        }
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Giá trị cạnh không được âm.");
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại.");
        }
    }
}
