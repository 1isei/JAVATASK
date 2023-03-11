import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class Determinan {
    public static void main(String[] args) {
        int a,b,c;
        double D;
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan A= ");
        a=input.nextInt();
        System.out.println("Masukkan B= ");
        b=input.nextInt();
         System.out.println("Masukkan C = ");
        c=input.nextInt();
       D=b*b-4*a*c;
        System.out.println("Determinan : "+ D);
    }
}
