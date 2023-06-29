package Bt12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        try {
            int uocChungLonNhat = timUocChungLonNhat(num1, num2);
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + uocChungLonNhat);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static int timUocChungLonNhat(int a, int b) throws Exception {
        if (a == 0 && b == 0) {
            throw new Exception("Hai số đều bằng 0.");
        }

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}

