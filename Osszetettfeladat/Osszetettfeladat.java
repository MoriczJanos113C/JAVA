/*
1. Hozz létre két tömböt: szamok1, szamok2 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
3. Az elemek a -50 és +50 értéktartományba essenek.
4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
 */
package osszetettfeladat;
 
import java.util.Scanner;  //scanner létrehozasa               

public class Osszetettfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nÖSSZETETT FELADAT, KÉSZÍTETTE: Móricz János Milán 1/13C");
        Scanner bemenet = new Scanner(System.in); //Scanner lehivasa
        char valasz = 0;  //betu az elotesztelohoz
        do{
        //2. feladat
        int darabszam = (int) (Math.random() * 10) + 30; //darabszam meghatározása, mennyi elemu legyen majd a 2 tomb
        
        //1. feladat
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam]; //szamok1,2 tombbének létrehozása és a darabszam határozza meg (amit 31. sortol irtam) az elemeinek tartományát illetve értékeit
        
        //3. feladat
        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -100) + 50;
            szamok2[i] = (int) (Math.random() * -100) + 50; //darabszam tartományának meghatározása (-50tol +50ig)
        }
        //4. feladat
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " "); //szamok1,2 meghatározása
        }
        //5. feladat
        //ottel oszthato szamok meghatározása az ujTombbe
        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        
        //sorbarendezes buborekosmodszerrel
            for (int i = 0; i < ujTombdb-1; i++) {
                for (int j= 0; j < ujTombdb-i-1; j++) {
                    if (ujTomb[j]>ujTomb[j+1]) {
                    int temp=ujTomb[j];
                    ujTomb[j]=ujTomb[j+1];
                    ujTomb[j+1]=temp;
                }
            }
            }
         
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " "); //ujTomb kiíratása
        }
        //idáig az 5. feladat
         
         //6. feladat
            int legkisebb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) {  //Lekisebb szám az új tömbből
                if (ujTomb[i] < legkisebb) {
                    legkisebb = ujTomb[i];
                }
            }
            
            int legnagyobb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) {  //Legnagyobb szám az új tömbből
                if (ujTomb[i] > legnagyobb) {
                    legnagyobb = ujTomb[i];
                }
            }
            System.out.print("\nAz ujTomb legnagyobb száma: "+legnagyobb);
            
            System.out.print("\nAz ujTomb legkisebb száma: "+legkisebb); //kiírattam a legnagyobb legkisebb számot az ujTombbol
            
            //7. feladat         
            if (ujTomb[ujTombdb-1]%ujTomb[0] == 0 ) {
                System.out.println("\nAz ujtomb legnagyobb eleme a legkisebb elemének a többszöröse");
            }
            else{
                System.out.println("\nAz ujtomb legnagyobb eleme nem a többszöröse a legkisebb elemével");
            }
            //9. feladat
            System.out.println("Szeretné újra futtatni a programot? Ha igen akkor: i , Ha nem akkor: n");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I')); //elotesztelo ciklus betűvel
}
}
