/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;

/**
 *
 * @author moric
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tMEGSZÁMLÁLÁS TÉTELE, Készítette:Móricz János Milán 113c\n");
        int[] tomb = new int [5];
        int szamlalo=0; //számláló változó létrehozása a dbszámok eltárolásához
        int parosSzamlalo=0;
        
        for (int i=0;i < 5; i++) {
            tomb[i] = (int) (Math.random()*99)+1;
            szamlalo++; //minden szám előállításakor nő az értéke eggyel
            
            if (tomb[i]%2==0) {
                parosSzamlalo++;             
            }
        }
    
        System.out.print("A tömb1 elemei: \n");
        for(int i = 0; i <5; i++){
            System.out.print(i+1+". elem: "+" ");
            if (tomb[i]%2!=0) {
                System.out.println("Páratlan: "+tomb[i]);
            }
            else
            System.out.print(String.format("%,2d",tomb[i])+" \n");
        }
        
        System.out.println("");
        System.out.println(szamlalo+"elemű a tömbünk\n");
        System.out.println("A tömbben: "+parosSzamlalo+" páros szám van");
    }
    
    }
    

