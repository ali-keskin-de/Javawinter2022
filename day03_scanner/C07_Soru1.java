package day03_scanner;

import java.util.Scanner;

public class C07_Soru1 {
    public static void main(String[] args) {
        //1.Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin?

        Scanner scan= new Scanner(System.in);

        System.out.println("iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("ilk tamsayi : " + sayi1);

        int sayi2= scan.nextInt();

        System.out.println("ikinci tamsayiyi : " + sayi2);
        System.out.println("sayilarin toplami : " + (sayi1+sayi2));
        System.out.println("sayilarin carpimi : " + sayi1*sayi2);

    }
}
