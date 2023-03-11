/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project5;
import java.util.*;
/**
 *
 * @author Hdr
 */
public class alattuliskantor {

public String NamaAlatTulis[]=new String[3];
public int Stok[]=new int[3];
public double HargaSatuan[]=new double[3];
public double Harga[]=new double[3];
public double HargaTotal=0;

public void setNamaAlatTulis(){
Scanner input = new Scanner(System.in);
int j =1;
for(int i = 0; i < NamaAlatTulis.length;i++){
System.out.print("Nama Alat Tulis ke-"+ j++ + ": ");
NamaAlatTulis[i]=input.nextLine();
}
}
public void setStok(){
Scanner input = new Scanner(System.in);
int j = 1;
for(int i = 0; i <Stok.length;i++){
System.out.print("Stok Alat Tulis ke-"+ j++ +": ");
Stok[i]=input.nextInt();
}
}
public void setHargaSatuan(){
Scanner input = new Scanner(System.in);
int j = 1;
for(int i = 0; i <HargaSatuan.length;i++){
System.out.print("Harga Alat Tulis ke-"+ j++ +": ");
HargaSatuan[i]=input.nextDouble();
}
}
public void setHarga(){
for(int i = 0; i <Harga.length;i++){
Harga[i]=Stok[i]*HargaSatuan[i];
}
}
public void setHargaTotal(){
 HargaTotal = Harga[0]+Harga[1]+Harga[2];  
}
public String getNamaAlatTulis(int i){
return NamaAlatTulis[i];
} 
public int getStok(int i){
return Stok[i];
}
public Double getHargaSatuan(int i){
return HargaSatuan[i];
}
public Double getHarga(int i){
return Harga[i];
}
public Double getHargaTotal(){
return HargaTotal;
}

    public static void main(String[] args) {
    alattuliskantor penjualan = new alattuliskantor();
    penjualan.setNamaAlatTulis();
    penjualan.setStok();
    penjualan.setHargaSatuan();
    penjualan.setHarga();
    penjualan.setHargaTotal();
    System.out.println("====================");
    for(int i = 0; i < 3 ; i++){
    System.out.println("Nama Barang : " + penjualan.getNamaAlatTulis(i) + " => Stok Alat Tulis : " + penjualan.getStok(i) + " => Harga Satuan :Rp." + penjualan.getHargaSatuan(i) + " => Harga Total :Rp." + penjualan.getHarga(i));
    }
    System.out.println("==================== Harga Total :Rp."+penjualan.getHargaTotal());
    }
    
}