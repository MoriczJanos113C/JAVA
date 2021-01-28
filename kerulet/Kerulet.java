/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet;

import java.util.Scanner;

/**
 *
 * @author moric
 */
public class Kerulet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kerület számító program, Készítette: Móricz János Milán 1/13C");
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        int valasz;
        do {
        System.out.println("Irja be az 1es gombot ha téglalap");
        System.out.println("Irja be a 2es gombot ha kör");
        System.out.println("Irja be a 3as gombot ha háromszog");
        System.out.println("Irja be a 4es gombot ha szabályos haromszog");
        System.out.println("Irja be az 5os gombot ha szabályos hatszögöt szeretne");
        System.out.print("Írja be ide azt a számot: (1/2/3/4/5): ");
        valasz=bemenet.nextInt();
        
        while(!(valasz==1 || valasz==2 || valasz==3 || valasz==4 || valasz==5)){
            System.out.print("\nCsak az alábbi listából adjon meg számot: 1/2/3/4/5! ");
            valasz=bemenet.nextInt();
        }
            
            //teglalap 
            if (valasz==1) {
                System.out.println("--Téglalap kerülete--");
                System.out.println("K = 2*(a+b)");
                System.out.println("---------------------");
            }
            if (valasz==2){
                System.out.println("--Kör területe--");
                System.out.println("K = 2*r*n ");
                System.out.println("---------------------");
            }
            if (valasz==3) {
                System.out.println("--Háromszög kerülete--");
                System.out.println("K = a+b+c");
                System.out.println("----------------------");
            }
            if (valasz==4) {
                System.out.println("--Szabályos háromszög kerülete--");
                System.out.println("K = 3*a");
                System.out.println("--------------------------------");
            }
            if (valasz==5) {
                System.out.println("--Szabályos hatszög--");
                System.out.println("K = 6*a");
                System.out.println("---------------------");
            }
            
            System.out.println("Szeretne újabb alakzattal számoltatni? Ha igen akkor: i , Ha nem akkor: n");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));

            
            bemenet.close();
    }
    
}
