
package tUGAS;

/**
 *
 * @author WAHYU
 */
public class Hitungnilai
{
    String nama, kelas;
    int npm;
    private float nilai;
    
    
    void setNIlai (float t1 ,float t2, float t3, float uh1, float uh2 ) {
  System.out.println("Nama  : "+nama);
  System.out.println("Nn   : "+npm);
  System.out.println("Kelas : "+kelas);
  System.out.println("Nilai Absen : "+t1);
  System.out.println("Nilai Tugas: "+t2);
  System.out.println("Nilai UTS: "+t3);
  System.out.println("Nilai UH1: "+uh1);
  System.out.println("Nilai UH 2: "+uh2);
  
  nilai =(t1 +t2 + t3 + uh1+ uh2) /5;
  
    }

    float getnilai (){
        return nilai;
    }
    
    }

    

    
   



