/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

import java.util.Scanner;

/**
 *
 * @author WAHYU
 */
public class TiketKeretaApi {
int jml, pilihan;
double total, uang, kembalian;
Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
void input(){
    
    System.out.print("Masukkan Jumlah Penumpang : ");
    jml = sc.nextInt();
    System.out.print("""
                     (1) Ekonomi (15000)
                     (2) Bisnis (80000)
                     (3) Eksekutif: (110000)
                     Pilih Kelas:  """);
    pilihan = sc.nextInt();
    
}

void logic(){
    switch (pilihan) {
  case 1 -> total = jml * 15000;
  case 2 -> total = jml * 80000;
    case 3 -> total = jml * 110000;
  default -> System.out.println("Nomor Yang Anda Pilih Salah");
}  
}

void bayar(){
    System.out.print("Masukkan Jumlah Uang Anda: ");
    uang = sc.nextDouble();
    kembalian = uang - total;
    if(uang>total){
        System.out.println("Kembalian Anda: "+kembalian);
        System.out.println("Pembayaran Anda Berhasil!");
    }else if(uang<total){
        System.out.println("Pembayaran Anda Tidak Berhasil");
    }else if(uang == total){
        System.out.println("Pembayaran Anda Berhasil!");
    }
}

void output(){
    System.out.println("Total Harga Tiket Anda : "+total);
}
    public static void main(String[] args) {
        // TODO code application logic here
        TiketKeretaApi harga_tiket  = new TiketKeretaApi();
        harga_tiket.input();
        harga_tiket.logic();
        harga_tiket.output();
        harga_tiket.bayar();
    }
    
}
