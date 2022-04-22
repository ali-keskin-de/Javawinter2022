package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); //[5, 7, 8, 6, 9]

        // Asagida liste obje si üzerinden iterator methodunu kullaniyoruz

        Iterator itr= liste.iterator();
        // Iterator methodunu olusturdugumuz liste objesi üzerinden Arraylist class'indan calistiriyoruz
        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde calismak icin olusturmus olduk
        Biz Iterator collection'in ilk elementini oncesine gidip bekler

        [(itr)5, 7, 8, 6, 9]
        itr,hasNext()===> true bu su demek yaninda elemet varmi true ada false döner

        bunu yazdir dersek;
        System.out.println(itr.next());===> iterator bir sonraki elementin yanina gecer ve üzerinden gectigi elemanti bize döndürür
        [5, 7,(itr) 8, 6, 9]//7
        [5, 7,(itr) 8, 6, 9]//7
        itr.remove();// iterator'in elinde olan elementi sildi
        Dolayisi ile üst üste remove kullanilamaz
        önce itr.next(); methodunu calistirip iterator eline bir element almasini saglamaliyiz.



         */

        System.out.println(itr.hasNext());// true hasNext() method' sunu demek yaninda birsey var mi

        System.out.println(itr.next());//5
        System.out.println(itr.next());//7 , [5, 7,(itr) 8, 6, 9]//7
        itr.remove();
        System.out.println(liste);//[5, 8, 6, 9] elindeki 7 yi iterator silmis

        // itr.remove();
        System.out.println(itr.next());//8
        System.out.println(itr.next());//6
        System.out.println(itr.next());//9
        System.out.println(itr.hasNext());//false [5, 7, 8, 6, 9(itr)]//false








    }
}
