/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorbarendezesbuborekosmodszer;

import java.util.Scanner;

public class SORBARENDEZESbuborekosmodszer {

    
    public static void main(String[] args) {
        System.out.println("\nSORBARENDEZÉS TÉTELE(buborékos módszer)\n, Készítette:Móricz János Milán 1/13C");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni? ");
        Scanner bemenet=new Scanner(System.in);
        int elemSzam=bemenet.nextInt();
        int[] szamok=new int[elemSzam];
        
        //tömb felöltése - elemek random értéket kapnak
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int) (Math.random()*100)-50;          
        }
        
        //tömb kiíratása
        System.out.println("\nTömbünk elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        
        //tömb sorbarendezett kiíratása: buborékos rendezés
        for (int i = 0; i < elemSzam-1; i++) {
            for (int j = 0; j < elemSzam-i-1; j++) {               
                if (szamok[j]>szamok[j+1]) {
                int temp=szamok[j];
                szamok[j]=szamok[j+1];
                szamok[j+1]=temp;
            }
        }
        }
        System.out.println("\nRendezett tömbünk: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
    int negativDb=0;
       
       for (int i = 0; i < elemSzam; i++) {
            if (szamok[i]<0) {
                negativ[negativDb++]=szamok[i];
                
            }
        }
    int negativOsszeg=0;
       System.out.println("\n\nNegatív számok növekvő sorrend szerint: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb-1; i++) {
                for (int j = 0; j < negativDb-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
            
            
    }
  
    
}
