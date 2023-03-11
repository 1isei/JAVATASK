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
public class Pengkondisian {
     int x, y, z;
    
    void inputan() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan x: ");
        x = input.nextInt();
        System.out.print("masukan y: ");
        y = input.nextInt();
    }
    void process() {
        if(x > y){
            z = x+y;
            System.out.println("z adalah " + z);
        } else if(x == 0){
            z = 2*y;
            System.out.println("z adalah " + z);
        } else if (x < y){
            z = x-y;
            System.out.println("z adalah " + z);
        }  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pengkondisian hasil = new Pengkondisian();
        hasil.inputan();
        hasil.process();
    }
}
