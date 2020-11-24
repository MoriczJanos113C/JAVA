/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszegzes;

import java.math.*;

public class Osszegzes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Készítette:Móricz János Milán 1/13c");
        int[] tomb1=new int [5];
        
        tomb1[0]=11;
        tomb1[1]=22;
        tomb1[2]=33;
        tomb1[3]=44;
        tomb1[4]=55;
        
        int tomb2[] = new int [5];
        for(int i=0; i<5; i++){
         tomb2[i] = (int) (Math.random()*99)+1;
        }
        
        //1. tömb
        int osszeg1=0;
        System.out.print("\nA tömb1 elemei: ");
            for(int i=0; i<5; i++){
                System.out.print(String.format("%,2d",tomb1[i])+" ");
                osszeg1=osszeg1+tomb1[i]; //osszeg+=tomb1[i];
        }
        //2. tömb
        int osszeg2=0;
        System.out.print("\nA tömb2 elemei: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(String.format("%,2d",tomb2[i])+" ");
                osszeg2=osszeg2+tomb2[i];
        }
        System.out.println("\nA tömb1 elemek osszegei: "+osszeg1);
        System.out.println("\nA tömb2 elemek osszegei: "+osszeg2+"\n");
        System.out.println("\n\nA tomb1 elemeinek átlaga: "+osszeg1/tomb1.length);
        System.out.println("A tömb2 elemeinek átlaga: "+osszeg2/tomb2.length);
    }
}   



