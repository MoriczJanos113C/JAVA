
package veletlen;

import java.math*/

public class Veletlen {


    public static void main(String[] args) {
      //Egyszer� adatszerkezet
        System.out.println("V�letlen sz�m gener�l�sa, a peremmel kezdj�k �s z�rjuk");
        double veletlenValos;
        int veletlenEgesz;
        
        //inicializ�l�s
        veletlenValos = Math.random()*10; //tipus        
        System.out.println(veletlenValos);
        
        veletlenEgesz = (int) (Math.random()*10);
        System.out.println(veletlenEgesz);
        
        //�sszetett adatszerkezet
        double tombDouble[]=new double[5];
        int tombEgesz[] = new int[5];
        
        //�rt�kad�s, t�mb felt�lt�se a darab elemmel
        for (int i = 0; i <tombDouble.length; i++) {
            tombDouble[i] = Math.random();
            System.out.println(tombDouble[i] + " ");
 
        }
    }
    }