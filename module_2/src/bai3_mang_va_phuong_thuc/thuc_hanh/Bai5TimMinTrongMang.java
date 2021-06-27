package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class Bai5TimMinTrongMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = findMin(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
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
    }}
