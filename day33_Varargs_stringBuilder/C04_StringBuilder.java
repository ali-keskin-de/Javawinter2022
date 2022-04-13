package day33_Varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java"));//8

        System.out.println(sb1.lastIndexOf("s"));//4
        System.out.println(sb1.indexOf("s"));//2

        System.out.println(sb1.replace(0,7,"Ne güzel"));//Ne güzel Java

        System.out.println(sb1);//Ne güzel Java atama yapmadan replace uyguladigimizda yaptigimiz degisikli mutable oldugundan kalici oluyor

        System.out.println(sb1.toString().toUpperCase());//NE GÜZEL JAVA

        System.out.println(sb1);//Ne güzel Java
        /*
        toString methodu ile Strinbuilder biz stringe cevirdik Stringlerde Immutable oldukalarinda
        toUpperCase methodundan sonra atama yapmadigimizdan degisklik kalici degildir
         */


        System.out.println(sb1.delete(0,3));//güzel Java

        System.out.println(sb1.deleteCharAt(5));//güzelJava




    }
}
