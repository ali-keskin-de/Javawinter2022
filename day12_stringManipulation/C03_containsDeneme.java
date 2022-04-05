package day12_stringManipulation;

import java.util.Scanner;

public class C03_containsDeneme {
    public static void main(String[] args) {
        //Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz
        // ”, @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen mail adresinizi girin");
        String mail= scan.next();

      if (mail.contains("@gmail.com")){
          System.out.println("Mail adresiniz kayit edildi");
      }else{
          System.out.println("@gmail.com ile bitmiyorsa lutfen yazimi kontol edin");
      }
    }
}
