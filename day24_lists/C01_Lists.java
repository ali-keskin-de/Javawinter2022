package day24_lists;

import day23_arrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static <list> void main(String[] args) {
        int arr[]={};
        //bu array'e 5 ekleyelim
       arr= C06_Arrays.arrayeElementEk(arr,5);
        System.out.println(Arrays.toString(arr));//[5]

        arr=C06_Arrays.arrayeElementEk(arr,3);
        System.out.println(Arrays.toString(arr));//[5, 3]

        // bir list olusturalim
        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(5);//[5]
        sayilarList.add(3);//[5, 3]
        sayilarList.add(0,7);//[7, 5, 3]
        sayilarList.add(2,7);//[7, 5, 7, 3]
        System.out.println("arrylist : "+ sayilarList);//[7, 5, 7, 3]

    }
}
