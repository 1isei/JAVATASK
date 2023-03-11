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
public class ProgramAplikasiGaji3 {

    private void getTgaji() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void menghitungTotalGaji() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void getPPN() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void inputGaji() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void inputNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
 public class getset {
    Scanner input=new Scanner(System.in);
    String nama;
    Double gaji, PPN, tgaji;
    
    void inputNama() {
        System.out.print("Masukkan Nama Karyawan    : ");
        nama=input.nextLine();
    }

    void inputGaji() {
        System.out.print("Masukkan Gaji Karyawan    : Rp. ");
        gaji=input.nextDouble();
    }
    void menghitungTotalGaji() {
        tgaji = gaji - PPN;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getGaji() {
        return gaji;
    }

    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    public Double getPPN() {
        PPN = gaji * 0.10/100;
        return PPN;
    }

    public void setPajak(Double PPN) {
        this.PPN = PPN;
    }

    public Double getTgaji() {
        System.out.println("------------------------------------------");
        System.out.println("Nama Karyawan             : "+nama);
        System.out.println("Gaji - PPN(0.10%)         : Gaji : Rp. "+gaji+" - Pajak : Rp. "+PPN);
        System.out.println("Total Gaji Karyawan       : Rp."+tgaji);
        System.out.println("Note: Gaji sudah di transfer ke dalam Bank/Deposito");
        return tgaji;
    }

    public void setTgaji(Double tgaji) {
        this.tgaji = tgaji;
    }
    
    
    public static void main(String[] args) {
       ProgramAplikasiGaji3 gajian = new ProgramAplikasiGaji3();
        gajian.inputNama();
        gajian.inputGaji();
        gajian.getPPN();
        gajian.menghitungTotalGaji();
        gajian.getTgaji();
    }
    