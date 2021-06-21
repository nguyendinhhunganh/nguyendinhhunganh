package bai_2_vong_lap.bai_tap;

import java.util.Scanner;

public class Bai1HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i <= 2; i++) {
                    System.out.println("");
                    for (int j = 0; j <= 8; j++) {
                        System.out.print("*");
                    }

                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    System.out.println("");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for (int i = 5; i >= 0; i--) {
                    System.out.println("");
                    for (int j = i; j >= 0; j--){
                        System.out.print("**");
                    }
                }
                break;
            case 4:
                break;
        }
    }
}
