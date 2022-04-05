package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        // verilen bir Listede tekrar eden sayilari sadece birkere yazdiran bir method olusturun
        // örnek: [1, 3, 5, 3, 5, 6, 1, 7]
        // output: [1, 3, 5, 6, 7]
        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeolustur(sayilar);


    }

    public static void tekrarsizListeolustur(List<Integer> sayilar) {
        

    }
}
