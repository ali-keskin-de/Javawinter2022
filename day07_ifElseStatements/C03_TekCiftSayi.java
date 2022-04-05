package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {

    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen bir tam sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("girilen sayi cift");

        }
        if (sayi%2 !=0){
            System.out.println(" Sayi tektir");

        }

        if (sayi%2==0){
            System.out.println(" girilen sayi ciftir");

        } else {
            System.out.println("girilen sayi tektir");
        }

        // normalde bir sayi tektir yada ciftir
        // o zaman tek olmasi ve cift olmasi iki ayri if le degil
        // if else ile tek statement 'da yapmak daha güzel
        //=====if else ile cözum

        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tektir");

        }

    }
}
