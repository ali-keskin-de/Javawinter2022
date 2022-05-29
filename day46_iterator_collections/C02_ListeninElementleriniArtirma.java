package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]

        /* listenin tum elementlerini bize getirmesi icin
           iterator'un hasNext() ve next() methodlarini kullanacagiz
         */

        ListIterator itr = liste.listIterator();// bu sekilde ListIterator ile biz set methodunu kullanabiliriz ve 3 ekleyebiliriz
        System.out.println(itr.hasPrevious());//false [(itr)5, 7, 8, 6, 9] itr.hasPrevious() bunun anlami itr arkasinda birsey var mi

        while(itr.hasNext()){ // yaninda element oldugu müddetce calisacak

           Object sayi=itr.next();
           itr.set((Integer)sayi+3);

        }
        System.out.println(liste);

        List<String> list= new ArrayList<>();
        list.add("Ahmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Fatma");
        list.add("Hüseyin");
        System.out.println(list);

        Iterator<String> itr1=list.iterator();
        /*
        while(itr1.hasNext()){
            System.out.print(itr1.next()+",");
        }

         */
        // remove ile listedeki elemanlari sile biliriz

        while(itr1.hasNext()){// hasNext() method'u ile yaninda bir eleman varmi diye soruyor(true yada false döner) varsa while döngüsü calisir
            itr1.next();// next() method'u list elemanlarinin sütünden gecerek getirir ve bir sonraki elemana gecer
            itr1.remove();//elemanlari siler
            // bu islem listedeki tüm elemanlar silinene kadar devam eder listede eleman kalmayinca while döngüsü false verir ver while ici calismaz
        }
        System.out.println(list);// burda [] listemiz bosaldi


    }
}
