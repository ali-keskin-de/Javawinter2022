package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2);// Java5Guzel

        // 2Guzel15

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        //53Guzel
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);

        /*
        Eger tamamen sayilari olusan bir String varsa ve biz bunu int 'a cevirmek ister isek
         Integer.valueOf(str)


         bir sayiyi String'e cevirmek isterseniz
         ""+sayi

         */

      String isim= String.valueOf("Ali" == "ali");
        System.out.println(isim);



    }
}
