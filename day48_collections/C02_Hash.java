package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str="Java cok güzel";
        System.out.println(str.hashCode());//-477566259

        String str2="Hava cok güzel";

        System.out.println(str2.hashCode());//533550991
        Set<Integer> sayiKümesi= new HashSet<>();

        sayiKümesi.add(10);
        sayiKümesi.add(20);

        System.out.println(sayiKümesi.hashCode());//0

    }
}
