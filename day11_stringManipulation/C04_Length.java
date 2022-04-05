package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {



        String isim= "Ali Can";
        System.out.println("isim.length() = " + isim.length());

        String isim1= "";
        System.out.println("isim1.length() = " + isim1.length());

       // String isim2=null;
       // System.out.println("isim2.length() = " + isim2.length()); hata verir

        // Kullanicidan ismini alip bas harfini ve son harfini buyuk harfle yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim3= scan.nextLine();

        System.out.println("ilk harf = " + isim3.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf = " + isim3.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim3.length()-1));

    }
}
