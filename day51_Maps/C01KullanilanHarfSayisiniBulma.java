package day51_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
        /*
        Soru1: Verirlen bir String te harflerin
        ve harfleri kacar kez kullanildigini return eden bir method yaziniz

         Örnek: Hellooo output:H=1 e=1 l=2 o=3
         */

        String str="Hellooo";
        String harfArr[]=str.split("");
        System.out.println(Arrays.toString(harfArr));

        Map<String,Integer> kullanimSayisi=new HashMap<>();

/*
        for (int i = 0; i < harfArr.length; i++) {
          if (kullanimSayisi.containsKey(harfArr[i])){
              kullanimSayisi.put(harfArr[i],kullanimSayisi.get(harfArr[i])+1);

          }else {
              kullanimSayisi.put(harfArr[i],1 );
          }


        }
        System.out.println(kullanimSayisi);

 */
        for (String each: harfArr
             ) {
            if (kullanimSayisi.containsKey(each)){
                kullanimSayisi.put(each, kullanimSayisi.get(each)+1);
            }else {
                kullanimSayisi.put(each,1);
            }

        }
        System.out.println(kullanimSayisi);

    }
}
