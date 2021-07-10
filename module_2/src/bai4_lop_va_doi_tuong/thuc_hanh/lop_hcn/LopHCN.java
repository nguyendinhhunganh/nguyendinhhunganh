package bai4_lop_va_doi_tuong.thuc_hanh.lop_hcn;
import bai4_lop_va_doi_tuong.thuc_hanh.Rectangle;

import java.util.Scanner;
public class LopHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Your Rectangle: " + rectangle.display());
        System.out.print("Area: " + rectangle.getArea());
        System.out.print("Perimeter: " + rectangle.getPerimeter());
    }
}
