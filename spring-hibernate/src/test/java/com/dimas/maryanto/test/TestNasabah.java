package com.dimas.maryanto.test;

import com.dimas.maryanto.spring.data.config.SpringConfigurasion;
import com.dimas.maryanto.spring.data.models.JenisKelamin;
import com.dimas.maryanto.spring.data.models.Nasabah;
import com.dimas.maryanto.spring.data.repos.NasabahRepository;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfigurasion.class)
//@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
//        statements = "delete from m_nasabah")
public class TestNasabah extends TestCase {

    @Autowired
    private NasabahRepository nasabahRepo;

    @Test
    public void loadContext() {

    }

    @Test
    public void testSimpanNasabah() {
        Nasabah nasabah = new Nasabah();
        nasabah.setNama("Dimas Maryanto");
        nasabah.setJenisKelamin(JenisKelamin.L);
        nasabah.setTanggalLahir(Date.valueOf(LocalDate.of(1993, 4, 20)));
        nasabah.setEmail("engineer.dimmaryanto93@outlook.com");
        nasabah.setCreateOn(Timestamp.valueOf(LocalDateTime.now()));
        nasabah.setAlamat("Jl. bukit indah no B8");
        nasabahRepo.save(nasabah);
    }

    @Test
    @After
    public void testCariNasabah() {
        Nasabah nasabah = nasabahRepo.findByEmail("engineer.dimmaryanto93@outlook.com");
        assertNotNull("nasabah tidak boleh kosong!!!", nasabah);
        nasabahRepo.delete(nasabah);
    }
}
