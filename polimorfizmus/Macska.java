/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfizmus;

/**
 *
 * @author moric
 */
public class Macska extends Animal implements Pet {
    
    public Macska(){
        this.setNev("Jolan");
    }
    public Macska(String nev){
        this.setNev(nev);
    }
    public Macska(String nev, int suly){
        this.setNev(nev);
        this.setSuly(suly);
    }
   
    
    
    
    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    @Override
    public void cuddle() {
        System.out.println("ölelj");
    }

    @Override
    public void hug() {
    }

    @Override
    public void layDown() {
    }
}
