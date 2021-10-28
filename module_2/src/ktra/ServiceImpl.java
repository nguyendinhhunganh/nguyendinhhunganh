package ktra;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<SanPham> sanPhams = new ArrayList<>();
    static final String REGEX_MA_SAN_PHAM = "^[M][S][P][0-9]{4}$";
    static final String REGEX_TEN = "^([a-z]|\\s){1,}";
    static final String REGEX_GIA = "[1-9][0-9]{4,}";
    static final String REGEX_GIA_NHAP = "[1-9][0-9]{3,}";
    static final String REGEX_SO_LUONG = "[1-9]{1,}";

    @Override
    public void addNew() {
        int choice = 0;
        System.out.println("1. Them moi sp nhap khau");
        System.out.println("2. Them moi sp xuat khau");
        System.out.println("3. Quay lai menu chinh");
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        switch (choice) {
            case 1: {
                themMoiSPNhapKhau();
                break;
            }
            case 2: {
                themMoiSPXuatKhau();
                break;
            }
            case 3:
                break;
        }
    }

    @Override
    public void display() {
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
        }
    }

    public SanPham isSanPham(String maSanPham) {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getMaSP().equals(maSanPham)) {
                return sanPham;
            }
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma san pham can xoa: ");
        String maSanPham = input.nextLine();
        SanPham sanPhamXoa = isSanPham(maSanPham);
        sanPhams.remove(sanPhamXoa);
        ReadAndWrite.writeCharacter(sanPhams, "D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\ktra\\data.csv");
    }

    @Override
    public void search() {
        System.out.println("Nhap ma san pham can tim: ");
        String maSanPham = input.nextLine();
        SanPham sanPhamTim = isSanPham(maSanPham);
        System.out.println(sanPhamTim);
    }

    public void themMoiSPNhapKhau() {
        int number = 1;
        if (!sanPhams.isEmpty()) {
            number = sanPhams.size() + 1;
        }
        System.out.println("Nhap ma san pham: ");
        String maSP = addMaSanPham();
        System.out.println("Nhap ten san pham:");
        String nameSP = addTen();
        System.out.println("Nhap gia ban");
        Float giaBan = Float.parseFloat(addGia());
        System.out.println("Nhap so luong ");
//        int soLuong = 0;
//        while (soLuong == 0) {
//            try {
//                soLuong = Integer.parseInt(input.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Vui long nhap lai so luong");
//            }
//        }
        Integer soLuong = Integer.parseInt(addSL());
        System.out.println("Nhap nha san xuat");
        String nhaSanXuat = addTen();
        System.out.println("Nhap gia nhap khau");
        Float giaNhap = Float.parseFloat(addGiaNhap());
        System.out.println("Nhap tinh thanh nhap");
        String tinhThanhNhap = addTen();
        System.out.println("Nhap thue nhap khau (%):");
//        Float thueNhapKhau = Float.parseFloat(addGia());
        float thueNhapKhau = 0;
        while (thueNhapKhau == 0) {
            try {
                thueNhapKhau = Float.parseFloat(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai thue");
            }
        }
        sanPhams.add(new SanPhamNhapKhau(number, maSP, nameSP, giaBan, soLuong, nhaSanXuat, giaNhap, tinhThanhNhap, thueNhapKhau));
        ReadAndWrite.writeCharacter(sanPhams, "D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\ktra\\data.csv");
//
    }

    public static String addMaSanPham() {
        return exam.services.RegexData.regexStr(input.nextLine(), REGEX_MA_SAN_PHAM, "Nhập sai định dạng, mã san pham có dạng MSP-XXXX");
    }

    public static String addTen() {
        return exam.services.RegexData.regexStr(input.nextLine(), REGEX_TEN, "Nhập sai định dạng của tên vui lòng nhập lại");
    }
    public static String addSL() {
        return exam.services.RegexData.regexStr(input.nextLine(), REGEX_SO_LUONG, "Nhập sai vui lòng nhập lại, so luong lớn hơn 0");
    }
    public static String addGia() {
        return exam.services.RegexData.regexStr(input.nextLine(), REGEX_GIA, "Nhập sai vui lòng nhập lại, giá lớn hơn 10000");
    }
    public static String addGiaNhap() {
        return exam.services.RegexData.regexStr(input.nextLine(), REGEX_GIA_NHAP, "Nhập sai vui lòng nhập lại, giá lớn hơn 1000");
    }


    public void themMoiSPXuatKhau() {
        int number = 1;
        if (!sanPhams.isEmpty()) {
            number = sanPhams.size() + 1;
        }
        System.out.println("Nhap ma san pham: ");
        String maSP = addMaSanPham();
        System.out.println("Nhap ten san pham:");
        String nameSP = addTen();
        System.out.println("Nhap gia ban");
        Float giaBan = Float.parseFloat(addGia());
        System.out.println("Nhap so luong ");
        Integer soLuong = Integer.parseInt(addSL());
        System.out.println("Nhap nha san xuat");
        String nhaSanXuat = addTen();
        System.out.println("Nhap gia xuat khau");
        Float giaXuat = Float.parseFloat(addGia());
        System.out.println("Nhap quoc gia");
        String quocGia = addTen();
        sanPhams.add(new SanPhamXuatKhau(number, maSP, nameSP, giaBan, soLuong, nhaSanXuat, giaXuat, quocGia));
        ReadAndWrite.writeCharacter(sanPhams, "D:\\Study\\Codegym\\A0321I1-NguyenDinhHungAnh\\module_2\\src\\ktra\\data.csv");
    }
}
