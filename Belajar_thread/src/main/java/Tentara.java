
import java.util.*;
 public class Tentara extends Thread {
    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]){
    Thread laksanakan = new Thread(){
        @Override
        public void run(){
            try{
                System.out.println("Kopasus Memasuki TKP");
                for(int i=1; i<=3; i++){
                    System.out.println("Kopasus Menyelmatkan Ibu Hamil : "+i);
                    if(i==3){
                        System.out.println("Kopasus Keluar TKP");
                    } sleep(1000);
                }
                System.out.println("Marinir Memasuki TKP");
                for(int i=1; i<=10; i++){
                    System.out.println("Marinir Membunuh Terorirs : "+i);
                    if(i<=2){
                        System.out.println("Marinir Menyelamatkan Manula : "+i);
                    }if(i==10){
                        System.out.println("Marinir Keluar TKP");
                    }
                    sleep(1000);
                }
                System.out.println("Infantri Memasuki TKP");
                System.out.println("Infantri Membumi Hanguskan TKP");
                System.out.println("Misi Selesai...");

            }catch(InterruptedException ex){
              ex.printStackTrace();
            }
          }
        };laksanakan.start();
    }
}
//    }
//}