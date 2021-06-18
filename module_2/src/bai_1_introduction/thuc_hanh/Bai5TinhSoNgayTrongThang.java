package bai_1_introduction.thuc_hanh;

import java.util.Scanner;

public class Bai5TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang:");
        int month = scanner.nextInt();
        System.out.println("Nhap nam:");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            if (month == 2) {
                System.out.println("Thang 2 co 29 ngay");
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang" + month + "co 31 ngay");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang" + month + "co 30 ngay");
                    break;
                case 2:
                    System.out.println("Thang 2 co 28 ngay");
                    break;
            }
        }
    }
}
