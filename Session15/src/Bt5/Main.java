package Bt5;

public class Main {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Trả về chỉ số của phần tử tìm thấy
            }
            if (arr[mid] < key) {
                left = mid + 1; // Tiếp tục tìm kiếm bên phải
            } else {
                right = mid - 1; // Tiếp tục tìm kiếm bên trái
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy phần tử trong mảng

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 13;

        int result = binarySearch(arr, key);

        if (result == -1) {
            throw new IllegalArgumentException("Phần tử không được tìm thấy trong mảng.");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
        }
    }
}