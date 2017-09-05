package com.dimas.maryanto.web.controller;

import com.dimas.maryanto.web.dao.NasabahDao;
import com.dimas.maryanto.web.model.JenisKelamin;
import com.dimas.maryanto.web.model.Nasabah;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/nasabah")
public class NasabahAksi {

    @Autowired
    private NasabahDao nasabahDao;

    private final static Logger console = LoggerFactory.getLogger(NasabahAksi.class);

    @GetMapping("/new")
    public ModelAndView showFormTambah(
            ModelAndView mav,
            @ModelAttribute("nasabah") Nasabah n) {
        mav.addObject("isCreate", true);
        mav.addObject("nasabah", n);
        mav.addObject("listJenisKelamin", JenisKelamin.values());
        mav.setViewName("/nasabah/input");
        return mav;
    }

    @PostMapping("/new")
    public String submitFormTabah(@ModelAttribute(name = "nasabah") Nasabah n, HttpServletRequest req) {
        console.info("nasabah: {nama: " + n.getNama() + ", jenisKelamin: " + n.getJenisKelamin() + "}");
        nasabahDao.save(n);
        return "redirect:/nasabah/list";
    }

    @GetMapping("/list")
    public ModelAndView showList(ModelAndView mav) {
        mav.setViewName("/nasabah/list");
        mav.addObject("listOfNasabah", nasabahDao.findAll());
        return mav;
    }

    @PostMapping("/remove")
    public String hapusNasabahByNomorRegister(
            @RequestParam(name = "nomorRegister") String id) {
        Nasabah nasabah = nasabahDao.findByNomorRegister(id);
        if (nasabah != null) nasabahDao.hapus(nasabah);
        return "redirect:/nasabah/list";
    }

    @GetMapping("/update")
    public ModelAndView showNasabahByNomorRegister(
            ModelAndView mav,
            @RequestParam("nomorRegister") String id,
            @ModelAttribute("nasabah") Nasabah n) {
        mav.setViewName("/nasabah/input");
        mav.addObject("isCreate", false);


        mav.addObject("listJenisKelamin", JenisKelamin.values());
        Nasabah oldNasabah = nasabahDao.findByNomorRegister(id);
        if (oldNasabah != null)
            mav.addObject("nasabah", oldNasabah);
        else {
            mav.addObject("nasabah", new Nasabah());
        }
        return mav;
    }
}
