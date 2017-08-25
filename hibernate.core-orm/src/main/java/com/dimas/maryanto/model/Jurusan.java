package com.dimas.maryanto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            joinColumns = @JoinColumn(name = "id_jurusan", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_mahasiswa", nullable = false)
    )
    private List<Mahasiswa> listMahasiswa = new ArrayList<>();
}
