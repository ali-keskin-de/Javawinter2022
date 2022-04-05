package day07_ifElseStatements;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 büyükse emekli olabilirsin
        // 65 kücükse emekli olmazsin yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");

        int yas= scan.nextInt();

        if(yas>65){
            System.out.println("emekli olabilirsiniz");

        } else {
            System.out.println("emekli olamazsiniz");
            System.out.println(65 - yas + " sene daha calismalisiniz");

        }





    }
}
