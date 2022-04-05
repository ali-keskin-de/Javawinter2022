package day17_forLoop;

import java.util.Scanner;

public class C10_ForLoopSoru11 {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question
        // Kullanicidan 10’dan kucuk bir tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 10'da kücük ir sayi giriniz");
        int num1= scan.nextInt();
        faktoryel(num1);



    }

    private static void faktoryel(int num) {
        int faktoryel=1;

        for (int i = 1; i <=num ; i++) {
            faktoryel*=i;

        }
        System.out.println("faktoryel :" + faktoryel);

    }
}
