package com.dimas.maryanto.web.controller;

import com.dimas.maryanto.web.model.Nasabah;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/nasabah")
public class NasabahController {


    private static final Logger console = LoggerFactory.getLogger(NasabahController.class);

    @GetMapping(value = "info")
    public ModelAndView showDaftarNasabah() {
        List<Nasabah> listOfNasabah = new ArrayList<>();
        listOfNasabah.add(new Nasabah("001", "Dimas"));
        listOfNasabah.add(new Nasabah("002", "Dimas1"));
        listOfNasabah.add(new Nasabah("003", "Dimas2"));
        listOfNasabah.add(new Nasabah("004", "Dimas3"));

        ModelAndView mav = new ModelAndView();
        mav.setViewName("daftar");
        mav.addObject("listOfNasabah", listOfNasabah);
        return mav;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public ModelAndView showForm(Nasabah nasabah) {
        ModelAndView mav = new ModelAndView("form");
        mav.addObject("nasabah", nasabah);
        return mav;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView prosesSimpan(
            @ModelAttribute(name = "nasabah") Nasabah nasabah)
            throws IOException {
        ModelAndView mav = new ModelAndView("info");
        mav.addObject("nasabah", nasabah);
        return mav;
    }

}
