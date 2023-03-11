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
public class TesKoneksi {
    public static void  main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection konek = DriverManager.getConnection(
            "jdbc:mysql://localhost:3308/gakkou",
            username, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException | InstantiationException
                | IllegalAccessException | ClassNotFoundException e) {
        }
    }
}