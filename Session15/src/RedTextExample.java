import java.awt.Color;


public class RedTextExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Color đỏ
        Color redColor = Color.RED;

        // Chuỗi cần hiển thị
        String text = "Chữ màu đỏ";

        // Hiển thị chữ màu đỏ
        System.out.println("\u001B[31m" + text + "\u001B[0m");
        System.out.println("\u001B[34mChữ màu xanh\u001B[0m");
        System.out.println("\u001B[1m\u001B[31m\u001B[43mChữ màu đỏ in đậm trên nền màu vàng\u001B[0m");

    }


}
