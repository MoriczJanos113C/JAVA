/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nevezzunk;

import java.util.Scanner;

/**
 *
 * @author moric
 */
public class NEVEZZUNK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("\tMűveletek stringekkel");
        System.out.println("----------------------------------------");
        Scanner bemenet= new Scanner(System.in);
        System.out.print("Add meg a neved: ");
        String sajatNev=bemenet.nextLine();
        System.out.println("----------------------------------------");
        System.out.print("Adj meg egy keresztnevet: ");
        String kNev=bemenet.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Nagybetűs írásmód: "+sajatNev.toUpperCase());
        System.out.println("----------------------------------------");
        System.out.println("Szókezdők nagybetűsek: ");
        System.out.println("----------------------------------------");
        System.out.println("Név kisbetűkkel: "+sajatNev.toLowerCase());
        System.out.println("----------------------------------------");
        System.out.println("Hány karakterből áll a neved?: ");
        System.out.println("----------------------------------------");
        System.out.println("A névben az 1.  szóköz helye: ");
        System.out.println("----------------------------------------");
        System.out.println("A névben a 2. szóköz helye: ");
        System.out.println("----------------------------------------");
        System.out.println("1. keresztnév kezdő pozíciója: ");
        System.out.println("----------------------------------------");
        System.out.println("2. keresztnév kezdő pozíciója: ");
        System.out.println("----------------------------------------");
        System.out.println("Vezetékneved: ");
        System.out.println("----------------------------------------");
        System.out.println("Keresztneved : ");
        System.out.println("----------------------------------------");
        System.out.println("Vezetékneved hossza: ");
        System.out.println("----------------------------------------");
        System.out.println("Keresztneved hossza: ");
        System.out.println("----------------------------------------");
        System.out.println("Névegyesítés (vezetéknév+keresztnév): ");
        System.out.println("----------------------------------------");
        System.out.println("Új név: ");
        System.out.println("----------------------------------------");
        System.out.println("Monogram: ");
        System.out.println("----------------------------------------");
        
        
        bemenet.close();
    }
    
}
