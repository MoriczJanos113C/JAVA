package polimorfizmus;


public class Polimorfizmus {

    
    public static void main(String[] args) {
        Macska macsesz = new Macska("jakab", 4);
        Macska macsesz2 = new Macska();
        System.out.println(macsesz.equals(macsesz2));
        
        System.out.println(macsesz.getNev());
        System.out.println(macsesz.getSuly());
        macsesz.makeSound();
    }
    
}
