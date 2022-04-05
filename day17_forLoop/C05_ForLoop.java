package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        int sayi=55;
        for (int i=1; i<=sayi;i++){
            if (i%3==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(" baska bie yöntem");

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 100 den kücük bir bozitif sayi giriniz");

        int sayi1= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
