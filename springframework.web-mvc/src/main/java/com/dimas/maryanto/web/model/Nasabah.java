package com.dimas.maryanto.web.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "m_nasabah", schema = "master")
public class Nasabah {

    @Id
    @GenericGenerator(name = "gen_nasabah", strategy = "uuid2")
    @GeneratedValue(generator = "gen_nasabah")
    private String nomorRegister;

    @Column(nullable = false, length = 50)
    private String nama;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "jenis_kelamin", nullable = false)
    private JenisKelamin jenisKelamin;

    public Nasabah() {
    }

    public Nasabah(String nomorRegister, String nama) {
        this.nama = nama;
        this.nomorRegister = nomorRegister;
    }

    public Nasabah(String nomorRegister, String nama, JenisKelamin jk) {
        this.nama = nama;
        this.nomorRegister = nomorRegister;
        this.jenisKelamin = jk;
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

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
