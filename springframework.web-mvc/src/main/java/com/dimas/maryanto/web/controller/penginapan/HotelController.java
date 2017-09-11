package com.dimas.maryanto.web.controller.penginapan;

import com.dimas.maryanto.web.dao.HotelDao;
import com.dimas.maryanto.web.model.penginapan.Hotel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HotelController {

    private final static Logger console = LoggerFactory.getLogger(HotelController.class);

    @Autowired
    private HotelDao hotelDao;

    @RequestMapping(value = "/hotel/new", method = RequestMethod.GET)
    public ModelAndView showForm() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/penginapan/hotel/newHotel");
        mav.addObject("aHotel", new Hotel());
        return mav;
    }

    @RequestMapping(value = "/hotel/proses", method = RequestMethod.POST)
    public String prosesSubmitHotelBaru(@ModelAttribute("aHotel") Hotel hotel) {
        hotelDao.save(hotel);
        console.info("nama {}, alamat {}", hotel.getNama(), hotel.getAlamat());
        return "redirect:/hotel/new";
    }

    @GetMapping("/hotel/list")
    public String showList(Model model) {
        List<Hotel> listHotel = hotelDao.daftarHotel();
        model.addAttribute("listOfHotels", listHotel);
        return "/penginapan/hotel/listHotel";
    }
}