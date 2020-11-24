
package veletlen;

import java.math*/

public class Veletlen {


    public static void main(String[] args) {
      //Egyszerû adatszerkezet
        System.out.println("Véletlen szám generálása, a peremmel kezdjük és zárjuk");
        double veletlenValos;
        int veletlenEgesz;
        
        //inicializálás
        veletlenValos = Math.random()*10; //tipus        
        System.out.println(veletlenValos);
        
        veletlenEgesz = (int) (Math.random()*10);
        System.out.println(veletlenEgesz);
        
        //Összetett adatszerkezet
        double tombDouble[]=new double[5];
        int tombEgesz[] = new int[5];
        
        //értékadás, tömb feltöltése a darab elemmel
        for (int i = 0; i <tombDouble.length; i++) {
            tombDouble[i] = Math.random();
            System.out.println(tombDouble[i] + " ");
 
        }
    }
    }