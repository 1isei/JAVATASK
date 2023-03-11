/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author WAHYU
 */
public class Segitiga {

    Double segitiga, alas, tinggi;
    /**
     */
        void inputan() {
        Scanner input = new Scanner (System.in);
        System.out.println("--MENEMUKAN LUAS SEGITIGA--");
        System.out.print("masukan tinggi: ");
        tinggi = input.nextDouble();
        System.out.print("masukan alas: ");
        alas = input.nextDouble();        
        }
        
        void process() {
        segitiga = 0.5 * alas * tinggi;
        }
        
        void output() {
        System.out.println("luas adalah: " + segitiga);
        }
    public static void main(String[] args) {
        
        Segitiga hitung = new Segitiga();
        hitung.inputan();
        hitung.process();
        hitung.output();
    }
}