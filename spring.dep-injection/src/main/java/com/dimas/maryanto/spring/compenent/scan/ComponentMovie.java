package com.dimas.maryanto.spring.compenent.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ComponentMovie {

    @Bean
    public MovieCatalog action() {
        MovieCatalog action = new MovieCatalog();
        action.setKode("AC");
        action.setNama("ACTION");
        return action;
    }

    @Bean
    public MovieCatalog horor() {
        MovieCatalog horor = new MovieCatalog();
        horor.setKode("HR");
        horor.setNama("HOROR");
        return horor;
    }

}
