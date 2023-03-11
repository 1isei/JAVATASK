/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenmy;
import java.sql.*;

/**
 *
 * @author WAHYU
 */
public  class InsertDatabase {
    public static void  main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection(
            "jdbc:mysql:http://localhost:8080/phpmyadmin/index.php?route=/sql&db=gakkou&table=siswa&pos=0",
            username, password);    
            Statement stmt = koneksi.createStatement();
            String sql ="INSERT INTO siswa(NIS,Nama_Lengkap,tgl_lahir,alamat,namaOrtu) VALUES ('1212', 'IaNKun', '2003-09-09', 'JL Bumiarjo No 60', 'Muniv')";
            stmt.executeUpdate(sql);
           } catch (SQLException | InstantiationException
                | IllegalAccessException | ClassNotFoundException e) {
    }
}
}
