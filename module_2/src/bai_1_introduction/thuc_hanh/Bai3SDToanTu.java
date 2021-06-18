package bai_1_introduction.thuc_hanh;

import java.util.Scanner;

public class Bai3SDToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong:");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu dai:");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("Dien tich:" + area);
    }
}
