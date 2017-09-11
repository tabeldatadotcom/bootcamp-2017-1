package com.dimas.maryanto.web.model.penginapan;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "m_kamar", schema = "penginapan")
public class Kamar {

    @Id
    @GenericGenerator(name = "gen_kamar", strategy = "uuid2")
    @GeneratedValue(generator = "gen_kamar")
    @Column(name = "id_kamar")
    private String id;

    @Column(name = "nomor_kamar", nullable = false, length = 50)
    private String nomorKamar;

    @Column(name = "jumlah_orang", length = 3, nullable = false)
    private Integer jumlahOrang;

    @Column(name = "harga_kamar", nullable = false)
    private BigDecimal harga;

    @ManyToOne
    @JoinColumn(nullable = false, name = "hotel_id")
    private Hotel hotel;

    @Column(name = "is_available", nullable = false)
    private Boolean available;

    @OneToOne
    @JoinColumn(name = "sewa_id")
    private SewaKamarHotel sewa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public Integer getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(Integer jumlahOrang) {
        this.jumlahOrang = jumlahOrang;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public SewaKamarHotel getSewa() {
        return sewa;
    }

    public void setSewa(SewaKamarHotel sewa) {
        this.sewa = sewa;
    }
}
