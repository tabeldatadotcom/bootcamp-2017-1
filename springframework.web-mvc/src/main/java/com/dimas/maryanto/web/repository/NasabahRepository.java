package com.dimas.maryanto.web.repository;

import com.dimas.maryanto.web.model.JenisKelamin;
import com.dimas.maryanto.web.model.Nasabah;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface NasabahRepository
        extends PagingAndSortingRepository<Nasabah, String> {

    List<Nasabah> findAll();

    Nasabah findByNomorRegisterAndNamaAndJenisKelamin(String nomorRegister, String nama, JenisKelamin jk);


}
