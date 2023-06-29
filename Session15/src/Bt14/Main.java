package Bt14;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Mảng ví dụ

        try {
            double average = calculateAverage(numbers);
            System.out.println("Giá trị trung bình của mảng là: " + average);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static double calculateAverage(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng không có phần tử.");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }
}

