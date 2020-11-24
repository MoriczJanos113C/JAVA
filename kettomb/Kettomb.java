/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kettomb;

import java.math.*;

public class Kettomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Két tömb kiíratása, Készítette: Móricz János Milán 1/13c");
        int tomb1[] = {30,40,57,80,50};
        int tomb2[] = new int [5];
        for(int i=0; i<5; i++){
         tomb2[i] = (int) (Math.random()*99)+1;
        }
        for(int i=0; i<5; i++){
            System.out.print("tomb1 "+(i+1)+" tagja: ");
            if(tomb1[i]>9){
                System.out.print(tomb1[i]+" tomb2 "+(i+1)+" tagja: ");
            }
            else{
                System.out.print(" "+tomb1[i]+" tomb2 "+(i+1)+" tagja: ");
            }
            if(tomb2[i]>9){
                System.out.println(tomb2[i]);
            }
            else{
                System.out.println(" "+tomb2[i]);
            }
            System.out.println("A két tömb különbsége: "+(tomb1[i]-tomb2[i]));
            
            if(tomb1[i]>tomb2[i]){
                System.out.println("Az első tömb eleme nagyobb: "+tomb1[i]);
            }
            else if(tomb2[i]>tomb1[i]){
                System.out.println("A második tömb eleme nagyobb: "+tomb2[i]);
            }
            else
                System.out.println("A két tömb egyenlő: "+(tomb1[i]==tomb2[i]));
            System.out.println("Ennyivel nagyobb: "+(tomb1[i]-tomb2[i]));
            }
    }
            
}
