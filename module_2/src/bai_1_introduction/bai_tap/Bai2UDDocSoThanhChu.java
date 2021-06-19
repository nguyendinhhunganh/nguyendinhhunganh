package bai_1_introduction.bai_tap;

import java.util.Scanner;

public class Bai2UDDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int number = scanner.nextInt();
        String read = "";
        int check1Digit = 0;
        int check2Digit = 0;
        int check3Digit = 0;
        if (number < 100 && number > 0) {
            check2Digit = number / 10;
            check1Digit = number % 10;
        } else if (number < 999 && number >= 100) {
            check3Digit = number / 100;
            check2Digit = number % 100 / 10;
            check1Digit = number % 100 % 10;
        }
        switch (check3Digit) {
            case 1:
                read += "One hundred ";
                break;
            case 2:
                read += "Two hundred ";
                break;
            case 3:
                read += "Three hundred ";
                break;
            case 4:
                read += "Four hundred ";
                break;
            case 5:
                read += "Five hundred ";
                break;
            case 6:
                read += "Six hundred ";
                break;
            case 7:
                read += "Seven hundred ";
                break;
            case 8:
                read += "Eight hundred ";
                break;
            case 9:
                read += "Nine hundred ";
                break;
        }
        switch (check2Digit) {
            case 2:
                read += "Twenty ";
                break;
            case 3:
                read += "Thirty ";
                break;
            case 4:
                read += "Fourty ";
                break;
            case 5:
                read += "Fifty ";
                break;
            case 6:
                read += "Sixty ";
                break;
            case 7:
                read += "Seventy ";
                break;
            case 8:
                read += "Eighty ";
                break;
            case 9:
                read += "Ninety ";
                break;
        }
        if (check2Digit == 1) {
            switch (check1Digit) {
                case 0:
                    read += "ten";
                    break;
                case 1:
                    read += "eleven";
                    break;
                case 2:
                    read += "twelve";
                    break;
                case 3:
                    read += "thirty";
                    break;
                case 4:
                    read += "Fourteen";
                    break;
                case 5:
                    read += "fifteen";
                    break;
                case 6:
                    read += "sixteen";
                    break;
                case 7:
                    read += "Seventeen";
                    break;
                case 8:
                    read += "Eighteen";
                    break;
                case 9:
                    read += "Nineteen";
                    break;
            }
        } else {
            switch (check1Digit) {
                case 1:
                    read += "One";
                    break;
                case 2:
                    read += "Two";
                    break;
                case 3:
                    read += "Three";
                    break;
                case 4:
                    read += "Four";
                    break;
                case 5:
                    read += "Five";
                    break;
                case 6:
                    read += "Six";
                    break;
                case 7:
                    read += "Seven";
                    break;
                case 8:
                    read += "Eight";
                    break;
                case 9:
                    read += "Nine";
                    break;
            }
        }
        System.out.println(read);
    }
}
