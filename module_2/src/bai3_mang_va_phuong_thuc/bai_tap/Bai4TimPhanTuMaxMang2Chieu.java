package bai3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class Bai4TimPhanTuMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        int hang = input.nextInt();
        System.out.println("Nhap so cot:");
        int cot = input.nextInt();
        int[][] array = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            System.out.println("");
            for (int j = 0; j < cot; j++) {
                System.out.print("Enter array[" + i + "][" + j + "]= ");
                array[i][j] = input.nextInt();
            }
        }
        int max = array[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: [" + indexRow + "][" + indexColumn + "]= " + max);

    }
}
