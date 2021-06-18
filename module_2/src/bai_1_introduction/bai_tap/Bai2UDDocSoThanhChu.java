package bai_1_introduction.bai_tap;
import java.util.Scanner;
public class Bai2UDDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 10 && number >= 0)
        {
            switch (number){
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                case 4:
                    System.out.println("Four");
                case 5:
                    System.out.println("Five");
                case 6:
                    System.out.println("Six");
                case 7:
                    System.out.println("Seven");
                case 8:
                    System.out.println("Eight");
                case 9:
                    System.out.println("Nine");

            }
        }
    }
}
