package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {


    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.printf("lütfen isminizi giriniz...");// kullaniciya mesaj
        char ilkHarf= scan.next().charAt(0);
        // uygun data türünde bir variable charAt(1) burdaki sifir ismin ilk harfi eger ben 2. harfi istiyorsam
        // sifir yerine 1 yazarim A L I A=2 ci indeks L: 3. indeks

        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);



    }
}
