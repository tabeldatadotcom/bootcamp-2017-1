package com.dimas.maryanto.web.dao;

import com.dimas.maryanto.web.model.Nasabah;
import com.dimas.maryanto.web.repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class NasabahDao {

    @Autowired
    private NasabahRepository repository;

    @Transactional(readOnly = false)
    public Nasabah save(Nasabah nasabah) {
        return repository.save(nasabah);
    }

    @Transactional(readOnly = false)
    public void hapus(Nasabah nasabah) {
        repository.delete(nasabah);
    }

    public Nasabah findByNomorRegister(String nomorRegister){
        return repository.findOne(nomorRegister);
    }

    public List<Nasabah> findAll(){
        return repository.findAll();
    }


}
