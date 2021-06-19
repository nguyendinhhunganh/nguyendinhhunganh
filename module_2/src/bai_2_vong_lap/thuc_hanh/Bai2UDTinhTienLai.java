package bai_2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class Bai2UDTinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien vay:");
        float money = scanner.nextFloat();
        System.out.println("Nhap ti suat lai theo thang");
        float rate = scanner.nextFloat();
        System.out.println("Nhap so thang cho vay");
        float month = scanner.nextFloat();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (rate / 100) / 12 * month;
        }
        System.out.println("Tong so tien lai: " + total_interset);
    }
}
