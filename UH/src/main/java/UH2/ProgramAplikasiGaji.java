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
public class ProgramAplikasiGaji {
        public static void main(String[] args) {
        int ppn2,ppn1,ppn3 ,gaji1,gaji2,gaji3 ;
        double totalgaji = 0 ;
        Scanner input=new Scanner(System.in);
        System.out.println("Gaji Sinta= ");
        gaji1=input.nextInt();
        ppn1= (int) (gaji1*0.10)  ;
        System.out.println("Gaji Rudi= ");
        gaji2=input.nextInt();
         ppn2= (int) (gaji1*0.10)  ;
        System.out.println("Gaji Toni= ");
        gaji3=input.nextInt();
        ppn3= (int) (gaji3*0.10)  ;
        int totalgaji1= gaji1-ppn1;    
        int totalgaji2 = gaji2-ppn2;
        int totalgaji3 = gaji3-ppn3;    
        System.out.println("PPN = "+ ppn1);
         System.out.println("Total Gaji = "+ totalgaji1);
            System.out.println("PPN =" +ppn2);
            System.out.println("Total Gaji= " +totalgaji2);
        System.out.println("PPN =" +ppn3);
            System.out.println("Total Gaji= " +totalgaji3);
        }
}
