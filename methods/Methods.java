/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author moric
 */
public class Methods {
    static void elvalaszto() {
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    
    static void teljesNev(String nev) {
        System.out.println(nev + "Igen");
    }
    
    static void teljesNev2(String nev, String utolso) {
        System.out.println(nev +" "+ utolso);
    }
    
    static int ujOsszeadas(int x, int y) {
        return x + y;
    }
    
    static void eletkorEllenorzo(int age) {
    if (age < 18) {
      System.out.println("Nem vagy idős!");
    }
    
    else {
      System.out.println("Idős vagy!");
    }
    }
    
    private static double szamitKerulet(double a, double b, double c){
        return a + b + c;
    }
    private static double szamitTerulet(double a, double m){
        return (a * m) /2.0;
    }
    private static double szamitTerulet2(double a, double b, double c) {
        double s = (a+b+c) /2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        elvalaszto();
        System.out.println("Móricz János");
        elvalaszto();
        teljesNev("Jani");
        teljesNev("Marci");
        elvalaszto();
        teljesNev2("Janos","Mórocz");
        elvalaszto();
        int z = ujOsszeadas(5, 3);
        System.out.println(z);
        elvalaszto();
        eletkorEllenorzo(10);
        eletkorEllenorzo(20);
        elvalaszto();
        
        System.out.println("Háromszög terület, kerület számító program");
        
        System.out.printf("Kerulet: %.2f\n", szamitKerulet(30,45,40));
        System.out.printf("Terulet: %.2f\n", szamitTerulet(30,35));
        System.out.printf("Kerulet: %.2f\n", szamitTerulet2(30,35,40));
        elvalaszto();
    }
}
