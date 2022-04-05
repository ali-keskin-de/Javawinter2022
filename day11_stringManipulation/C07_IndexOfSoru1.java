package day11_stringManipulation;

import java.util.Scanner;

public class C07_IndexOfSoru1 {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf yada bir metin giriniz");
        String cümle= scan.nextLine();
        System.out.println(cümle.indexOf("a"));




    }
}
