package com.dimas.maryanto.spring.data.repos;

import com.dimas.maryanto.spring.data.models.Nasabah;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NasabahRepository extends CrudRepository<Nasabah, String> {

    List<Nasabah> findAll();

    Nasabah findByEmail(String namaEmail);

}
