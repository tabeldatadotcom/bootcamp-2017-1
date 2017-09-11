package com.dimas.maryanto.web.repository.penginapan;

import com.dimas.maryanto.web.model.penginapan.Hotel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface HotelRepository extends PagingAndSortingRepository<Hotel, String> {

    List<Hotel> findAll();
}
