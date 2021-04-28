package amerikaifoci;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmerikaiFoci {
    
    public static ArrayList<NFL> Jatekos = new ArrayList<>();
    public static void beolvasas(){
            try{
                RandomAccessFile file = new RandomAccessFile("NFL_iranyitok.txt","r");

                while(file.getFilePointer()<file.length()){
                Jatekos.add(new NFL(file.readLine())); 
            }
                file.close();
                System.out.println("\nA statisztikában "+Jatekos.size()+" irányító szerepel!");


            }
            catch(IOException e){
                System.out.println("e");
            }
        }
    
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        beolvasas();
        System.out.println("A lejobb irányítók:");
        for(NFL i : Jatekos){
              if (i.iranyitomutato>=100 && i.yardMeterben(i.yard)>=4000){
                    System.out.println("\t"+i.FormazottNev(i.nev));
                }
            }
        System.out.println("Eladott labdák száma: ");
        String eladott=sc.nextLine();

        Integer.parseInt(eladott);
        try {
            FileWriter myWriter = new FileWriter("legtobbeladott.txt");
            for(NFL i : Jatekos){
                if(i.eladott>10){
                ArrayList<String> jatekosnev= new ArrayList<>();
                jatekosnev.add(i.nev);
                Collections.sort(jatekosnev);
                
                for(String j : jatekosnev){
                    myWriter.write(j+"\n");
                }
               
                }
            }
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(AmerikaiFoci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

class NFL {

    public String nev;
    public int yard;
    public int kiserlet;
    public int sikeres;
    public int passz;
    public int eladott;
    public double iranyitomutato;
    public String egyetem;

    public NFL(String sor) {
        String[] adatok = sor.split(";");
        System.out.println(sor);
        this.nev = adatok[0];
        this.yard = Integer.parseInt(adatok[1]);
        this.kiserlet = Integer.parseInt(adatok[2]);
        this.sikeres = Integer.parseInt(adatok[3]);
        this.passz = Integer.parseInt(adatok[4]);
        this.eladott = Integer.parseInt(adatok[5]);
        String replaceString = adatok[6].replace(",",".");
        this.iranyitomutato = Double.parseDouble(replaceString);
        this.egyetem = adatok[7];
    }
        private  double Konvertal(String iranyitoMutato){
                return  Double.parseDouble(iranyitoMutato.replace(",", "."));
            }
	
        public int yardMeterben(int yard){
            double yardmeterben=yard*0.9144;
            String asd=String.valueOf(Math.round(yardmeterben));
            return Integer.parseInt(asd);
        }

    
	public String FormazottNev(String nev)
	{
		String [] n = nev.split(" ");
		n[n.length - 1] = n[n.length - 1].toUpperCase();
		return n[0]+" "+n[n.length - 1];
	}
}


        
        
