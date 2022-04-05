package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);//[5]
        sayilar.add(3);//[5, 3]
        sayilar.add(0,7);//[7, 5, 3]
        sayilar.add(2,7);//[7, 5, 7, 3]

        sayilar.remove(3);// index 3'teki elemani siler yani burda 3 siller.
        // sayilar.remove(5);// burdada index aut of bounds Exception 'ni aliriz
        /*
        sayilardan olusan bir list'te objeyi vererek element silme method'u calismaz
        sayi degeri girdigimizde  java bunu sayiyi index olarak kabul eder
         */

        //int sayi=5;
        //sayilar.remove(sayi); //urdada index aut of bounds Exception 'ni aliriz

        Integer sayi=5;// Integer wrapper class'i kullanilinca sayi obje oldugundan, bu method calisti.
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7, 7] aradaki fark bu obje oldugundan bu kaldirilabilir digeri primitive dir

        //sayilar.remove(Integer.valueOf("5")); bu da olur ancak dolabacli

    }
}
