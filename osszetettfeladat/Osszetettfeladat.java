/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszetettfeladat;
 
import java.util.Scanner;                 

public class Osszetettfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nÖSSZETETT FELADAT, KÉSZÍTETTE: Móricz János Milán 1/13C");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
        int darabszam = (int) (Math.random() * 10) + 30;
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -100) + 50;
            szamok2[i] = (int) (Math.random() * -100) + 50;
        }
        
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        
        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        
        
            for (int i = 0; i < ujTombdb-1; i++) {
                for (int j= 0; j < ujTombdb-i-1; j++) {
                    if (ujTomb[j]>ujTomb[j+1]) {
                    int temp=ujTomb[j];
                    ujTomb[j]=ujTomb[j+1];
                    ujTomb[j+1]=temp;
                }
            }
            }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
            int legkisebb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) {  //Legnagyobb szám meghatározása az új tömbből
                if (ujTomb[i] < legkisebb) {
                    legkisebb = ujTomb[i];
                }
            }
            
            int legnagyobb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) {  //Legkisebb szám meghatározása az új tömbből
                if (ujTomb[i] > legnagyobb) {
                    legnagyobb = ujTomb[i];
                }
            }
            System.out.print("\nAz ujTomb legnagyobb száma: "+legnagyobb);
            
            System.out.print("\nAz ujTomb legkisebb száma: "+legkisebb);
            
            if (ujTomb[ujTombdb-1]%ujTomb[0] == 0 ) {
                System.out.println("\nAz ujtomb legnagyobb eleme a legkisebb elemének a többszöröse");
            }
            else{
                System.out.println("\nAz ujtomb legnagyobb eleme nem a többszöröse a legkisebb elemével");
            }
            System.out.println("Szeretné újra futtatni a programot? Ha igen akkor: i , Ha nem akkor: n");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}
