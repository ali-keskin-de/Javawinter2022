package day17_forLoop;

import java.util.Scanner;

public class C09_ForLoopSoru10 {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir program yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayilarinToplami=0;
        if (sayi1<sayi2){
            for (int i = sayi1+1; i <sayi2 ; i++) {
                sayilarinToplami+=i;
            }
            System.out.println("sayilarinToplami = " + sayilarinToplami);

        }else if(sayi2<sayi1){
            for (int i = sayi2+1; i <sayi1 ; i++) {
                sayilarinToplami+=i;

            }
            System.out.println("sayilarinToplami = " + sayilarinToplami);
        }else{
            System.out.println("sayilar bir birine esit oldugundan toplam sifir");
        }

    }

}
