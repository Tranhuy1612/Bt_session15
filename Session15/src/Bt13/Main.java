package Bt13;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        String emptyString = "";
        String reversedEmpty = reverseString(emptyString);
        System.out.println("Reversed empty string: " + reversedEmpty);

        String nullString = null;
        String reversedNull = reverseString(nullString);
        System.out.println("Reversed null string: " + reversedNull);
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid input string");
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
