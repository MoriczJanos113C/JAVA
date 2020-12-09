/*
1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
3. Az elemek a -100 és +100 értéktartományba essenek.
4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):
     1. számok: 98 + 65 + 34 = 197
6. Írasd ki a páros indexű tömbelemek legkisebb elemét.
    Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)!
 */
package keresztmetszet;

import java.util.Scanner; 

public class Keresztmetszet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("KERESZTMETSZET,KÉSZÍTETTE:Móricz János Milán 1/13C");
        Scanner bemenet = new Scanner(System.in); //Scanner lehívása
       char valasz = 0;
       do{
           //2.feladat
           int darabszam = (int) (Math.random() * 6) + 5; //tombok elemeinek száma(itt 5 és 10 között)
           //1. feladat
           int[] szamtomb1 = new int[darabszam];
           int[] szamtomb2 = new int[darabszam];
           int[] szamtomb3 = new int[darabszam]; //3tomb megadasa
           
            //3.feladat
           for (int i = 0; i < darabszam; i++) {
            szamtomb1[i] = (int) (Math.random() * -201) + 100;
            szamtomb2[i] = (int) (Math.random() * -201) + 100;
            szamtomb3[i] = (int) (Math.random() * -201) + 100; //legenerálja a számokat -100 és 100 között
           }
        //4.feladat  
        System.out.println("\nA szamtomb1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamtomb1[i]) + " ");
        }
        System.out.println("\nA szamtomb2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamtomb2[i]) + " ");
        }
        System.out.println("\nA szamtomb3 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamtomb3[i]) + " "); //tömbök kiíratása
        }
           System.out.println("");
        //5.feladat
        int szam=1;                           
        for (int i = 0; i < darabszam; i++) {
            int osszeg=szamtomb1[i]+szamtomb2[i]+szamtomb3[i];
            System.out.println(szam++ +".számok:"+szamtomb1[i]+"+"+szamtomb2[i]+"+"+szamtomb3[i]+"="+osszeg );
        }
        
        //6.feladat
        int in=2;                    
        System.out.print("Legkisebb számok: ");
        for (int i = 0; i <=darabszam; i++) {
            if(in>darabszam || in>darabszam-1  ){break;}
            else if (szamtomb1[in]<szamtomb2[in] && szamtomb1[in]<szamtomb3[in]){
              System.out.print(String.format(" ("+in+".)"+szamtomb1[in]));
              in+=2;
            }
            else if (szamtomb2[in]<szamtomb1[in] && szamtomb2[in]<szamtomb3[in]){
               System.out.print(String.format(" ("+in+".)"+szamtomb2[in]));
               in+=2;
            }
            else if (szamtomb3[in]<szamtomb1[in] && szamtomb3[in]<szamtomb2[in]){
               System.out.print(String.format(" ("+in+".)"+szamtomb3[in]));
               in+=2;
            }
        }
        //7.feladat
        int [] teljesTomb=new int [darabszam*3];
            int teljesTombdb = 0;                   
          
            
            for (int i = 0; i < darabszam; i++) {
               teljesTomb[teljesTombdb++] += szamtomb1[i];
               teljesTomb[teljesTombdb++] += szamtomb2[i];
               teljesTomb[teljesTombdb++] += szamtomb3[i];
            }
            //sorbarendezés_buborékosmódszer
            for (int i = 0; i < teljesTombdb-1; i++) {
                for (int j = 0; j <teljesTombdb-i-1 ; j++) {
                     if (teljesTomb[j]>teljesTomb[j+1]){
                         int temp=teljesTomb[j];                        
                         teljesTomb[j]=teljesTomb[j+1];
                         teljesTomb[j+1]=temp;
                 }           
            }
        }
            System.out.println("\nA teljesTömb elemei:");  
            for (int i = 0; i < teljesTombdb; i++) {
               System.out.print(String.format("%,4d", teljesTomb[i]) + " ");//teljes tomb kiíratása

      }
        //8.feladat
        System.out.print("\nTöbb is szerepel belőlük a teljesTömbben: ");
            
            int len=-1;                                              
            int ho=0;                                               
            for (int j = 0; j < teljesTombdb-1 ; j++) {
                if (teljesTomb[j]==teljesTomb[j+1]){
                     len+=1;   
                     ho+=1;
                     int tobb [] =new int[ho];
                     tobb[len]+=teljesTomb[j];
                     System.out.print(tobb[len]+", ");
                 }
                     }
            if (len==-1){System.out.print("Nincs ilyen szám");} 
        
        
        //9.feladat
       System.out.println("\nSzeretné újra futtatni a programot? Ha igen akkor: i , Ha nem akkor: n");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I')); //ujraindítást segíti

    }    
}
       

     

        
       
       


