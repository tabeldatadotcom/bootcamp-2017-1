package com.dimas.maryanto.spring.compenent.scan;

import com.dimas.maryanto.spring.DatabaseConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Halo {

    @Value("Halo saya Dimas!")
    private String value;
    private DatabaseConfigurer databaseConfigurer;

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public DatabaseConfigurer getDatabaseConfigurer() {
        return databaseConfigurer;
    }

    @Autowired
    public void setDatabaseConfigurer(DatabaseConfigurer databaseConfigurer) {
        this.databaseConfigurer = databaseConfigurer;
    }
}
