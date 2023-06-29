package Bt3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSum(arr);
        System.out.println("Tổng của mảng là: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            try {
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Phần tử không phải số nguyên - " + num);
            }
        }
        return sum;
    }
}
