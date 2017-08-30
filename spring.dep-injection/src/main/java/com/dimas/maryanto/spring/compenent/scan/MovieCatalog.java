package com.dimas.maryanto.spring.compenent.scan;

public class MovieCatalog {

    private String nama;
    private String kode;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "{nama:" + this.nama + ", kode:" + this.kode + "}";
    }
}
