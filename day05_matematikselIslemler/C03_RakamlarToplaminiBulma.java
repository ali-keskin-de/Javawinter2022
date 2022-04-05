package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // kullanican aldiginiz 4 basamakli bir sayinin basamaklardaki rakamlar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplam=0;

        // 1. adim r=0 rt=0 sayi=7532

        rakam=sayi%10;//2
        rakamlarToplam +=rakam;//2
        sayi/=10;//753
        // 2. adim r=2 sayi 753

        rakam=sayi%10;// 3
        rakamlarToplam +=rakam;//5
        sayi/=10;//75
        //3. adim r=3 rt=5 sayi=75

        rakam=sayi%10;// 5
        rakamlarToplam +=rakam;//10
        sayi/=10;//7

        rakam=sayi%10;// 7
        rakamlarToplam +=rakam;//17
        sayi/=10;//0

        System.out.println(" rakamlar toplami :" + rakamlarToplam);





    }
}
