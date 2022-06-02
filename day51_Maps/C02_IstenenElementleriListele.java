package day51_Maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {

    /*
   Soru 2) Verilen map`te istenilen programlama dilini bilen kisileri list olarak döndüren bir method yaziniz
   map->{ 101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#)
  istenilen dil-> java
  sonuc-> [Ali, Veli
     */
    static String istenenDil="Java";
    public static void main(String[] args) {
        Map<Integer, String> sinifMap=MapOlustur.myMap();

       List<String> istenenDiliBilenlerListesi= istenenDiliBilenListesiOlustur(sinifMap);
        System.out.println(istenenDiliBilenlerListesi);


    }

    private static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap) {

        List<String> istenenDiliBilenlerListesi=new ArrayList<>();

        Collection<String> sinifValueColl=sinifMap.values();
        List<String> sinifValueList= new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        //System.out.println(sinifValueList);
        int outerArrayBoyut=sinifValueList.size();
        String ilkValue=sinifValueList.get(0);
        //System.out.println(ilkValue);
        String [] ilkValueArr=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArr.length;

        String valueMDArr[][]=new String [outerArrayBoyut][innerArrayBoyut];


        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];

            }
        }
        // System.out.println(Arrays.deepToString(valueMDArr));


        for (int i = 0; i < outerArrayBoyut; i++) {


                if (valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
                }
        }

        return istenenDiliBilenlerListesi;
    }
}
