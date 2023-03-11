package latihan_fernanda;

import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class LuasBujurSangkar {
    public static void main(String[] args) {
        int s  ;
        double luas;
        Scanner input =new Scanner(System.in);
        System.out.println("Masukkan Sisi= ");
        s=input.nextInt();
        luas= s*s;
        System.out.println("Luas Bujur Sangkar= "+ luas);
    }
}


