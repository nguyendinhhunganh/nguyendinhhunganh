package ktra;

import java.util.Scanner;

public class RegexData {
    public static String regexStr(String temp, String regex, String error) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
}
