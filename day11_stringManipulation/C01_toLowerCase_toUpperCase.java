package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str= "Java Güzeldir";
        // biz String methodlarini arka arkaya kullanabiliriz
        // Mesela ikinci kelimenin ilk Harfini kücük olarak yazdiralim

        System.out.println(str.toLowerCase());// java güzeldir
        System.out.println(str.toUpperCase());// JAVA GÜZELDIR

        // str.charAt(5); sonuc artik strin degil char olacaktir
        // Dolayisi ile Strin'te yapmak istedigimiz tum degisiklikleri önce yapip
        // sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));// g

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GÜZELDİR





    }
}
