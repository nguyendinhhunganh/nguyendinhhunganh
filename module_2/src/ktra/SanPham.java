package ktra;

public abstract class SanPham {
    private int id;
    private String maSP;
    private String tenSP;
    private float giaTien;
    private int soLuong;
    private String nhaSX;

    public SanPham() {
    }

    public SanPham(int id, String maSP, String tenSP, float giaTien, int soLuong, String nhaSX) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        return
                id + "," +
                maSP + "," +
                tenSP + "," +
                giaTien + "," +
                soLuong + "," +
                nhaSX;
    }
}
