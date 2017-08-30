package com.dimas.maryanto.spring.compenent.scan;

import org.springframework.stereotype.Component;

@Component
public class NontonFilm {

    private MovieCatalog catalog;

    public MovieCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MovieCatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return this.catalog.toString();
    }
}
