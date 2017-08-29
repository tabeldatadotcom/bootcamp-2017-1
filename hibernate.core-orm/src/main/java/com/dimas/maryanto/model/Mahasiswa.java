package com.dimas.maryanto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "m_mahasiswa")
public class Mahasiswa {

    @Id
    @Column(name = "nomor_induk", nullable = false, unique = true, length = 10)
    private Integer nim;

    @Column(name = "nama_mahasiswa", nullable = false, length = 50)
    private String nama;

    @Column(nullable = false, length = 4)
    private Integer angkatan;

    @Column(nullable = false)
    private Date tanggalLahir;

    @ManyToOne
    @JoinColumn(name = "id_jurusan", nullable = false)
    private Jurusan jurusan;

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(Integer angkatan) {
        this.angkatan = angkatan;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
}
