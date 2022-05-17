package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip, bölerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=2){
            System.out.println("Bölmek istediginiz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("kaca bölmek istediginiz sayiyi yaziniz");
            int sayi2 = scan.nextInt();
            try {
                System.out.println(" sonuc= " + sayi1 / sayi2);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Giridiginiz sayilarda sorun var");
            }

            System.out.println("devam etmek icin 1 \nbitirrmek icin 2'ye basin");
            kontrol=scan.nextInt();

        }

        /*
        sayi2 0 oldugundan sayi1/0 tanimsiz oldugundan
        java bu durumda exception verir
        javanin yazdigi mesajda exception ne tur bir sorun oldugu neyden kaynaklandigini
        ve hangi satirda olustugunu yazar

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.C03_Exceptions.main(C03_Exceptions.java:17)

	bunu cözmek icin sayi ikiyi if ile kontrol edebiliriz


        if (sayi2 == 0) {
            System.out.println("sayi/0 tanimsizdir");
        } else {

            System.out.println(" sonuc= " + sayi1 / sayi2);

        }

        ama bu yöntem her sorunda calismaz
         */
    }
}
