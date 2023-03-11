package Thread;




import java.util.*;

 public class liftthread extends Thread {
    /**
     * @param args the command line arguments
     */
   
       public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);
        Thread lift = new Thread(){
            public void run(){
                System.out.println("Lantai Awal: ");
                int a = scan.nextInt();
                try{
                    
                    while(true){
                        System.out.println("Lantai Destinasi: ");
                        int b = scan.nextInt();
                        
                        while(a != b){
                            System.out.println("Lantai Saat Ini: " + a);
                            if(a < b) a++;
                            else a--;    
                            sleep(1000);
                        }
                    
                        System.out.println("Lantai Saat Ini: " + a + "\nSudah Sampai di Lantai Destinasi.\n");
                        a = b;
                        }
                    }
                    catch(InterruptedException ex){
                        ex.printStackTrace();
                     
         }
          
        }
};
lift.start();
    }
}
           