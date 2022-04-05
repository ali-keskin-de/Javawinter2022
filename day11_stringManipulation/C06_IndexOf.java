package day11_stringManipulation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {
        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mail adresiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Mail adresinizi giriniz");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz mail adresi");
        }else{
            System.out.println("Mail adresiniz kabul edilmistir");

            // Ozet: Indexof method'u icerise yazilan Strin veya char'in metinde hangi indexte oldugunu bize döndürür
            // eger aradiginiz metin veya char yoksa olmadiginin delili olarak bize -1 olarak döner

        }



    }

}
