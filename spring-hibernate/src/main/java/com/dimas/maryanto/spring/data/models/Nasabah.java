package com.dimas.maryanto.spring.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_nasabah")
public class Nasabah {

    @Id
    @GenericGenerator(name = "gen_nasabah", strategy = "uuid2")
    @GeneratedValue(generator = "gen_nasabah")
    private String id;

    @Column(nullable = false, length = 50)
    private String nama;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, name = "tanggal_lahir")
    private Date tanggalLahir;

    @Column(name = "create_on", nullable = false)
    private Timestamp createOn;

    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_kelamin", nullable = false)
    private JenisKelamin jenisKelamin;

}
