package com.dimas.maryanto.web.model.penginapan;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "m_sewa_kamar", schema = "penginapan")
public class SewaKamarHotel {

    @Id
    @GenericGenerator(name = "gen_sewa", strategy = "uuid2")
    @GeneratedValue(generator = "gen_sewa")
    private String id;

    @Column(name = "nomor_ktp", nullable = false, length = 64)
    private String nomorKtp;

    @Column(name = "nama_penyewa", nullable = false, length = 150)
    private String nama;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
