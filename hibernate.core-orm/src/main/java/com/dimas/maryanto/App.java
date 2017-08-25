package com.dimas.maryanto;

import com.dimas.maryanto.model.Mahasiswa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Date;
import java.time.LocalDate;

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
        Mahasiswa dimas = new Mahasiswa();
        dimas.setNim(10511148);
        dimas.setNama("Dimas Maryanto");
        dimas.setTanggalLahir(DateInject.setValue(1993, 03, 28));
        dimas.setAngkatan(2011);
        dimas.setJurusan("Sistem Komputer");

        App aplikasi = new App();
        SessionFactory sessionFactory = aplikasi.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(dimas);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
