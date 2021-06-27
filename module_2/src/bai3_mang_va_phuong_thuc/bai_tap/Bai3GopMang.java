package bai3_mang_va_phuong_thuc.bai_tap;
import java.util.Scanner;
public class Bai3GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArr1;
        do {
            System.out.println("Nhap kich thuoc mang 1: ");
            sizeArr1 = input.nextInt();
            if (sizeArr1 > 20) {
                System.out.println("Kich thuoc khong qua 20");
            }
        } while (sizeArr1 > 20);
        int[] array1 = new int[sizeArr1];
        for (int i = 0; i < sizeArr1; i++) {
            System.out.print("Nhap phan tu" + (i + 1) + " : ");
            array1[i] = input.nextInt();
        }
        int sizeArr2;
        do {
            System.out.println("Nhap kich thuoc mang 2: ");
            sizeArr2 = input.nextInt();
            if (sizeArr2 > 20) {
                System.out.println("Kich thuoc khong qua 20");
            }
        } while (sizeArr2 > 20);
        int[] array2 = new int[sizeArr2];
        for (int i = 0; i < sizeArr2; i++) {
            System.out.print("Nhap phan tu" + (i + 1) + " : ");
            array2[i] = input.nextInt();
        }
        System.out.print("Danh sach mang 1: ");
        for (int a : array1) {
            System.out.print(a + "\t");
        }
        System.out.println("");
        System.out.print("Danh sach mang 2: ");
        for (int a : array2) {
            System.out.print(a + "\t");
        }
        int[] array3 = new int[sizeArr1 + sizeArr2];
        for (int i = 0; i < sizeArr1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < sizeArr2; i++) {
            array3[sizeArr1+i] = array2[i];
        }
        System.out.println("");
        System.out.print("Danh sach mang sau khi gop: ");
        for (int a: array3) {
            System.out.print(a+ "\t");
        }
    }
}
