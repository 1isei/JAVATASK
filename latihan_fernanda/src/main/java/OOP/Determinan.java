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
public class Determinan {
    
    double D, a, b, c;
    
    void inputan() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--MENGHITUNG DETERMINAN--");
        System.out.print("Masukan a: ");
        a = input.nextDouble();
        System.out.print("Masukan b: ");
        b = input.nextDouble();
        System.out.print("Masukan c: ");
        c = input.nextDouble();
    }
    void process_and_show() {
        D = b * b - 4 * a * c;
        System.out.println("Determinannya adalah: " + D);
    }
    public static void main(String[] args) {
        Determinan hasil = new Determinan();
        hasil.inputan();
        hasil.process_and_show();
    }
    
}