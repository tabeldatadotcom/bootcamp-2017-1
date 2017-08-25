package com.dimas.maryanto;

import com.dimas.maryanto.model.Jurusan;
import com.dimas.maryanto.model.Mahasiswa;
import com.dimas.maryanto.model.ProgramStudi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public SessionFactory getSessionFactory() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return sessionFactory;
    }

    public static void main(String[] args) {
        App aplikasi = new App();
        SessionFactory sessionFactory = aplikasi.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        ProgramStudi programStudi = new ProgramStudi();
        programStudi.setNama("Teknik Komputer");
        Integer idProgramStudi = (Integer) session.save(programStudi);

        Jurusan jurusan = new Jurusan();
        jurusan.setKode("IF");
        jurusan.setNama("Informatika");
        jurusan.setProdi(session.find(ProgramStudi.class, idProgramStudi));

        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim(10511112);
        mhs1.setNama("Dimas M");
        mhs1.setAngkatan(2011);
        mhs1.setJurusan("SI");
        mhs1.setTanggalLahir(DateInject.setValue(1993, 3, 28));
        listMahasiswa.add(mhs1);
        session.save(mhs1);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim(10511111);
        mhs2.setNama("Dimas M");
        mhs2.setAngkatan(2011);
        mhs2.setJurusan("AK");
        mhs2.setTanggalLahir(DateInject.setValue(1993, 3, 28));
        listMahasiswa.add(mhs2);
        session.save(mhs2);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim(10511110);
        mhs3.setNama("Dimas M");
        mhs3.setAngkatan(2012);
        mhs3.setJurusan("IF");
        mhs3.setTanggalLahir(DateInject.setValue(1993, 3, 28));
        listMahasiswa.add(mhs3);
        session.save(mhs3);

        jurusan.setListMahasiswa(listMahasiswa);
        String idJurusan = (String) session.save(jurusan);

        Jurusan tk = session.find(Jurusan.class, idJurusan);
        System.out.println(tk.toString());
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}
