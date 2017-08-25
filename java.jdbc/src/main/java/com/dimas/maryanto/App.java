package com.dimas.maryanto;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    private final static String url = "jdbc:postgresql://localhost:5432/bootcamp",
            username = "bootcamp",
            password = "bootcamp",
            driverClassName = "org.postgresql.Driver";


    public DataSource getDatasource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    private Connection connection;

    public void saveNasabah(Nasabah nasabah) {
        this.connection = null;
        try {
            this.connection = getDatasource().getConnection();
            String queryInsertDataNasabah = "insert into nasabah( nomor_register, nama_nasabah, status, saldo_tabungan, create_on, tanggal_lahir) \n" +
                    "values (?, ?, ?, ?, ? ,?)";
            PreparedStatement ps = connection.prepareStatement(queryInsertDataNasabah);
            ps.setString(1, nasabah.getNomorRegister());
            ps.setString(2, nasabah.getNamaNasabah());
            ps.setBoolean(3, nasabah.getStatus());
            ps.setBigDecimal(4, nasabah.getSaldoTabungan());
            ps.setTimestamp(5, nasabah.getCreateOn());
            ps.setDate(6, nasabah.getTanggalLahir());

//        Create Update Delete
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Nasabah> findAll() {
        connection = null;
        List<Nasabah> values = new ArrayList<>();
        String query = "select id, nama_nasabah, nomor_register, status," +
                " saldo_tabungan, create_on, tanggal_lahir from nasabah";
        try {
            connection = getDatasource().getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Nasabah nasabah = new Nasabah(rs.getInt("id"),
                        rs.getString(3),
                        rs.getString(2),
                        rs.getDate("tanggal_lahir"),
                        rs.getTimestamp("create_on"),
                        rs.getBigDecimal("saldo_tabungan"),
                        rs.getBoolean("status")
                );
                values.add(nasabah);
            }
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return values;
    }

    public static void main(String[] args) throws SQLException {
        App aplikasi = new App();

//        Nasabah nasabah = new Nasabah();
//        nasabah.setNamaNasabah("Hanif");
//        nasabah.setNomorRegister("REG0002");
//        nasabah.setSaldoTabungan(BigDecimal.ZERO);
//        nasabah.setStatus(false);
//        nasabah.setTanggalLahir(Date.valueOf(LocalDate.of(1993, 04, 20)));
//        nasabah.setCreateOn(Timestamp.valueOf(LocalDateTime.now()));
//
//        aplikasi.saveNasabah(nasabah);
//        System.out.println("data inserted!!!");

        List<Nasabah> listNasabah = aplikasi.findAll();
        for (Nasabah nasabah : listNasabah) {
            System.out.println(nasabah.toString());
        }
    }
}
