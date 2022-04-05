package day17_forLoop;

import java.util.Scanner;

public class C07_ForLoopDnm {
    public static void main(String[] args) {
        // soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
        //         1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //        - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        //        - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
        //        - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.print(" lütfen 100'den kücük bir sayi giriniz :");
        int bittis = scan.nextInt();
        int baslangic=1;

        for (int i = baslangic; i <bittis ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("java güzeldir");
            }else if (i%3==0){
                System.out.print("java");

            }else if (i%5==0){
                System.out.print("güzeldir");
            }

        }
        // java yukardan asagi calistigindan
        // ve bagimli if'lerde bir kod calisinca digerlerine bakmadigindan
        // en dar sarttan baslanip en genis sartta gidilir.


    }
}
