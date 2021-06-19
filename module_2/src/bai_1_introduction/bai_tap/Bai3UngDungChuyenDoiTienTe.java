package bai_1_introduction.bai_tap;
import java.util.Scanner;
public class Bai3UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can chuyen doi (USD): ");
        float uSD = scanner.nextFloat();
        float rate = 23000 * uSD;
        System.out.println(rate + "Vnd");

    }
}
