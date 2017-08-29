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
@Table(name = "m_produk")
public class Produk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nama;

    private Double bungaPerAnum;

    private BigDecimal biayaAdmin;

    private BigDecimal setoranAwal;
}
