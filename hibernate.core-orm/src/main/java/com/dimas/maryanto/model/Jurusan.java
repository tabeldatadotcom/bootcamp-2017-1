package com.dimas.maryanto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "m_jurusan")
public class Jurusan {

    @Id
    @GenericGenerator(name = "jurusan_uuid", strategy = "uuid2")
    @GeneratedValue(generator = "jurusan_uuid")
    private String id;

    @Column(name = "kode_jurusan")
    private String kode;

    @Column(name = "nama_jurusan", length = 50)
    private String nama;

    @OneToOne
    @JoinColumn(name = "id_program_studi", nullable = false)
    private ProgramStudi prodi;

    @OneToMany(mappedBy = "jurusan", orphanRemoval = true, cascade = CascadeType.ALL)
//    @JoinTable(
//            joinColumns = @JoinColumn(name = "id_jurusan", nullable = false),
//            inverseJoinColumns = @JoinColumn(name = "id_mahasiswa", nullable = false)
//    )
    private List<Mahasiswa> listMahasiswa = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ProgramStudi getProdi() {
        return prodi;
    }

    public void setProdi(ProgramStudi prodi) {
        this.prodi = prodi;
    }

    public List<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public void setListMahasiswa(List<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }
}
