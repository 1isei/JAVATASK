/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UH2;

import java.util.Scanner;

/**
 *
 * @author WAHYU
 */
public class ProgramAplikasiGaji2 {

    Double gaji1, gaji2, gaji3,ppn,totalgaji,ppn2,totalgaji2,ppn3,totalgaji3;
    /**
     */
        void inputan() {
        Scanner input = new Scanner (System.in);
        System.out.println("-AplikasiGaji-");
        System.out.print("Sinta: ");
        gaji1 = input.nextDouble();
        
        System.out.print("Rudi:");
        gaji2= input.nextDouble();
        
        System.out.print("Toni: ");
        gaji3= input.nextDouble();
                   
        }
        
        void process() {
         
       ppn=gaji1 *0.10 ;
       ppn2=gaji2 *0.10;
       ppn3=gaji3 *0.10;
       
       totalgaji=gaji1-ppn;
       totalgaji2=gaji2-ppn2;
       totalgaji3=gaji3-ppn3;
       
        }           
        void output() {
            System.out.println("PPN="+ppn);
            System.out.println("Total Gaji Akhir=" +totalgaji);
            System.out.println("PPN="+ppn2);
            System.out.println("Total Gaji Akhir=" +totalgaji2);
                        System.out.println("PPN="+ppn3);
            System.out.println("Total Gaji Akhir=" +totalgaji3);
        }
    public static void main(String[] args) {
        
      ProgramAplikasiGaji2 hitung = new ProgramAplikasiGaji2();
        hitung.inputan();
        hitung.process();
        hitung.output();
}

}