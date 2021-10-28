package exam.controller;

import exam.services.Impl.MedicalRecordServiceImpl;
import exam.services.MedicalRecordService;

import java.util.Scanner;

public class MedicalManagementController {
    public static void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("--CHUONG TRINH QUAN LY BENH AN– ");
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println("1. Them moi ");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac benh an");
            System.out.println("4. Thoat");
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
                    System.exit(4);
                    break;
            }
        }
    }
    public static void addNew(){
        MedicalRecordService medicalRecordService = new MedicalRecordServiceImpl();
        medicalRecordService.addNewNormal();
        medicalRecordService.addNewVip();
    }
    public static void delete(){
        MedicalRecordService medicalRecordService = new MedicalRecordServiceImpl();
        medicalRecordService.delete();
    }
    public static void display(){
        MedicalRecordService medicalRecordService = new MedicalRecordServiceImpl();
        medicalRecordService.display();
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
