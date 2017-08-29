package com.dimas.maryanto.tabungan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_tabungan")
public class Tabungan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_nasabah", nullable = false)
    private Nasabah nasabah;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Produk produkTabungan;

    @Column(name = "saldo_saat_ini", nullable = false)
    private BigDecimal saldo;
}
