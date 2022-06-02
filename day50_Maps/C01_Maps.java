package day50_Maps;

import day49_maps.MapOlustur;

import java.util.*;

import static day49_maps.MapOlustur.myMap;

public class C01_Maps {
    public static void main(String[] args) {
        // siniftaki ögrenci listesini düzenli ve anlasilir sekilde yazdiralim

       Map<Integer,String> sinifList=MapOlustur.myMap();
        System.out.println(sinifList);
        /*
        Eger key'lere tek tek ulasmak istersek index yapipisina ihtiyacimiz var ancak map index yapisini desteklemez
        bunun icin key'leri once bir set'e sonrada setteki elemanlari hepsini bir liste ekledik
         */

       Set<Integer> sinifKeySeti= sinifList.keySet();

        List<Integer> keyList= new ArrayList<>();
        keyList.addAll(sinifKeySeti);


        // Simdi de value'leri index ile ulasabilecegimiz bir sekle sokalim
        Collection<String> sinifValueColl= sinifList.values();
        System.out.println(sinifValueColl);

        List<String> sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);

        /*
         her bir Value birden fazla bilgiyi iceriyor onun icin valuleri muttilidimensional bir arraya'e
         atmak mantikli duruyor ancak MDA olusturmak icin boyutlari bilmeye ihtiyacicimiz var

         */
        int outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner array'lerin boyutlarini bulmak biraz daha komplex olacak

        String ilkValue= sinifValueList.get(0);
        System.out.println(ilkValue);

        String ilkValueArray[]= ilkValue.split(", ");
        int innerArrayBoyut= ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] =sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];

            }


        }
        System.out.println();


         // Bu satira kadar key'leri index ile ulasabildigim keyList'e atadim
        // Value'leri valueMDArr'e attadim
        // simdi bu key ve value'leri istedigim gibi manuple edebilirim

        System.out.println("Numara   isim   Soyisim  Brans");
        System.out.println("==============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "     ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j]+"     ");

            }
            System.out.println("");

        }


    }
}
