package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_Iterator {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("D");
        list.add("C");

        System.out.println(list); //[A, D, C]

        Iterator<String> li1=list.iterator();
        while (li1.hasNext()){
            li1.next();
            li1.remove();
        }
        System.out.println(list);//[]

    }
}
