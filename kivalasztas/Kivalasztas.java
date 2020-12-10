
//hazifeladat a 3asaval kihozz adatokra kérdezzen rá csak hogy hanyadik indexu az elem


package kivalasztas;

import java.util.Scanner;

public class Kivalasztas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("KIVÁLASZTÁS TÉTELE");
        Scanner bemenet = new Scanner(System.in); //Scanner lehívása
        
        int darabszam = 20; //20 elemu a tomb
        int[] tomb = new int[darabszam];
        
        for (int i = 0; i < darabszam; i++) {
            tomb[i] = (int) (Math.random() * 100) + 1; //1 és 100 között legyenek a számok
    }
        System.out.println("Tomb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(tomb[i]+" ");
        }
        System.out.print("\nMinden 3. indexu elem kiíratása: "); //elso,harmadik,hatodik...
        for (int i = 0; i < darabszam; i+=3) { //minden 3. elem
            System.out.print(tomb[i]+" ");
        }
        
        System.out.print("\nMelyik elem sorszámára kíváncsi? ");
        int keresettSzam = bemenet.nextInt();
        
        int j=0;
        for (int i = 0; i < darabszam; i+=3) {
          if (tomb[i]  == keresettSzam){
              System.out.print("A keresett szám indexe: "+(i+1));
              break;
            }
          j++;
          
        }
        
        if (darabszam == j) {
            System.out.println("Nem volt benne");
        }
        
        
        int i = 0;
        while(tomb[i] !=keresettSzam){
            i++;
        }
        System.out.print("\nA keresett szám indexe,második megoldás: "+(1+1));
        
        
        
        bemenet.close();
}
}