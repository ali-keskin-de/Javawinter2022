package deneme;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListeyiTestenolusturma {
    public static void main(String[] args) {
/*
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        ListIterator<Integer> listItr=list.listIterator();

        while(listItr.hasNext()){// bununla en sona itr götürdük
            listItr.next();
        }
        List<Integer> list2=new ArrayList<>();

        while(listItr.hasPrevious()){// sonda ki itr tekarar dönerken bunlari yazdirdik

            list2.add(listItr.previous());
        }
        System.out.println(list2);
        list=list2;
        System.out.println(list+" list");



        List<String> list3=new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("D");
        System.out.println(list3);

        ListIterator<String> list3Itr= list3.listIterator();

        while (list3Itr.hasNext()){
            String str=list3Itr.next();
            list3Itr.set(str+"X");
        }
        System.out.println(list3);

 */

        List<Integer> input= new ArrayList<>();
        input.add(2);
        input.add(13);
        input.add(56);
        input.add(23);
        input.add(45);
        input.add(14);
        input.add(40);
        System.out.println(input);
        System.out.println(input.toArray().length);
        System.out.println(input.get(1));
        //System.out.println(input.remove(1));
        System.out.println(input);

/*
        for (int i = 0; i < input.toArray().length; i++) {

            if ((input.get(i) >= 20) && (input.get(i) <= 40)){
                System.out.print(input.get(i)+" ");
            }

        }

 */
      ListIterator<Integer> inputItr=input.listIterator();

     while(inputItr.hasNext()){
         Object sayi=inputItr.next();

         if ((Integer)sayi<20 || (Integer)sayi>40){
             inputItr.remove();

         }

     }
        System.out.println(input);
    }
}
