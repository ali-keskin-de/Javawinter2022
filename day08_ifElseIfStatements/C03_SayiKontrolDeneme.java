package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrolDeneme {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki sayi girin");
        int say1= scan.nextInt();
        int sayi2= scan.nextInt();
        if (say1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayida pozitiftir toplamlari= " +(say1+sayi2));

            }else if (say1<0 && sayi2<0){
                System.out.println("girdiginiz iki sayida negatiftir carpimlari = " + (say1*sayi2));
            } else if (say1*sayi2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");
        }else {
            System.out.println("sifir yutan elemandir");

        }
        }
    }
