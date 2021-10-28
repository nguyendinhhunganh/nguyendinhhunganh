package exam.services.Impl;

import case_study.utils.ReadAndWrite;
import exam.models.MedicalRecord;
import exam.models.MedicalRecordNormal;
import exam.models.MedicalRecordVip;
import exam.services.MedicalRecordService;
import exam.services.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordServiceImpl implements MedicalRecordService {
    static Scanner scanner = new Scanner(System.in);
    static List<MedicalRecord> medicalRecordList = new ArrayList<>();

    static {
        medicalRecordList.add(new MedicalRecordVip(1, 1, "Nguyen Van A", "24/3", "23/24", 1241432  ));
    }

    @Override
    public void addNewVip() {
        int number = 1;
        if (!medicalRecordList.isEmpty()) {
            number = medicalRecordList.size() + 1;
        }
        System.out.println("Enter Medical record code");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day in:");
        String dayIn = scanner.nextLine();
        System.out.println("Enter day out: ");
        String dayOut = scanner.nextLine();
        System.out.println("Enter reason: ");
        String reason = scanner.nextLine();
        System.out.println("Enter Vip Type: ");
        int vipType = scanner.nextInt();
        System.out.println("Enter Vip duration");
        String vipDuration = scanner.nextLine();
        medicalRecordList.add(new MedicalRecordVip(number, id, name, dayIn, dayOut, reason, vipType, vipDuration));
        ReadAndWrite.write(medicalRecordList, "D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\exam\\data\\data.csv");
//
    }

    @Override
    public void addNewNormal() {
        int number = 1;
        if (!medicalRecordList.isEmpty()) {
            number = medicalRecordList.size() + 1;
        }
        System.out.println("Enter Medical record code");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day in:");
        String dayIn = scanner.nextLine();
        System.out.println("Enter day out: ");
        String dayOut = scanner.nextLine();
        System.out.println("Enter reason: ");
        System.out.println("Nhập viện phí");
        float hospitalCost = 0;
        try {
            hospitalCost = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        medicalRecordList.add(new MedicalRecordVip(number, id, name, dayIn, dayOut, hospitalCost));
        ReadAndWrite.write(medicalRecordList, "D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\exam\\data\\data.csv");

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        medicalRecordList = (List<MedicalRecord>) ReadAndWrite.read("D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\exam\\data\\data.csv");
        for (MedicalRecord medicalRecord : medicalRecordList) {
            System.out.println(medicalRecord);
        }
    }

    @Override
    public MedicalRecord isMedicalRecordService(int id) {
        for (MedicalRecord medicalRecord : medicalRecordList) {
            if (medicalRecord.getId() == id)
                return medicalRecord;
        }
        return null;
    }

    public static String addMaBenhNhan() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_MA_BENH_NHAN, "Nhập sai định dạng, mã bệnh nhân có dạng AAA-XXXX");
    }

    public static String addTenBenhNhan() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_TEN_BENH_NHAN, "Nhập sai định dạng của tên vui lòng nhập lại");
    }

    public static String addNgay() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_NGAY, "Nhập sai định dạng của ngày tháng năm vui lòng nhập lại");
    }

    public static String addVienPhi() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_VIEN_PHI, "Nhập sai vui lòng nhập lại, viện phí lớn hơn 10000");
    }

    public static String addLoaiVip() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_LOAI_VIP, "Nhập sai vui lòng nhập lại, loại vip là số từ 0-2");
    }

    static final String REGEX_MA_BENH_NHAN = "^[A][A][A][0-9]{4}$";
    static final String REGEX_TEN_BENH_NHAN = "^[A-Z][a-z]|\\s{6,}";
    static final String REGEX_NGAY = "^(0?[1-9]|[12][0-9]|3[01])[/](0?[1-9]|1[012])[/][0-9]{4}$";
    static final String REGEX_LOAI_VIP = "[0-2]";
    static final String REGEX_VIEN_PHI = "[1-9][0-9]{4,}";
}
