package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap= new HashMap<>();
        myMap.put("H",3);// Bu direkt koyacak ve ayni degerde varsa onu ezerek onun yerine koyacak
        myMap.putIfAbsent("K",5);// bu ise önce bakacak var mi yok mu, yoksa ekler

        // Bir ekleme yapmak istedigimizde Key daha önce eklenmemisse  map'e eklesin
        // daha önce

        System.out.println(myMap.putIfAbsent("A", 6));

        if (myMap.putIfAbsent("K", 20)!=null){
            System.out.println("Girdiginiz key zaten map'te var");

        }
        System.out.println(myMap);//{A=6, H=3, K=5}
        /*
        compute(key, (key,value) value)-->yeniDeger);
        verilen map'deki istenen key degerine sahip elemanin value'sunu gunceller key map'te yoksa ekler
         */

        myMap.computeIfAbsent("A", v->20);// yoksa 20 yap demek bu
        System.out.println(myMap);//{A=6, H=3, K=5}
        // Eger her durumda degistirmesini istiyorsak

        myMap.compute("A" , (key,value)->20);// Buna lamda expertions deniliyor
        System.out.println(myMap);//{A=20, H=3, K=5}

        // H degerini 2 katinin  5 fazlasi yapalim
        myMap.compute("H", (Key, value)->(2*value+5));
        System.out.println(myMap);//{A=20, H=11, K=5}

        myMap.compute("H", (n,m)->(2*m+5));
        System.out.println(myMap);



    }
}
