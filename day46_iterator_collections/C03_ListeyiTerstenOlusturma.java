package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenOlusturma {
    // verilen bir listeyi sondan basa dogru yazdiralim

    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        // önce iterator olusturup, sona yollayalim

        ListIterator itr= liste.listIterator();

        while (itr.hasNext()){
            itr.next();
        }

        while(itr.hasPrevious()){
            System.out.print(itr.previous() + " ");
        }
    }

}
