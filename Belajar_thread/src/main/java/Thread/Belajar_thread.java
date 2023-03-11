/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Thread;

/**
 *
 * @author WAHYU
 */
import java.lang.Thread;
public class Belajar_thread{

  int angka=5;
      void proses (){
      Thread cobathread=new Thread(){
          
              @Override
              public void run(){
                   for(int i=0; i<5;i++){
                 System.out.println("i="+i);
              }
                 try{
                     Thread.sleep(100);
                 }
                   catch(InterruptedException ex){
}
              }
      };  
      cobathread.start();
     
               }
}
    

