package bai_1_introduction.thuc_hanh;

import java.util.Scanner;

public class Bai6TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao (don vi: metter): ");
        float height = scanner.nextFloat();
        System.out.println("Nhap can nang (kg):");
        float weight = scanner.nextFloat();
        float bmi = weight/ (height*height);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi <25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
