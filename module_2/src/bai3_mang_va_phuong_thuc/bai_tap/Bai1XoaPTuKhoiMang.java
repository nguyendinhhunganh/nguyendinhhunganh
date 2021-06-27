package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Bai1XoaPTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kichThuoc;
        do {
            System.out.println("Nhap kich thuoc mang: ");
            kichThuoc = input.nextInt();
            if (kichThuoc > 20) {
                System.out.println("Kich thuoc khong qua 20!!!");
            }
        } while (kichThuoc > 20);
        int[] array = new int[kichThuoc];
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Nhap phan tu" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.print("Danh sach phan tu: ");
        for (int a : array) {
            System.out.print(a + "\t");
        }
        int delete;
        System.out.print("Nhap phan tu can xoa: ");
        delete = input.nextInt();
        boolean check = false;
        int number = 0;
        for (int i = 0; i < kichThuoc; i++) {
            if (delete == array[i]) {
                check = true;
                number = i;
                break;
            }
        }
        int[] newArray = new int[array.length - 1];
        if (check) {
            for (int j = 0; j < number; j++) {
                newArray[j] = array[j];
            }
            for (int k = number; k < (kichThuoc - 1); k++) {
                newArray[k] = array[k + 1];
            }
            for (int b : newArray) {
                System.out.print(b + "\t");
            }
        } else {
            System.out.println("Khong tim thay phan tu can xoa");
        }
    }
}
