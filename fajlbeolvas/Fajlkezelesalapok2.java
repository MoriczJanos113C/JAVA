package fajlkezelesalapok2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Fajlkezelesalapok2 {
    
        public static ArrayList<Diakok> osztaly=new ArrayList<>();
        
        public static void beolvas(){
            try{
                RandomAccessFile raf = new RandomAccessFile("C:\\Users\\moric\\Desktop\\nevek.txt","r");
                while(raf.getFilePointer()<raf.length()){
                    osztaly.add(new Diakok(raf.readLine()));
                }
                System.out.println("\nBeolvasva "+osztaly.size()+" rekord!\n");
                raf.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
            
    }
    public static void main(String[] args) {
        beolvas();
        
        
    }

}
class Diakok{
        public String vezNev;
        public String kerNev;
        public String kerNev2;
        
        //konstruktor létrehozása
        public Diakok(String sor){
        //a sorban lévő adatokat a szóközöknél felszeleteli és az adatok nevű tömbbe teszi
        System.out.println(sor);
        String[] adatok=sor.split(" "); 
        //adattagokhoz rendeljük a tömb megfelelő elemeit
            this.vezNev=adatok[0];
            this.kerNev=adatok[1];
            //this.kerNev2=adatok[2];
        }
}
        
    

