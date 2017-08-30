package com.dimas.maryanto.spring.data.dao;

import com.dimas.maryanto.spring.data.models.Nasabah;
import com.dimas.maryanto.spring.data.repos.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class NasabahDao {

    @Autowired
    private NasabahRepository nasabahRepo;


    @Transactional(readOnly = false)
    public void saveNasabah(Nasabah nasabah) {
//        save lain....
        nasabahRepo.save(nasabah);
//        saven lain .....
    }

    @Transactional(readOnly = false)
    public void delete(String id) {
        Nasabah nasabah = nasabahRepo.findOne(id);
        nasabahRepo.delete(nasabah);
    }

    public List<Nasabah> getAll(){
        return nasabahRepo.findAll();
    }
}
