package day47_Linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        // verilen bir Array'den tekrar eden elementleri silip
        // unique elementlerden olusan bir array haline donduren bir method olusturun

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arr=benzersizYap(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet= new HashSet<>();// sirali olsun istiyorsaniz Set<Integer> benzersizSet= new TreeSet<>();
        for (Integer each: arr
        ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        // Set'e index yapisi yoktur bu sebepten foreach kullanilir
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index=0;


        return arr;

    }


}
