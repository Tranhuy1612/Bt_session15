package Bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String chuoi = nhapChuoiTuBanPhim();
        List<Integer> soNguyen = chuyenChuoiSangSoNguyen(chuoi);

        System.out.println("Danh sách số nguyên: " + soNguyen);
    }

    public static String nhapChuoiTuBanPhim() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        return chuoi;
    }

    public static List<Integer> chuyenChuoiSangSoNguyen(String chuoi) {
        List<Integer> soNguyen = new ArrayList<>();

        for (char c : chuoi.toCharArray()) {
            try {
                int so = Integer.parseInt(Character.toString(c));
                soNguyen.add(so);
            } catch (NumberFormatException e) {
                soNguyen.add(0);
                System.out.println("Lỗi: " + c + " không phải số nguyên. Giá trị được thay thế = 0.");
            }
        }

        return soNguyen;
    }
}

