/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author WAHYU
 */


import java.util.Scanner;

public class Kelulusan {
double nuas, nuts, ntugas, nakhir;
String lls, grade;
void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Nilai Tugas: ");
    ntugas = sc.nextDouble();
    System.out.print("Masukkan Nilai UTS: ");
    nuts = sc.nextDouble();
    System.out.print("Masukkan Nilai UAS: ");
       nuas = sc.nextDouble();
}
void logic(){
    nakhir = (40 * nuas / 100) + (30 * nuts / 100) + (30 * ntugas / 100);
    if(nakhir >= 65){
        lls = "Lulus";
    }else{
        lls = "Tidak Lulus";
    }
}

void grade(){
    if(nakhir >= 86 && nakhir <= 100){
        grade = "A";
    }else if(nakhir >= 76 && nakhir <= 85){
        grade = "B";
    }else if(nakhir >= 65  && nakhir <= 75){
        grade = "C";
    }else if(nakhir <= 64){
        grade = "D";
    }
}

void output(){
    System.out.println("Nilai Akhir Siswa Adalah "+nakhir);
    System.out.println("Grade Nilai Siswa: "+ grade);
    System.out.println("Siswa Dinyatakan "+ lls);
}

    public static void main(String[] args) {
        Kelulusan decision = new Kelulusan();
        decision.input();
        decision.logic();
        decision.grade();
        decision.output();
    }
}