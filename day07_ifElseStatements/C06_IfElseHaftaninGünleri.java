package day07_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseHaftaninGünleri {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün girin");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("haftasonu");

        } else {
            System.out.println("hafta ici");
        }


    }
}
