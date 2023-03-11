/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project5;
import java.sql.*;


/**
 *
 * @author WAHYU
 */
public class testdriver {
    public static void main(String[] args)  {
        try{
            Class.forName("com.myssql.cj.jdbc.Driver").newInstance();
            String username="root";
            String password="";
            Connection connect=DriverManager.getConnection("jdbc:mysql://http://127.0.0.1:8080/phpmyadmin/index.php?route=/database/structure&server=1&db=gakkou",username,password);
            Statement stmt=connect.createStatement();
            System.out.println("ONE PIECE IS REALLL");
        } catch (SQLException | ClassNotFoundException  | InstantiationException | IllegalAccessException ex) {
        }
    }
}