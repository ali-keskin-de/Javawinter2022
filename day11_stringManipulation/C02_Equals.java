package day11_stringManipulation;

import java.sql.SQLOutput;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali" + " Can";

        System.out.println("str1 = " + str1);
        System.out.println("str1 = " + str2);

        System.out.println("== ile karsilastir : " + (str1==str2));
        System.out.println("equals ile karsilastir : " + str1.equals(str2));

        String str3= str1+"";
        System.out.println("== ile karsilastir : " + (str3==str2));
        System.out.println("equals ile karsilastir : " + str3.equals(str2));

        // String'de == herzaman dogru sonuc vermez
        // bunu icin emin oldugumuz equals method'unu kullanmayi tercih ederiz
        // equals method'u sadece String icin gecerlidir.

        String str5="hasan";
        String str6="Hasan";
        System.out.println(str5.equals(str6));
        System.out.println("str5.equals(str6) = " + str5.equals(str6));
        System.out.println("str5.toUpperCase().equals(str6) = " + str5.toUpperCase().equals(str6));




    }
}
