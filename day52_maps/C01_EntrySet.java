package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();

        System.out.println(sinifListMap);
        /*
        mymap.entrySet(); method'u bize Entry'lerden olusan bir set döndürür
        Eger bu Entry'leri manipüle etmek istiyorsak
        method'un döndürdügü icin Set'i yeni bir Set olusturup store etmeliyiz
         */

        sinifListMap.entrySet();
        Set<Map.Entry<Integer,String>> sinifENtrySeti=sinifListMap.entrySet();
        System.out.println("No  Isim  Soyisim  Brans  D.Yili");
        System.out.println("--------------------------------");
        for (Map.Entry<Integer,String> each: sinifENtrySeti
             ) {
            // String entryStr=each.toString(); Bu sekilde de Stringe dönüstürülür
            Integer entryKey= each.getKey();
            String valueStr= each.getValue();
            String valueArr[]= valueStr.split(", ");

            System.out.println(entryKey+ "  "+valueArr[0]+"  "+valueArr[1]+"  "+valueArr[2]+"  ");




        }

    }
}
