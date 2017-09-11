package com.dimas.maryanto.web.model.penginapan;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "m_hotel", schema = "penginapan")
public class Hotel {

    @Id
    @GenericGenerator(name = "gen_hotel", strategy = "uuid2")
    @GeneratedValue(generator = "gen_hotel")
    private String id;

    @Column(name = "nama_hotel", nullable = false, length = 50)
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kota_hotel", nullable = false)
    private String kota;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private List<Kamar> listKamar = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public List<Kamar> getListKamar() {
        return listKamar;
    }

    public void setListKamar(List<Kamar> listKamar) {
        this.listKamar = listKamar;
    }
}
