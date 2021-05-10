package szinezzunk;

import java.util.*;

public class Szinezzunk {

    public static void main(String[] args) {
        String szinek [] = {"piros", "zöld", "kék", "narancs", "sárga", "fehér", "fekete", "lila", "cián", "barna"};
        Set otSzin = new HashSet();
        Set otSzin2 = new HashSet();

        System.out.println("első játkos: ");
        do {
            int index = (int) (Math.random() * 9) + 1;
            otSzin.add(szinek[index]);
        }
        while (otSzin.size()!=5);
        List<String> rendezettSzinek1 = new ArrayList<String>(otSzin);
        Collections.sort(rendezettSzinek1);
        System.out.println(rendezettSzinek1);

        System.out.println("második játkos: ");
        do {
            int index = (int) (Math.random() * 9) + 1;
            otSzin2.add(szinek[index]);
        }
        while (otSzin2.size()!=5);
        List<String> rendezettSzinek2 = new ArrayList<String>(otSzin2);
        Collections.sort(rendezettSzinek2);
        System.out.println(rendezettSzinek2);

        //összehasonlítás
        List<String> egyezoek = new ArrayList<>();
        Iterator i = rendezettSzinek1.iterator();
        while(i.hasNext()) {
            String ezaszin = (String) i.next();
            if (rendezettSzinek2.contains(ezaszin)) {
                egyezoek.add(ezaszin);
            }
        }
        System.out.println(egyezoek);
    }
}