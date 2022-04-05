package day11_stringManipulation;

import java.util.Locale;

public class C01_toUpperCaseDeneme {
    public static void main(String[] args) {

        String str= "Java Güzeldir";
        System.out.println("str = " + str.toLowerCase().charAt(5));// str= g

        System.out.println("str.toUpperCase() = " + str.toUpperCase());// JAVA GÜZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));





    }
}
