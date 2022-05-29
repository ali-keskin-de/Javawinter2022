package day47_Linkedlist;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_Linkedlist {
    public static void main(String[] args) {

        Deque<Integer> ll1= new LinkedList<>();
        System.out.println(ll1.peek());// null Bos iken kullanirsak (ilk elementi getiriyor )

        //System.out.println(ll1.element());// Bos iken kullanirsak exception firlatiyor (ilk elementi getiriyor )

        System.out.println(ll1.poll());// Bosken bize null dönürüyor

        ll1.push(30);// listenin basina element ekler
        ll1.push(20);
        System.out.println(ll1);

        System.out.println(ll1.remove());// ilk elementi siler ve bize dondurur
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);// object olarak 50'yi siler
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);





    }
}
