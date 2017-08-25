package com.dimas.maryanto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @Column(name = "jurusan", nullable = false)
    private String jurusan;
}
