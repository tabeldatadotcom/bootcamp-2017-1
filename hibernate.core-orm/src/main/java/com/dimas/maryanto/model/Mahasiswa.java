package com.dimas.maryanto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mahasiswa {

    @Id
    @Column(name = "nomor_induk", nullable = false, unique = true)
    private Integer nim;
    private String nama;
    private Integer angkatan;
    private Date tanggalLahir;
    private String jurusan;
}
