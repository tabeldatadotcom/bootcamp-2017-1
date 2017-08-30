package com.dimas.maryanto.spring.data;

import com.dimas.maryanto.spring.data.config.SpringConfigurasion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Aplikasi {

    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfigurasion.class);
//        NasabahRepository nasabahRepo = springContext.getBean(NasabahRepository.class);
//        Nasabah nasabah = new Nasabah();
//        nasabah.setNama("Dimas Maryanto");
//        nasabah.setJenisKelamin(JenisKelamin.L);
//        nasabah.setTanggalLahir(Date.valueOf(LocalDate.of(1993, 4, 20)));
//        nasabah.setEmail("engineer.dimmaryanto93@outlook.com");
//        nasabah.setCreateOn(Timestamp.valueOf(LocalDateTime.now()));
//        nasabah.setAlamat("Jl. bukit indah no B8");
//        nasabahRepo.save(nasabah);
    }
}
