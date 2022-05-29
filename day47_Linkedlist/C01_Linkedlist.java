package day47_Linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_Linkedlist {
    public static void main(String[] args) {

        // LinkedList iki tane parent interface'i vardir.
        //LinkedList olusuturur iken data türü olarak;
        // LinkedList secersek : iki parent class'daki tüm method'lari
        //List secersek :sadece List Interface'indeki methodlari
        // Deque/Queue secersek : Deque'deki methidleri kullanabiliriz

        LinkedList<Integer> ll1=new LinkedList<>();

        ll1.add(10);// Linkedlist'ten bu method'u calistiri


        // sadece List interface özellikler kulanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        // sadece Deque den gelen özellikleri kullanalim

        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);


        System.out.println(ll3);//[15, 20]
        ll3.addLast(40);//[15, 20, 40]



    }
}
