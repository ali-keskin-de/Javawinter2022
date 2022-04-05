package day17_forLoop;

import java.util.Scanner;

public class C08_PalindromDnm {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        // palindrom bir sayinin tersi ile ayni ise bu kelimelere palidrom denir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String input= scan.next();

        palidromKontrol(input);

    }

    private static void palidromKontrol(String input) {
        String tersInput="";

        for (int i = input.length()-1; i>=0 ; i--) {
            tersInput+=input.charAt(i);

        }
        System.out.println("girinlen kelimenin tersi = " + tersInput);
        if (tersInput.equalsIgnoreCase(input)){
            System.out.println("kelime palindromdur");
        }else {
            System.out.println("kelime palindrom degildir");
        }




    }
}
