package ktra;

public class SanPhamXuatKhau extends SanPham {
    private float giaXuatKhau;
    private String quocGiaNhap;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int id, String maSP, String tenSP, float giaTien, int soLuong, String nhaSX, float giaXuatKhau, String quocGiaNhap) {
        super(id, maSP, tenSP, giaTien, soLuong, nhaSX);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public float getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(float giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                giaXuatKhau + "," +
                quocGiaNhap;
    }
}
