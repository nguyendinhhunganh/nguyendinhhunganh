package ktra;

import java.util.Scanner;

public class QuanLySPController {
    static ServiceImpl service = new ServiceImpl();

    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("--CHUONG TRINH QUAN LY SAN PHAM– ");
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println("1. Them moi ");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac san pham");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    System.exit(4);
                    break;

            }
        }
    }

    public static void addNew() {
        service.addNew();
    }

    public static void delete() {
        service.delete();
    }

    public static void display() {
        service.display();
    }

    public static void timKiem() {
        service.search();
    }
}
