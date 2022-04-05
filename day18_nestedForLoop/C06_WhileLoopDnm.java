package day18_nestedForLoop;

import org.w3c.dom.ls.LSOutput;

public class C06_WhileLoopDnm {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alip
        // bu sayilari ve arasindaki tüm sayilari yazdiran bir kod olusturun

        System.out.println("while loop");
        int baslangic=50;//startingValue

        int bitis=60;//endingCondition


        while (baslangic<=bitis){
            System.out.print(baslangic+ " ");
            baslangic++;
        }
        System.out.println("");

        //// ayni soruyu for loop yazdiralim
        System.out.println("for loop");

        for (int  i = 50; i <=bitis ; i++) {
            System.out.print(i +" ");
        }

    }

}
