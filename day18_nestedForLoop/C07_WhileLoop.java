package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilari toplamini ekranda yazdirin

        int sayiAdedi=3;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lütfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("girilen : " + sayiAdedi + " sayilarin toplami "+ toplam);

        // while ile yapalim
        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiAdedi){
            System.out.println("Lütfen bir sayi giriniz");
            sayac++;
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("girilen : " + sayiAdedi + " sayilarin toplami "+ toplam);
    }
}
