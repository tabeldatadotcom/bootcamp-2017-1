package com.dimas.maryanto;

import com.dimas.maryanto.model.Jurusan;
import com.dimas.maryanto.model.Mahasiswa;
import com.dimas.maryanto.tabungan.BukuTabungan;
import com.dimas.maryanto.tabungan.Nasabah;
import com.dimas.maryanto.tabungan.Produk;
import com.dimas.maryanto.tabungan.Tabungan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private final static Logger console = LoggerFactory.getLogger(App.class);

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

        Produk tabunganKu = new Produk(0, "TabunganKu", 3.5, new BigDecimal(1000), new BigDecimal(100000));
        Produk tabunganMapan = new Produk(0, "Tabungan Mapan", 4.0, new BigDecimal(4500), new BigDecimal(500000));
        Produk tabunganUmroh = new Produk(0, "Tabungan Umroh", 2.5, new BigDecimal(100), new BigDecimal(100000));
        Integer idTabunganKu = (Integer) session.save(tabunganKu);
        session.save(tabunganMapan);
        session.save(tabunganUmroh);

        tabunganKu = session.get(Produk.class, idTabunganKu);

        Nasabah nasabah = new Nasabah();
        nasabah.setNama("Sulaeman Hasim");
        Integer idNasabah = (Integer) session.save(nasabah);
        nasabah = session.get(Nasabah.class, idNasabah);

        Tabungan tabungan = new Tabungan();
        tabungan.setSaldo(new BigDecimal(0));
        tabungan.setNasabah(nasabah);
        tabungan.setProdukTabungan(tabunganKu);
        Integer idTabungan = (Integer) session.save(tabungan);
        tabungan = session.get(Tabungan.class, idTabungan);

        session.save(new BukuTabungan(0, "001", Date.valueOf(LocalDate.of(2018, 8, 1)), tabungan, new BigDecimal(250000), BigDecimal.ZERO, new BigDecimal(250000)));
        tabungan.setSaldo(new BigDecimal(250000));
        session.update(tabungan);

        session.save(new BukuTabungan(0, "001", Date.valueOf(LocalDate.of(2018, 8, 20)), tabungan, new BigDecimal(250000), BigDecimal.ZERO, new BigDecimal(500000)));
        tabungan.setSaldo(new BigDecimal(500000));
        session.update(tabungan);

        session.save(new BukuTabungan(0, "001", Date.valueOf(LocalDate.of(2018, 8, 21)), tabungan, new BigDecimal(50000), BigDecimal.ZERO, new BigDecimal(550000)));
        tabungan.setSaldo(new BigDecimal(550000));
        session.update(tabungan);

        session.save(new BukuTabungan(0, "002", Date.valueOf(LocalDate.of(2018, 8, 22)), tabungan, BigDecimal.ZERO, new BigDecimal(250000), new BigDecimal(250000)));
        tabungan.setSaldo(new BigDecimal(250000));
        session.update(tabungan);

        session.getTransaction().commit();

        Criteria criteria = session.createCriteria(BukuTabungan.class)
                .add(Restrictions.eq("tabungan.id", tabungan.getId()))
                .addOrder(Order.desc("tanggalTransaksi"));
        List<BukuTabungan> listBukuTabungan = criteria.list();
        for (BukuTabungan buku : listBukuTabungan) {
            console.info("{} | {} | {} | {} | {}", buku.getKode(), buku.getDebet(), buku.getKredit(), buku.getSaldo(), buku.getTabungan().getSaldo());
        }

//        ProgramStudi programStudi = new ProgramStudi();
//        programStudi.setNama("Teknik Komputer");
//        Integer idProgramStudi = (Integer) session.save(programStudi);
//
//        Jurusan jurusan = new Jurusan();
//        jurusan.setKode("IF");
//        jurusan.setNama("Informatika");
//        jurusan.setProdi(session.find(ProgramStudi.class, idProgramStudi));
//        String idJurusan = (String) session.save(jurusan);
//        Jurusan jurusanIf = session.get(Jurusan.class, idJurusan);
//
//        List<Mahasiswa> listMahasiswa = new ArrayList<>();
//        Mahasiswa mhs1 = new Mahasiswa();
//        mhs1.setNim(10511112);
//        mhs1.setNama("Dimas M");
//        mhs1.setAngkatan(2011);
//        mhs1.setJurusan(jurusanIf);
//        mhs1.setTanggalLahir(DateInject.setValue(1993, 3, 28));
//        listMahasiswa.add(mhs1);
//        session.save(mhs1);
//
//        Mahasiswa mhs2 = new Mahasiswa();
//        mhs2.setNim(10511111);
//        mhs2.setNama("Dimas M");
//        mhs2.setAngkatan(2011);
//        mhs2.setJurusan(jurusanIf);
//        mhs2.setTanggalLahir(DateInject.setValue(1993, 3, 28));
//        listMahasiswa.add(mhs2);
//        session.save(mhs2);
//
//        Mahasiswa mhs3 = new Mahasiswa();
//        mhs3.setNim(10511110);
//        mhs3.setNama("Dimas M");
//        mhs3.setAngkatan(2012);
//        mhs3.setJurusan(jurusanIf);
//        mhs3.setTanggalLahir(DateInject.setValue(1993, 3, 28));
//        listMahasiswa.add(mhs3);
//        session.save(mhs3);
//        session.getTransaction().commit();


//        Criteria criteria = session.createCriteria(ProgramStudi.class);
//        criteria.add(Restrictions.eq("id", 1));
//        List<ProgramStudi> listProgramStudi = criteria.list();

//        Query query = session.createQuery("from ProgramStudi where id = :id");
//        query.setParameter("id", 1);
//        query.setMaxResults(10);
//
//        List<ProgramStudi> listProgramStudi = query.getResultList();
//        int size = listProgramStudi.size();
//
//
//        for (ProgramStudi prodi : listProgramStudi) {
//            System.out.println(prodi.toString());
//        }

//        Criteria criteria = session.createCriteria(Jurusan.class);
//        List<Jurusan> listJurusan = criteria.list();
//        for (Jurusan jurusan : listJurusan) {
////            console.info("{}, {}, {}, {}", j.getId(), j.getKode(), j.getNama());
//            for (Mahasiswa mahasiswa : jurusan.getListMahasiswa()) {
//                console.info("mahasiswa [{}, {}, {}] : jurusan [{}, {}]", mahasiswa.getNim(),
//                        mahasiswa.getNama(), mahasiswa.getAngkatan(), jurusan.getKode(), jurusan.getNama());
//            }
//        }

        session.close();
        sessionFactory.close();
    }
}
