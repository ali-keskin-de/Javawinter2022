package day03_scanner;

import java.util.Scanner;

public class C09_Scanner {

    //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("dikdörgenler prizmasinin kisa kenarini uzum kenarini ve yüksekliklerini giriniz");

        int kisaKenar= scan.nextInt();
        System.out.println("kisa kenar : " + kisaKenar);
        int uzunKenar= scan.nextInt();
        System.out.println("uzunkenar : " + uzunKenar);
        int yükseklik= scan.nextInt();
        System.out.println("yükseklik : " + yükseklik);

        System.out.println("prizmanin hacimi : " + (kisaKenar*uzunKenar*yükseklik));





    }
}
