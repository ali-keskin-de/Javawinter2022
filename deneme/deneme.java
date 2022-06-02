package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        String s="Hello";

        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

        if(t==s)System.out.println("two");

        if(t.equals(s)) System.out.println("three");

        if("Hello"==s)System.out.println("four");

        if("Hello"==t)System.out.println("five");


        String str= "Ahmet yeni araba alid, araba BMW";
        String []arr=str.split(", ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println(arr[0]);

        String str1="Ali Can Java";
        String arr1[]=str1.split(" ");
        List<String> list1=new ArrayList<>();
        for (int i = 0; i < arr1.length-1; i++) {
            list1.add(arr1[i]);

        }
        System.out.println(list1);

        HashMap<Integer,String> objeMap= new HashMap<>();

        objeMap.put(1,"Ahmet, 10C, Mat");
        System.out.println(objeMap);






    }
}
