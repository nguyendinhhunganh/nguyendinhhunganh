package bai_2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class KTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int num = scanner.nextInt();
        boolean check = true;
        if (num == 1 || num == 0)
            System.out.println(num +" khong la so nguyen to");
        for (int i = 2; i <= Math.sqrt(num); i++){
        if (num % i == 0)
            check = false;
        }
        if (check == true){
            System.out.println(num + " La so nguyen to");
        }
        else System.out.println(num +" khong la so nguyen to");
    }
}
