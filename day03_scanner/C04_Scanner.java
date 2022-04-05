package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Scanner kullanmak icin üc adimi takip ediyoruz
        // 1. adim kendimize bir scanner olusturmak

        Scanner scan= new Scanner(System.in);//esitligin saginda yeni bir Scanner olusturulur
                                            // ve  olusturulan bu Scanner scan variable'na assign edilir.
                                           // scan variable'in ismidir istedigimizi verebiliriz

        // 2. adim kullancicidan istedigimiz degerri girmesi icin bir bilgi yazdirin

        System.out.println("Lütfen isminizi giriniz");
        // 3.adim kullanicinin girdigi degeri uygun bir variable olusturup kayit edin
       // String kullaniciIsim= scan.next();// sadece ilk kelimeyi alir yani ilk space kadar ( ilk bosluga kadar) alir

        String kullaniciIsim= scan.nextLine();// satir sonuna kadar girilen bütün degerleri alir

        System.out.println("Kullanicinin girdigi isim :" + kullaniciIsim);









    }
}
