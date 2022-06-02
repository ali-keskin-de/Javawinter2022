package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        Map<Integer,String> sinif= MapOlustur.myMap();

        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        // Map yapisinda yazdirdigimizda kullanici  bir sey anlamayabilir
        // bunun icin önce map kodlarla manupile edip map'teki datalari istedigimiz formatta saklamamiz gerekir
        //1.Adim key ve value'lari alip iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valuesSet=sinif.values();

        System.out.println(keySet);
        System.out.println(valuesSet);
        System.out.println(valuesSet.size());

        for (String each: valuesSet
             ) {
            System.out.println(each);

        }
    }
}
