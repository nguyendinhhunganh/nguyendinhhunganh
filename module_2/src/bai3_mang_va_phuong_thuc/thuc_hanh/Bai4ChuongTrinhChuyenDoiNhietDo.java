package bai3_mang_va_phuong_thuc.thuc_hanh;
import java.util.Scanner;
public class Bai4ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double celsius;
    double fahrenheit;
    int choice;
    do {
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the fahrenheit:");
                fahrenheit = scanner.nextDouble();
                System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Enter the celsius:");
                celsius = scanner.nextDouble();
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
        }
    }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
