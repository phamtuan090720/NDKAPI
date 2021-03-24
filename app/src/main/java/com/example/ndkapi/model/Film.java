package com.example.ndkapi.model;

public class Film {
    private int maPhim;
    private String tenPhim;
    private String biDanh;
    private String trailer;
    private String hinhAnh;
    private String moTa;
    private String maNhom;
    private String ngayKhoiChieu;
    private int danhGia;
    public int getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(int maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getBiDanh() {
        return biDanh;
    }

    public void setBiDanh(String biDanh) {
        this.biDanh = biDanh;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public void setNgayKhoiChieu(String ngayKhoiChieu) {
        this.ngayKhoiChieu = ngayKhoiChieu;
    }

    public int getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(int danhGia) {
        this.danhGia = danhGia;
    }


    @Override
    public String toString() {
        return "Film{" + '\n' +
                "maPhim=" + maPhim +
                ", tenPhim='" + tenPhim + '\'' +
                ", biDanh='" + biDanh + '\'' +
                ", trailer='" + trailer + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", moTa='" + moTa + '\'' +
                ", maNhom='" + maNhom + '\'' +
                ", ngayKhoiChieu='" + ngayKhoiChieu + '\'' +
                ", danhGia=" + danhGia +
                '}';
    }
}
