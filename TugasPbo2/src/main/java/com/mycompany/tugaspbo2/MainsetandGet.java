package com.mycompany.tugaspbo2;
public class MainsetandGet {
    public static void main(String[]args) {
        SetandGet brg1= new SetandGet ();
        brg1.setNama("Ballpoint");
        brg1.setStok(10);
        brg1.setHarga_satuan(2000);
        brg1.setHarga(10,2000);
        int a=brg1.getHarga();
        
        SetandGet brg2= new SetandGet ();
        brg2.setNama("Pensil");
        brg2.setStok(10);
        brg2.setHarga_satuan(1500);
        brg2.setHarga(10,1500);
        int b =brg2.getHarga();
        
        SetandGet brg3=new SetandGet ();
        brg3.setNama("Penghapus");
        brg3.setStok(10);
        brg3.setHarga_satuan(1000);
        brg3.setHarga(10,1000);
        int c=brg3.getHarga();
        
        System.out.println("Nama Barang:"+brg1.getNama());
        System.out.println("Stok Barang:"+brg1.getStok());
        System.out.println("Harga Satuan:"+brg1.getHarga_satuan());
        System.out.println("Harga Barang:"+brg1.getHarga());
        
        System.out.println("Nama Barang:"+brg2.getNama());
        System.out.println("Stok Barang:"+brg2.getStok());
        System.out.println("Harga Satuan:"+brg2.getHarga_satuan());
        System.out.println("Harga Barang:"+brg2.getHarga());
        

        System.out.println("Nama Barang:"+brg3.getNama());
        System.out.println("Stok Barang:"+brg3.getStok());
        System.out.println("Harga Satuan:"+brg3.getHarga_satuan());
        System.out.println("Harga Barang:"+brg3.getHarga());
        
  }
}
        