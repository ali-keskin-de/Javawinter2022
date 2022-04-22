package day47_Linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Linkedlist {
    public static void main(String[] args) {

        //

        Deque<Integer> ll1= new LinkedList<>();

        ll1.addFirst(10);
        ll1.addLast(20);
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//10 ilk elementi bize silmeden döndürür yoksa exception firlatir

        System.out.println(ll1);
        System.out.println(ll1.getFirst());//10
        System.out.println(ll1.getLast());//20

        System.out.println(ll1.offer(1));// sona ekelr bize birsey döndürmez
        System.out.println(ll1);
        System.out.println(ll1.offerLast(30));// sona ekelr bize true döner
        System.out.println(ll1);
        System.out.println(ll1.contains(20));// vara true
        System.out.println(ll1.contains(2));// yoksa false döner bize

        System.out.println(ll1.peek());// en bastaki elementi getirir ve silmez ilk eleman yoksa null döndürür





    }
}
