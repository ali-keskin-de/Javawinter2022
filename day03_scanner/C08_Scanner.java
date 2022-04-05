package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
        //hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("karenin bir kenarinin uzunlugunu girin");

        int kenarUzunlugu= scan.nextInt();

        System.out.println("karenin cevresi : " + (4*kenarUzunlugu));
        System.out.println("karenin alani : " + (kenarUzunlugu*kenarUzunlugu));

    }
}
