package com.dimas.maryanto.web.model;

public class Nasabah {
    private String nama;
    private String nomorRegister;

    public Nasabah() {
    }

    public Nasabah(String nomorRegister, String nama) {
        this.nama = nama;
        this.nomorRegister = nomorRegister;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorRegister() {
        return nomorRegister;
    }

    public void setNomorRegister(String nomorRegister) {
        this.nomorRegister = nomorRegister;
    }
}
