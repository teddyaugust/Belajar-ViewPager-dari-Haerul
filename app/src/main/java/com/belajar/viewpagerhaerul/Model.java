package com.belajar.viewpagerhaerul;

public class Model {

    private int image;
    private String namaproduk;
    private String deskripsi;

    public Model(int image, String namaproduk, String deskripsi) {
        this.image = image;
        this.namaproduk = namaproduk;
        this.deskripsi = deskripsi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return namaproduk;
    }

    public void setTitle(String title) {
        this.namaproduk = title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
