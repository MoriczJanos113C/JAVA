
package szemelyeekop;

public class SzemelyeekOP {

    public static void main(String[] args) {
        Szemelyek Jani = new Szemelyek();
         Jani.eletkor = 20;
         Jani.hajszin = "barna";
         Jani.hazas_e = false;
         Jani.iq = 1000000;
         Jani.magassag = 300;
         Jani.nem = "nem";
         Jani.testsuly = 3111;
         
         
         Tanulok Elemer = new Tanulok();
         Elemer.eletkor = 20;
         Elemer.nem = "ferfi";
         Elemer.osztondijas_e = true;
         
         
         System.out.println(Jani.eletkor);
         System.out.println(Elemer.osztondijas_e);
    }
    
}
