package day33_Varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        Compare iki sb 'i esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastiri
        ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride oldugunu yazdirir.
        tamamen ayni ise bize sifir döndürür

         */



        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));
        //System.out.println(sb1.compareTo(str));
    }
}
