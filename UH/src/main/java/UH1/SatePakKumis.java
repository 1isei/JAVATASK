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
public class SatePakKumis {
      public static void main(String[] args) {
        int sate, tusuk ;
        double jumlah;
        Scanner input=new Scanner(System.in);
        System.out.println("Jumlah Tusuk Sate = ");
        tusuk=input.nextInt();
        jumlah=tusuk*950;
        System.out.println("Jumlah yang harus dibayar "+ jumlah);

      }
}
