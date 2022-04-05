package day12_stringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        //soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email= "mülkiyeayboy@hotmail.com";
        String arananMetin="@gmail.com";
        // bir boolean ifadeyi tersine cevirmek istiyorsaniz basina ! koyarsiniz
        // email.contains(arananMetin) arananMetin degerini iceriyor mu demek,
        // !email.contains(arananMetin) icermiyor mu
        // anlamina gelir

        if (!email.contains(arananMetin)){
            System.out.println("");

        }
    }
}
