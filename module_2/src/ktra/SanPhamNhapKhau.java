package ktra;

public class SanPhamNhapKhau extends SanPham {
    private float giaNhapKhau;
    private String tinhNhap;
    private float thueNhapKhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(float giaNhapKhau, String tinhNhap, float thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhap = tinhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(int id, String maSP, String tenSP, float giaTien, int soLuong, String nhaSX, float giaNhapKhau, String tinhNhap, float thueNhapKhau) {
        super(id, maSP, tenSP, giaTien, soLuong, nhaSX);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhap = tinhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public float getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(float giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhap() {
        return tinhNhap;
    }

    public void setTinhNhap(String tinhNhap) {
        this.tinhNhap = tinhNhap;
    }

    public float getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(float thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                giaNhapKhau + "," +
                tinhNhap + "," +
                thueNhapKhau;
    }
}
