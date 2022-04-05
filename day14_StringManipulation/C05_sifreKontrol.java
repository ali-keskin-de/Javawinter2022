package day14_StringManipulation;

import java.util.Scanner;

public class C05_sifreKontrol {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen sifrenizi girin : ");
        String sifre= scan.next();

        boolean ilkHarf= false;

        if (sifre.charAt(0)>='A' && 'Z'>=sifre.charAt(0)){
            ilkHarf=true;
        }else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

        boolean sonHarf= false;

        if (sifre.charAt(sifre.length()-1)>='a' && 'z'>=sifre.charAt(sifre.length()-1)){
            sonHarf=true;
        }else {
            System.out.println("son harf kücük harf olmali");
        }

        boolean bosluk= false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("Sifre bosluk icermemeli");
        }

        boolean uzunluk=true;

        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }


    }
}
