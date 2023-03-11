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
public class SatePakKumis3 {
  
    public int sate,harga;

public void setjumlah(){
    Scanner scan = new Scanner(System.in);
    System.out.print(" Berapa tusuk sate = ");
    sate = scan.nextInt();
}

public int getharga(){
    harga = 950*sate ;
    return harga;
}

    public static void main(String[] args) {
        System.out.println("Sate = Rp. 950 per tusuk ");
       SatePakKumis3 hasil = new SatePakKumis3();
        hasil.setjumlah();
        System.out.println("total yang dibayarkan = " +hasil.getharga());
}
}
