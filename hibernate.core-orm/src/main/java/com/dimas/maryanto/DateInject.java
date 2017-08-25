package com.dimas.maryanto;

import java.sql.Date;
import java.time.LocalDate;

public class DateInject {

    public static Date setValue(Integer tahun, Integer bulan, Integer hari) {
        return Date.valueOf(LocalDate.of(tahun, bulan, hari));
    }
}
