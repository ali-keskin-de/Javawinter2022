package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoopDnm {
    public static void main(String[] args) {
        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilari toplamini ekranda yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen girmek istediginiz sayi adetini giriniz");
        int sayiAdeti= scan.nextInt();
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdeti ; i++) {
            System.out.println("lütfen sayilari giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayi adeti : "+sayiAdeti+ " toplam : "+toplam);

        // while yapalim
        sayi=0;
        toplam=0;
     int sayac=1;
     while (sayac<=sayiAdeti){
         System.out.println("lütfen sayilari giriniz");
         sayac++;
         sayi= scan.nextInt();
         toplam+=sayi;

     }
        System.out.println("girilen sayi adeti : "+sayiAdeti+ " toplam : "+toplam);

    }


}
