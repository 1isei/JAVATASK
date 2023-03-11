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
public class BujurSangkar {
    int sisi;
    double luas;
    
    void inputan() {
        Scanner input = new Scanner(System.in);
        System.out.println("--MENGHITUNG BUJUR SANGKAR--");
        System.out.print("Masukan sisi: ");
        sisi = input.nextInt();
    }
    void process() {
        luas = sisi * sisi;
    }
    void show() {
        System.out.println("Luas bujur sangkar: " + luas);
    }
    public static void main(String[] args) {
        BujurSangkar hasil = new BujurSangkar();
        hasil.inputan();
        hasil.process();
        hasil.show();
    }
    
}

