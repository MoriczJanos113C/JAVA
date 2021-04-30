
package lottozzunk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lottozzunk {

    public static void main(String[] args) {
        
        ArrayList<Integer> lotto = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("Ez egy lottóhúzós program");
        System.out.println("Számok tud beírni 1-9ig, ha eltalálja az 5db számot akkor nyert!");
        System.out.println("Sok sikert!");
       
        
        System.out.print("\nKerjem ide irja be az elso számot: ");
        int elso=bemenet.nextInt();
        while(!(elso==1 || elso==2 || elso==3 || elso==4 || elso==5 || elso==6 || elso==7 || elso==8 || elso==9)){       
            System.out.println("1-9ig huzhat csak!");
            System.out.print("\nKerjem ide irja be az elso számot: ");
            elso=bemenet.nextInt();  
        }
        lotto.add(elso);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKerjem ide irja be a masodik számot: ");
        int masodik=bemenet.nextInt();
        while(!(masodik==1 || masodik==2 || masodik==3 || masodik==4 || masodik==5 || masodik==6 || masodik==7 || masodik==8 || masodik==9)){       
            System.out.println("1-9ig huzhat csak!");
            System.out.print("\nKerjem ide irja be a masodik számot: ");
            masodik=bemenet.nextInt(); 
        }
        lotto.add(masodik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKerjem ide irja be a harmadik számot: ");
        int harmadik=bemenet.nextInt();
        while(!(harmadik==1 || harmadik==2 || harmadik==3 || harmadik==4 || harmadik==5 || harmadik==6 || harmadik==7 || harmadik==8 || harmadik==9)){       
            System.out.println("1-9ig huzhat csak!");
            System.out.print("\nKerjem ide irja be a harmadik számot: ");
            harmadik=bemenet.nextInt(); 
        }
        lotto.add(harmadik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKerjem ide irja be a negyedik számot: ");
        int negyedik=bemenet.nextInt();
        while(!(negyedik==1 || negyedik==2 || negyedik==3 || negyedik==4 || negyedik==5 || negyedik==6 || negyedik==7 || negyedik==8 || negyedik==9)){       
            System.out.println("1-9ig huzhat csak!");
            System.out.print("\nKerjem ide irja be a negyedik számot: ");
            negyedik=bemenet.nextInt();  
        }
        lotto.add(negyedik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKerjem ide irja be az ötödik számot: ");
        int otodik=bemenet.nextInt();
        while(!(otodik==1 || otodik==2 || otodik==3 || otodik==4 || otodik==5 || otodik==6 || otodik==7 || otodik==8 || otodik==9)){       
            System.out.println("1-9ig huzhat csak!");
            System.out.print("\nKerjem ide irja be az ötödik számot: ");
            otodik=bemenet.nextInt();  
        }
        lotto.add(otodik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
       
        
        System.out.println("Ezek voltak a nyerő számok: ");
        
        while(s.size()!=5){
            s.add((int)(Math.random()*8)+1);
        }
        System.out.println(s);
        
        if(lotto==s){
        System.out.println("\nNyertél!");
        }
        else{
            System.out.println("Sajnos nem nyertél, sajnájuk!");
        }

    }
    
}
