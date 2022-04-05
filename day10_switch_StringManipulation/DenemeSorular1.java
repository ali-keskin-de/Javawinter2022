package day10_switch_StringManipulation;

import java.util.Scanner;

public class DenemeSorular1 {
    public static void main(String[] args) {
        //Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("haftanin kacinci günü");
        int haftaninGunu= scan.nextInt();

        switch(haftaninGunu){
            case 1:
                System.out.println("Montag");
                break;
             case 2:
                System.out.println("Dienstag");
                break;
             case 3:
                System.out.println("Mittwoch");
                break;
             case 4:
                System.out.println("Donnerstag");
                break;
             case 5:
                System.out.println("Freitag");
                break;
             case 6:
                System.out.println("Samstag");
                break;
             case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Bitte schreiben Sie richtige Tageszahl");
        }

    }
}
