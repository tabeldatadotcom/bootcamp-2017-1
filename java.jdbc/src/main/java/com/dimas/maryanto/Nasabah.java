package com.dimas.maryanto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    public Nasabah(String nomorRegister, String namaNasabah, Date tanggalLahir, Timestamp createOn) {
        this.nomorRegister = nomorRegister;
        this.namaNasabah = namaNasabah;
        this.tanggalLahir = tanggalLahir;
        this.createOn = createOn;
    }

    private Integer id;
    private String nomorRegister;
    private String namaNasabah;
    private Date tanggalLahir;
    private Timestamp createOn;
    private BigDecimal saldoTabungan;
    private Boolean status;

}
