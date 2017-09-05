package com.dimas.maryanto.web.model;

public enum JenisKelamin {
    L("Laki - Laki"), P("Perempuan");


    private final String jenisKelamin;

    JenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
