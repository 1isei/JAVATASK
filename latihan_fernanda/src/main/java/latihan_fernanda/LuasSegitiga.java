package latihan_fernanda; 
/* @author WAHYU
 */
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        int a,t;
        double luas;
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Alas= ");
        a=input.nextInt();
        System.out.println("Masukkan Tinggi= ");
        t=input.nextInt();
        luas=0.5*a*t;
        System.out.println("Luas Segetiga "+ luas);
    }
}
