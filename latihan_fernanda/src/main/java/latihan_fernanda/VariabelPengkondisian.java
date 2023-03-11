/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_fernanda;

import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class VariabelPengkondisian {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x, y;
        double z;
        
       System.out.println("Masukan x :");
       x = input.nextInt();
       System.out.println("Masukan y :");
       y = input.nextInt();
       
       if (x > y){
           z = x + y;
           System.out.println(z);
       }else if (x < y){
           z = x - y;
           System.out.println(z);
       }else if (x == 0){
           z = 2*y;
           System.out.println(z);
       }
        
     }
}
    

