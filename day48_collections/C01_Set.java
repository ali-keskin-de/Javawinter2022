package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        // Verilen bir Array'in tekrar eden elementlerini saadece bir kere yazdiran bir method olusturunuz

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayinTekrarsizYazdir(arr);
    }

    private static void arrayinTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementlerKümesi= new HashSet<>();

        for (Integer each:arr
             ) {
            tekrarsizElementlerKümesi.add(each);

        }
        System.out.println(tekrarsizElementlerKümesi);
    }
}
