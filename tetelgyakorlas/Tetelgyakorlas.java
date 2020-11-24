/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetelgyakorlas;


public class Tetelgyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TÉTELGYAKORLÁS, KÉSZÍTETTE: Móricz János Milán 1/13C");            
       int elemSzam = (int) (Math.random()*10)+10;
       int tomb1 [] = new int [elemSzam];
       int tomb2 [] = new int [elemSzam];
       int negativ [] = new int [elemSzam*2];
       
       for (int i = 0; i < elemSzam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
       System.out.print("A tömb1 elemei:");
       for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%,4d", tomb1[i])+" ");
        }
       
       System.out.print("\nA tömb2 elemei:");
       for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%,4d", tomb2[i])+" ");
        }
       int negativDb=0;
       
       for (int i = 0; i < elemSzam; i++) {
            if (tomb1[i]<0) {
                negativ[negativDb++]=tomb1[i];
                
            }
            if (tomb2[i]<0) {
                negativ[negativDb++]=tomb2[i];
            }
        }
       int negativOsszeg=0;
       System.out.print("\n\nNegatív tömb elemei: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb; i++) {
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
            else {
                System.out.print("nincs negativ");
            }
            System.out.println("\nA negatív tömb összege: "+negativOsszeg);
            System.out.println("A negatív tömb átlaga: "+(double) negativOsszeg/negativDb);
    }
    
}