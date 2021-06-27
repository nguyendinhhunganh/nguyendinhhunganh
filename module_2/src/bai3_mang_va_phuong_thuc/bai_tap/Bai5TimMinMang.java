package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Bai5TimMinMang {
    public static int findMin(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap so luong phan tu: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("So luong phan tu khong qua 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.print("Danh sach cac phan tu da nhap: ");
        for (int a : array) {
            System.out.print(a + "\t");
        }
        int index = findMin(array);
        System.out.println("");
        System.out.println("Phan tu lon nhat trong mang la: [" + index + "]= " + array[index]);
    }
}
