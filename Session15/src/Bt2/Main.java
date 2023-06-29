package Bt2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 1, 6};

        try {
            int maxNumber = findMaxNumber(arr);
            System.out.println("Max number: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxNumber(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng rỗng");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
