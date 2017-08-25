package com.dimas.maryanto;

public class Mobil extends Mesin {

    @Override
    public void setJumlahCC(Integer jumlahCC) {
        super.setJumlahCC(jumlahCC + 100);
    }

    public void setJumlahCC(Integer jumlahCC, String keterang) {

    }

}
