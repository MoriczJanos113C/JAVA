/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiiratasmetodussal;

/**
 *
 * @author moric
 */
public class Tombkiiratasmetodussal {

    public static void kiir (int[]tomb )
    {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,4d", tomb[i]) + " ");
        }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tömb kiíratás metódussal, Móricz János Milán 1/13C");
        
        int darabszam;
        int szamok1[] = new int[10];
        int szamok2[] = new int[10];
        int szamok3[] = new int[10];
        
        
        
        for (int i = 0; i < 10; i++) {
            szamok1[i] = (int) (Math.random() * -200) + 100;
            szamok2[i] = (int) (Math.random() * -200) + 100;
            szamok3[i] = (int) (Math.random() * -200) + 100;
        }
        for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 10-i-1; j++) {               
                if (szamok1[j]>szamok1[j+1]) {
                int temp=szamok1[j];
                szamok1[j]=szamok1[j+1];
                szamok1[j+1]=temp;
            }
        }
        }
        for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 10-i-1; j++) {               
                if (szamok2[j]>szamok2[j+1]) {
                int temp=szamok2[j];
                szamok2[j]=szamok2[j+1];
                szamok2[j+1]=temp;
            }
        }
        }
        for (int i = 0; i < 10-1; i++) {
            for (int j = 0; j < 10-i-1; j++) {               
                if (szamok3[j]>szamok3[j+1]) {
                int temp=szamok3[j];
                szamok3[j]=szamok3[j+1];
                szamok3[j+1]=temp;
            }
        }
        }
        
        kiir(szamok1);
        kiir(szamok2);
        kiir(szamok3);
    }
    
}
