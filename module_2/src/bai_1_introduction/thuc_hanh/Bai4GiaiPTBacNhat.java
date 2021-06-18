package bai_1_introduction.thuc_hanh;

import java.util.Scanner;

public class Bai4GiaiPTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("PT dạng ax+b=0, nhập a, b tìm x");
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("PT có vô số nghiệm");
        }
        else if (a == 0 && b != 0){
            System.out.println("PT vo nghiem");
        }
        else {
            float x = (-b)/a;
            System.out.println(x);
        }
    }
}
