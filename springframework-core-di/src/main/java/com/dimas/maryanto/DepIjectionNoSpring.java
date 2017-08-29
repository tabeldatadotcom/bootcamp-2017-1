package com.dimas.maryanto;

import java.sql.Connection;

public class DepIjectionNoSpring {

    private String url = "";
    private String password = "";
    private String username = "";

    //    consutruktor injection
    public DepIjectionNoSpring(String url, String password, String username) {
        this.url = url;
        this.password = password;
        this.username = username;
    }

    //    setter injection
    private Connection setConnection(String url, String password, String username) {
//        url password dan username langsung digunakan
        return null;
    }

    @Override
    public String toString() {
        return "{jdbc:postgresql://" + url + "/" + username + "}";
    }

    public static void main(String[] args) {
        DepIjectionNoSpring aplikasi = new DepIjectionNoSpring("jdb....", "...asblkjasdf", "....");
        System.out.println(aplikasi.toString());

    }
}
