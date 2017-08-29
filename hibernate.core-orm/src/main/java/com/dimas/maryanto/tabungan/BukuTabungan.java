package com.dimas.maryanto.tabungan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BukuTabungan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String kode;

    @Column(name = "tanggal_transaksi", nullable = false)
    private Date tanggalTransaksi;

    @ManyToOne
    @JoinColumn(name = "id_tabungan", nullable = false)
    private Tabungan tabungan;

    private BigDecimal debet;

    private BigDecimal kredit;

    private BigDecimal saldo;

}
