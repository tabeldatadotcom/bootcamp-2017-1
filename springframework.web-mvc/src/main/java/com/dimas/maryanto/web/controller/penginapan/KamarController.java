package com.dimas.maryanto.web.controller.penginapan;

import com.dimas.maryanto.web.dao.HotelDao;
import com.dimas.maryanto.web.dao.KamarDao;
import com.dimas.maryanto.web.model.penginapan.Hotel;
import com.dimas.maryanto.web.model.penginapan.Kamar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KamarController {

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private KamarDao kamarDao;

    @GetMapping("/kamar/new")
    public String showForm(Model model, @RequestParam("id_hotel") String hotelId) {
        Hotel aHotel = hotelDao.findById(hotelId);
        Kamar aKamar = new Kamar();
        aKamar.setHotel(aHotel);

        model.addAttribute("newKamar", aKamar);
        return "/penginapan/kamar/newKamar";
    }

    @PostMapping("/kamar/proses")
    public String submitForm(@ModelAttribute("newKamar") Kamar aKamar) {
        aKamar.setAvailable(true);
        kamarDao.save(aKamar);
        return "redirect:/hotel/list";
    }
}
