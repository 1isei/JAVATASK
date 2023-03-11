/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;

/**
 *
 * @author WAHYU
 */
class Segitiga {
 int alas,tinggi;
 double luas;
    //  Setter
  void setAlas(int alas){
  this.alas= alas;
  
  }
  int getAlas(){
      return this.alas;
  }
  void setTinggi(int tinggi){
  this.tinggi= tinggi;
  
  }
  int getTinggi(){
      return this.tinggi;
  }
  double HitungLuas(){
      this.luas =0.5 *getAlas() * getTinggi();
      return this.luas;
  } 
  public class LUASSGT{
      
      
  
      public static void main(String[] args {
         LUASSGT sgt_1 =new LUASSGT );
         sgt_1.setAlas(10);
         sgt_1.setTinggi(5)
                 }
  }
}