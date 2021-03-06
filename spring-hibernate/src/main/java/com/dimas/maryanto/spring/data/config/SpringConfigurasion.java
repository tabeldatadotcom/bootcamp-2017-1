package com.dimas.maryanto.spring.data.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@ComponentScan(value = {"com.dimas.maryanto.spring.data"})
@EnableJpaRepositories(
        basePackages = {"com.dimas.maryanto.spring.data.repos"}
)
public class SpringConfigurasion {

    @Bean
    public DataSource dataSource() {
        BasicDataSource dbcp = new BasicDataSource();

        dbcp.setDriverClassName("org.postgresql.Driver");
        dbcp.setUrl("jdbc:postgresql://localhost:5432/bootcamp");
        dbcp.setUsername("bootcamp");
        dbcp.setPassword("bootcamp");

        return dbcp;
    }

    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds) {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        // untuk menentukan package nama yang akan discan
        factory.setPackagesToScan("com.dimas.maryanto.spring.data.models");
        // setting datasource
        factory.setDataSource(ds);

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        // set hibernate dialect = org.hibernate.dialect.PostgreSQL
        vendorAdapter.setDatabase(Database.POSTGRESQL);
        // set hibernate.hbm2dll.auto = true
        vendorAdapter.setGenerateDdl(true);
        // set hibernate.show-sql = true
        vendorAdapter.setShowSql(true);

        factory.setJpaVendorAdapter(vendorAdapter);
        return factory;
    }

    @Bean
    @Autowired
    public JpaTransactionManager transactionManager(EntityManagerFactory session) {
        JpaTransactionManager jpaTM = new JpaTransactionManager(session);
        return jpaTM;
    }
}
