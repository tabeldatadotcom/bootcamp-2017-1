package com.dimas.maryanto;

import java.util.ArrayList;
import java.util.List;

public class MangkokMieAyam {

    /**
     * variable ini digunakan untuk apa...
     */
    private String kulitKacang;

    public void mieAyam() {

    }

    public static void main(String[] args) {
        list();
    }

    private static void list() {
        List<String> values = new ArrayList<String>();
        values.add("Dimas");
        values.add("Syarif");
        values.add("Lery");

        for (String value: values) {
            System.out.println(value);
        }
    }
}
