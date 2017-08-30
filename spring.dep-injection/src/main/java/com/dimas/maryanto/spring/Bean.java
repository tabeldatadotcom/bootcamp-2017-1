package com.dimas.maryanto.spring;

import com.dimas.maryanto.spring.compenent.scan.MovieCatalog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean {

    public static void main(String[] args) {
//        di dalem spring contaner nanti dia bikin intance objectnya dia by default singleton
        ApplicationContext springContext = new ClassPathXmlApplicationContext("spring-di.xml");
// original java code
// String koneksi = new String("Halo World");
//        String koneksi = springContext.getBean(String.class);
//        System.out.println(koneksi);

//        # bean
//        DatabaseConfigurer dbConfig = (DatabaseConfigurer) springContext.getBean("databaseConfigurer");
//        System.out.println(dbConfig.getUrl() + ", " + dbConfig.getUsername() + "| " + dbConfig.getPassword());

//        # circular dependency
//        ClassA classA = springContext.getBean("classA", ClassA.class);
//        classA.getB();

//        # autowired & componen scan
//        Halo sayHalo = springContext.getBean("halo", Halo.class);
//        DatabaseConfigurer dbConfig = sayHalo.getDatabaseConfigurer();
//        System.out.println(dbConfig.getUrl() + ", " + dbConfig.getUsername() + "| " + dbConfig.getPassword());

////        #scope {} singleton
//        DatabaseConfigurer singleton1 = springContext.getBean(DatabaseConfigurer.class);
//        System.out.println(singleton1);
//        DatabaseConfigurer singleton2 = springContext.getBean(DatabaseConfigurer.class);
//        System.out.println(singleton2);
//
////      #scope {} prototye
//        springContext = new ClassPathXmlApplicationContext("spring-di.xml");
//        DatabaseConfigurer singleton3 = springContext.getBean(DatabaseConfigurer.class);
//        System.out.println(singleton3);
//        DatabaseConfigurer singleton4 = springContext.getBean(DatabaseConfigurer.class);
//        System.out.println(singleton4);

//       Awering
//        DatabaseConfigurer configurer = springContext.getBean(DatabaseConfigurer.class);
//        configurer.showOtherBean();

//        @Primary dua bean yang sama
        MovieCatalog catalog = springContext.getBean(MovieCatalog.class);
        System.out.println(catalog.toString());


    }
}
