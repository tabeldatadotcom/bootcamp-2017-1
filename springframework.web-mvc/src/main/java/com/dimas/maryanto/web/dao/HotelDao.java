package com.dimas.maryanto.web.dao;

import com.dimas.maryanto.web.model.penginapan.Hotel;
import com.dimas.maryanto.web.repository.penginapan.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class HotelDao {

    @Autowired
    private HotelRepository repoHotel;

    @Transactional(readOnly = false)
    public void save(Hotel hotel) {
        repoHotel.save(hotel);
    }

    //    @Transactional(readOnly = true)
    public List<Hotel> daftarHotel() {
        return repoHotel.findAll();
    }

    public Hotel findById(String id) {
        return repoHotel.findOne(id);
    }
}
