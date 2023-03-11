/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;

/**
 *
 * @author WAHYU
 */
public class luasPersegiPanjang {
      final private String nama = "Persegi Panjang";
    private int panjang;
    private int lebar;
    //buat constructor tanpa paramter biasanya untuk tampilan awal saat objek baru di buat
    luasPersegiPanjang(){
        System.out.println("Menghitung Luas "+this.nama);
        System.out.println("========================");
   }
    
    //buat fungsi void untuk menampung nilai yang diinput dari user
    void luasPersgipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //set data yang diinput dari user
    void setData(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //ambil data dari setter agar bisa di akses di main class
    int getPanjang(){
        return this.panjang;
    }
    //ambil data dari setter 
    int getLebar(){
        return this.lebar;
    }
    
    //cetak hasil dari setter getter
    void cetak(){
        System.out.println("=====================");
        int hasil = getPanjang() * getLebar();
        System.out.println("Hasil: "+getPanjang()+" X "+getLebar()+" = "+hasil);
    }
    
}


public class Main {

    public static void main(String[] args) {
        //buat objek baru dari fungsi scanner yang diimport
        Scanner input = new Scanner(System.in);
        //buat objek baru dari class luas persegi panjang
        luasPersegipanjang luas = new luasPersegipanjang();//-> new ini untuk memanggil constructor
        //ambil inputan user
        System.out.print("Masukkan panjang persegi panjang: ");
        //masukkan ke variabel
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang:  ");
        //masukkan ke variabel
        int lebar = input.nextInt();
        
        //masukkan data ke setData atau bisa ke fungsi void luasPersegipanjang
        luas.setData(panjang, lebar);
        
        //tampilkan hasil operasi luas nya
        luas.cetak();
    }
    
}
}
