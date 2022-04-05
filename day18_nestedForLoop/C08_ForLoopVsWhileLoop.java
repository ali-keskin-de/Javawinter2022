package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0 'ra basincaya mkadar devam edin
        // kullanici sifira bastiginda giridigi tüm sayilarin toplamini yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        /*
        for (int i = 1; i <1000 ; i++) {
            System.out.println("lütfen sayilari giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            if (sayi==0){
                break;
            }else{
                toplam+=sayi;
            }

        }

         */
        System.out.println(toplam);


         sayi=1;
         toplam=0;
         while(sayi!=0){
             System.out.println("lütfen sayilari giriniz");
             sayi= scan.nextInt();
             toplam+=sayi;

         }
         // baslangic ve bitis degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi beli olmayan durumlu while loop daha avantajlidir

        System.out.println(toplam);
    }
}
