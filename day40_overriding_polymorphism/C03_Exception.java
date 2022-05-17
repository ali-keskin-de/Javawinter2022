package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz kullanici bitirmek istediginde Q basmalidir
        // toplam 500'ü gecerse bitirsin veya
        // kullanici bitirmek isterse Q basip bitirsin

        Scanner scan = new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("Lütfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q'ya basiniz");
            int sayi= 0;
            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {
                String hataliGiris= scan.next();
                if(hataliGiris.equals("q")){
                    System.out.println("Girdiginiz sayilarin toplami : " + toplam);
                    break;
                }else{
                    System.out.println("hatali giris");
                }

            }
            toplam+=sayi;

        }while (toplam<500);

    }

}
