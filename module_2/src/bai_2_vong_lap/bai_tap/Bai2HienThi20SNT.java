package bai_2_vong_lap.bai_tap;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Bai2HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong SNT can in");
        int num = scanner.nextInt();
        int count = 0;
        int n = 2;
        if (num < 1) {
            System.out.println("Moi nhap lai!");
            return;
        }
        while (count < num) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
