package day11_stringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str1="Java bir baska güzel";
        // istersek bize char olarak verdigimiz bir harfin index'ni bize döndürür
        System.out.println(str1.indexOf("J"));//0

        // istersek bir harf yada metin olarak verdigimiz String'in indexini döndürür.

        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10


        // ayni harften birden fazla varsa?

        System.out.println(str1.indexOf("b"));// 5 buldugu ilk dogru index'i dondurur.

        System.out.println(str1.indexOf('b', 5));
        // bu method'da java aramaya fromIndex olarak yazdigimiz index'ten baslar
        // inclusive

        //verilen String'deki 2.a harfinin index'ni bulalim
        //bunu icin ilk a Harfini bulup ondan sonrasini aratmam gerek, bunun icin;

        int ilkIndex= str1.indexOf('a');
        System.out.println(str1.indexOf('a', ilkIndex+1));//3
        int ilkIndexB= str1.indexOf('b');
        System.out.println(str1.indexOf('b',ilkIndexB+1));//9

        // bir metinde aratabiliriz










    }
}
