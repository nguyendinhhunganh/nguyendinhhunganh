package bai_2_vong_lap.bai_tap;

public class Bai3HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(i);
            }
        }
    }
}
