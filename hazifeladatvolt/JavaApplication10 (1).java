
package javaapplication10;
        
import java.math.*; //scanner lekérése
import java.util.Scanner; //scanner lekérése

public class JavaApplication10 {
    
public static void main(String[] args) {
    System.out.println("Ez a program két számot kér le es különböző műveleteket végez velük. Készítette: Móricz János Milán 1/13c");    
    Scanner bemenet; //scanner objektum változója
        bemenet = new Scanner(System.in); //osztály meghívása
//Egyszerû adatszerkezet
    int valasz;   //dowhile ciklushoz lekértem egy számot amivel tudom majd ujraindítani  
    do {  
      System.out.println("Véletlen szám generálása, a peremmel kezdjük és zárjuk");
        int veletlenSzam; //két random szám lekérése
        int veletlenSzam2; //két random szám lekérése    
        
        int tomb[] = new int [1]; //tomb lekérése
        
        for (int i = 0; i <tomb.length; i++) {
            veletlenSzam = (int)(Math.random() * 100);
            tomb[i] = veletlenSzam;
            if(veletlenSzam != 0){
                tomb[i] = veletlenSzam;
                veletlenSzam2 = (int) (Math.random() * 100);//igy 0-t nem fog adni a tömbből
            if(veletlenSzam2 != 0){
                tomb[i] = veletlenSzam2; //igy 0-t nem fog adni a tömbből
             
                System.out.println("Elso szám: "+veletlenSzam);
                System.out.println("Második szám: "+veletlenSzam2); //két szám kiíratása
            }
            else
                continue;
            
                
                
            if (veletlenSzam!=0) if (veletlenSzam2!=0) {    
                System.out.println("A két számkülönbsége: "+(veletlenSzam-veletlenSzam2)); //két szám különbsége kiíratása
            }
         
            
            if (veletlenSzam>veletlenSzam2) {
                         System.out.println("A nagyobb szám: "+veletlenSzam); //két szám közül a nagyobbik kiíratása
            }
            else{
                System.out.println("A nagyobb szám: "+veletlenSzam2); //két szám közül a nagyobbik kiíratása
            }
            
            
            if (veletlenSzam % veletlenSzam2 == 0) {
                System.out.println("Az első szám többszöröse/osztható a másodiknak: "+veletlenSzam);
            }
            else if (veletlenSzam2 % veletlenSzam == 0) {
                System.out.println("A második szám többszöröse/osztható az elsőnek"+veletlenSzam2);             
            }
            else {
                System.out.println("Egyik szám sem a másik többszöröse");
            } //megnezi, hogy a 2 szám valamelyik szám többszöröse
            }
            }  
            System.out.print("Szeretnéd újra futtatni? Ha igen, üss egy 1-est,Ha nem akkor bármit: ");
            valasz = bemenet.nextInt();
        } while (valasz == 1); //hátultesztelő, ujraindítja a programot, de csak akkor ha 1-est kap

        bemenet.close(); //a scanner lezárása
}
}
