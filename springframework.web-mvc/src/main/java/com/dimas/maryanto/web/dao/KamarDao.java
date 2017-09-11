package com.dimas.maryanto.web.dao;

import com.dimas.maryanto.web.model.penginapan.Hotel;
import com.dimas.maryanto.web.model.penginapan.Kamar;
import com.dimas.maryanto.web.repository.penginapan.KamarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public class KamarDao {

    @Autowired
    private KamarRepository kamarRepository;

    @Autowired
    private HotelDao hotelDao;

    @Transactional(readOnly = false)
    public void save(Kamar kamar) {
        Hotel hotel = hotelDao.findById(kamar.getHotel().getId());
        kamar.setHotel(hotel);
        kamarRepository.save(kamar);
    }
}
