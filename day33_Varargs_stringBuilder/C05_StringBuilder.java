package day33_Varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        Compare iki Strinbuilder 'i esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastiri
        ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride oldugunu yazdirir.
        Tamamen ayni ise bize sifir döndürür

        bir StringBuilder ile bir String compare etmek isterse Java CTE verir


         */



        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));// compare karsilastirma demek

        //System.out.println(sb1.compareTo(str));

        System.out.println(sb1.equals(sb2));// false iki farkli obje equalslar karsilastirmiyor
        System.out.println(sb1.equals(sb1));// true

        // SB'da equals method'u String'deki == gibi calisir hem objeye bakar hemde referans degerlerine

        System.out.println(sb1.equals(str));// false

    }
}
