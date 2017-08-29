package com.dimas.maryanto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "m_prodi")
public class ProgramStudi {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nama_program_studi", nullable = false)
    private String nama;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
