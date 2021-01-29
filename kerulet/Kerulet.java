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

    static void elvalaszto() {
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    
    static int teglalapK(int teglalapA, int teglalapB) {
        return (teglalapA + teglalapB) * 2;
    }

    static double korSugar(int r) {
        return (2 * (r * Math.PI));
    }

    static int haromszogK(int haromszogA, int haromszogB, int haromszogC) {
        return haromszogA + haromszogB + haromszogC;
    }

    static int otszog(int otszogOldal) {
        return 5 * otszogOldal;
    }

    static int hatszog(int hatszogOldal) {
        return 6 * hatszogOldal;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kerület számító program, Készítette: Móricz János Milán 1/13C");
         Scanner bemenet = new Scanner(System.in);
        char valasz;
        do {
            elvalaszto();
            System.out.print("\nMilyen alakzat kerületére kíváncsi?\n1-téglalap\n2-kör\n3-háromszög\n4-szabályos ötszög\n5-szabályos hatszög");
            System.out.print("\nÍrja be ide!: ");
            int menupont = bemenet.nextInt();
            while (menupont > 5 || menupont < 1) {
                System.out.print("Ilyen menüpont nem található kérem válasszon 1-től 5-ig a számok közül!:");
                menupont = bemenet.nextInt();
            }
            switch (menupont) {
                case 1:
                    elvalaszto();
                    System.out.println("TÉGLALAP");                   
                    System.out.println("K = 2*(a+b)");
                    System.out.print("Adja meg az a oldalt!: ");
                    int tA = bemenet.nextInt();
                    System.out.print("Adja meg a b oldalt!: ");
                    int tB = bemenet.nextInt();
                    System.out.println("A téglalap kerülete " + teglalapK(tA, tB) + " cm");
                    elvalaszto();
                    break;
                case 2:
                    elvalaszto();
                    System.out.println("KÖR");
                    System.out.println("K = 2*r*n ");
                    System.out.print("Adja meg a kör sugarát!: ");
                    int sugar = bemenet.nextInt();
                    System.out.println("A kör területe " + korSugar(sugar) + "cm");
                    elvalaszto();
                    break;
                case 3:
                    elvalaszto();
                    System.out.println("HÁROMSZÖG");
                    System.out.println("K = a+b+c");
                    System.out.print("Adja meg az a oldalt!: ");
                    int hszA = bemenet.nextInt();
                    System.out.print("Adja meg a b oldalt!: ");
                    int hszB = bemenet.nextInt();
                    System.out.print("Adja meg a c oldalt!: ");
                    int hszC = bemenet.nextInt();
                    System.out.println("A háromszög kerülete " + haromszogK(hszA, hszB, hszC) + " cm");
                    elvalaszto();
                    break;
                case 4:
                    elvalaszto();
                    System.out.println("SZABÁLYOS ÖTSZÖG");
                    System.out.println("K = 5*a");
                    System.out.print("Adja meg az ötszög oldalát!: ");
                    int oldal5 = bemenet.nextInt();
                    System.out.println("Az ötszög kerülete " + otszog(oldal5) + " cm");
                    elvalaszto();
                    break;
                case 5:
                    elvalaszto();
                    System.out.println("SZABÁLYOS HATSZÖG");
                    System.out.println("K = 6*a");
                    System.out.print("Adja meg a hatszög oldalát!: ");
                    int oldal6 = bemenet.nextInt();
                    System.out.println("A hatszög kerülete " + hatszog(oldal6) + " cm");
                    elvalaszto();
                    break;
                default:
                    break;
            }
            System.out.print("Szeretne egy újabbat is számolni? Akkor írjon egy i betűt!: ");
            valasz = bemenet.next().charAt(0);
        } while (valasz == 'i');
        
        bemenet.close();
    }
}
