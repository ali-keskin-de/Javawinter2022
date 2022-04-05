package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        // girilen karakterin, HARF OLUP OLMADIGINI BULALIM

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter= scan.next().charAt(0);// (0) char in index i girilen yazinin
                                             // kacinci karakterini alacagimizi gösterir 1 karekter 0. index ten baslar.

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
            System.out.println("Girdiginiz karakter harf ");
        } else {
            System.out.println("Giridiginiz karakter harf degil");


        }


    }
}
