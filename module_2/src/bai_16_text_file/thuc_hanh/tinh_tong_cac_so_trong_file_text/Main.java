package bai_16_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText("D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\bai_16_text_file\\thuc_hanh\\tinh_tong_cac_so_trong_file_text\\Numbers.txt");
    }
}
