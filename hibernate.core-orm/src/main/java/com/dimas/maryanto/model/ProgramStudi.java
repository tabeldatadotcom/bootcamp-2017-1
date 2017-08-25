package com.dimas.maryanto.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "m_prodi")
public class ProgramStudi {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nama_program_studi", nullable = false)
    private String nama;
}
