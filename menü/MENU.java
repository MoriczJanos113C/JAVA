/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author moric
 */
public class MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MENU feladat, Készítette:Móricz János Milán 1/13C");
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        int valasz;
        boolean szerepelE=false;
        
        //1.,2.feladat
        int elemSzam = (int) (Math.random()*10)+10;
        int szamok[]= new int [20];
        
        //3.feladat
        for (int i = 0; i < elemSzam; i++) {
            szamok[i] = (int) (Math.random()*-100)+50; 
        }
        
        //4.feladat
        System.out.print("A szamok elemei:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%,4d", szamok[i])+" ");
    }
        
        //5.feladat
        System.out.println("\nMilyen műveletet szeretne végezni a számok tömbbel?");
        System.out.println("Ha a számok összes elemének az összegét kiíratni írjon be egy 1-es számot");
        System.out.println("Ha a legkisebb és legnagyobb számot szeretné kiíratni irja be a 2-es számot");
        System.out.println("Ha azt szeretné tudni, hogy van-e benne 40-50 közötti szám írja be a 3-as számot");
        System.out.println("Ha azt szeretné tudni, hogy van-e benne 5-tel oszthato szám akkor a 4-es számot");
        System.out.println("Ha ami számot beírt arról szeretné, hogy tartalmazza-e a számok tömb akkor az 5-ös számot");
        
        System.out.print("\nÍrja be ide azt a számot: (1/2/3/4/5)");
        valasz=bemenet.nextInt();
        
        while(!(valasz==1 || valasz==2 || valasz==3 || valasz==4 || valasz==5)){
            System.out.print("\nCsak az alábbi listából adjon meg számot: 1/2/3/4/5! ");
            valasz=bemenet.nextInt();
        }
        //1.rész
        if (valasz==1){
            int szamokOsszeg=0;
            for (int i = 0; i < elemSzam; i++) {
                    
                    szamokOsszeg = szamokOsszeg+szamok[i];
                }
            System.out.println("A számok tömbjének összege: "+szamokOsszeg);
        }
        //2.rész
        if (valasz==2){   
        int legkisebb = szamok[0];
            for (int i = 1; i < szamok.length; i++) {  //Legnagyobb szám meghatározása az új tömbből
                if (szamok[i] < legkisebb) {
                    legkisebb = szamok[i];
                }
            }
            
            int legnagyobb = szamok[0];
            for (int i = 1; i < szamok.length; i++) {  //Legkisebb szám meghatározása az új tömbből
                if (szamok[i] > legnagyobb) {
                    legnagyobb = szamok[i];
                }
            }
            System.out.print("\nA számok tömb legnagyobb száma: "+legnagyobb);
            
            System.out.print("\nA számok tömb legkisebb száma: "+legkisebb);
        }
            
        //3.rész
        if (valasz==3){
           int vane = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]>=40){
                            vane = 1;
                            break;
                        }
                    }
                    if(vane==1){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    } 
        }
        
        //4.rész
        if (valasz==4){
            for (int i = 0; i < elemSzam; i++) {
            if (szamok[i] % 5 == 0) {
                szerepelE=true;
            }
            else{
                szerepelE =false;
            }
        }
            if (szerepelE=true) {
                System.out.println("\nA számok tömbben szerepel 5el oszthato elem");
            }
            else{
                System.out.println("\nA számok tömbben nem szerepel 5tel oszthato elem");
            }
            System.out.print(szerepelE+" ");
        }
        
        
        //5.rész
        if (valasz==5){
            
        
        System.out.print("\nÍrja be ide azt a számot! ");
        int keresettSzam = bemenet.nextInt();
        
        int j=0;
        for (int i = 0; i < elemSzam; i++) {
          if (szamok[i]  == keresettSzam){
              System.out.print("Tartalmazza és az indexe: "+(i+1));
              break;
            }
          j++;
          
        }
        
        if (elemSzam == j) {
            System.out.println("Nem tartalmazza");
        } 
        
        bemenet.close();
        }
}
}
