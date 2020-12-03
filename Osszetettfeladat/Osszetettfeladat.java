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
 
import java.util.Scanner;                 

public class Osszetettfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nÖSSZETETT FELADAT, KÉSZÍTETTE: Móricz János Milán 1/13C");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
        int darabszam = (int) (Math.random() * 10) + 30;
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -50) + 50;
            szamok2[i] = (int) (Math.random() * -50) + 50;
        }
        
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        
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
        
            //sorbarendezes_buborekosmodszer
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
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
            System.out.println("\nA legkisebb száma az ujtombnek: "+ujTomb[0]);
            System.out.println("\nA legnagyobb száma az ujtombnek: "+ujTomb[ujTombdb-1]);
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
            }
        }
        
            if (ujTomb[ujTombdb-1]%ujTomb[0] == 0 ) {
                System.out.println("\nAz ujtomb legnagyobb eleme a legkisebb elemének a többszöröse");
            }
            else{
                System.out.println("\nAz ujtomb legnagyobb eleme nem a többszöröse a legkisebb elemével");
            }
            System.out.println("Szeretné újra futtatni a programot? Ha igen akkor: i , Ha nem akkor: n");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}
