/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UH1;

import java.util.Scanner;

/**
 *
 * @author WAHYU
 */
public class SatePakKumis2 {
public int sate,harga;
    
public void setTusuk( int tusuk ){
    sate = tusuk ;
}

public int getjumlah_tusuk(){
    return sate;
}

public int getharga(){
    harga = 950*sate ;
    return harga;
}

    public static void main(String[] args) {
        SatePakKumis2 hasil = new SatePakKumis2();
        System.out.println("Sate = Rp. 950 per tusuk ");
        hasil.setTusuk(2);
        System.out.println("jumlah tusuk yang dibeli = " +hasil.getjumlah_tusuk());
        System.out.println("total yang dibayarkan = " +hasil.getharga());
    }
    
}

