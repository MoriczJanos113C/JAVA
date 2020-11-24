/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.Scanner;
import java.math.*;

public class tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//2tombot letrehozunk, felhasználó mondja hány elemű legyen, a számokat egymás mellé (elso tomb elso elem, masodik tomb masodik elem)
 System.out.println("MŰVELETEK TÖMBÖKKEL készítette:Móricz János Milán 113C\n");

        Scanner sc;
        sc = new Scanner(System.in);
        int elemSzam;
        int osszeg1=0;
        int osszeg2=0;
        System.out.println("Mennyi elemet tartalmazzon a tömb?");
        elemSzam=sc.nextInt();
        
        //tombok deklarálása
        int tomb1[] = new int [elemSzam];
        int tomb2[] = new int [elemSzam];
        
        //tombok feltoltese
        for (int i = 0; i < elemSzam; i++) {
            tomb1[i]=(int) (Math.random()*999)+1;
            osszeg1=osszeg1+tomb1[i];
            tomb2[i]=(int) (Math.random()*999)+1;
            osszeg2=osszeg2+tomb2[i];
    }
        //tombok kiiratasa
        System.out.print("Tömbök elemei: \n");
        
        for (int i = 0; i < elemSzam; i++) {
            int sorOsszeg=0;
            sorOsszeg=tomb1[i]+tomb2[i];
            System.out.print(i+1+".:");
            System.out.print((String.format("%,3d", tomb1[i])+" + "));
            System.out.print(String.format("%,3d", tomb2[i])+" - ");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println(" ");
            System.out.println(" ");
        }
            System.out.println("\nAz első tömb elemeinek összege: "+String.format("%,3d",osszeg1));
            System.out.println("A második tömb elemeinek összege: "+String.format("%,3d",osszeg2));
            System.out.println("A két tömb összege: "+String.format("%,3d",osszeg1+osszeg2));
        
        sc.close();
    }
}
 


        

