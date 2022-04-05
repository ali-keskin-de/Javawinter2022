package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        // pazarve cumartesi ise ===> hafta sonu
        // pazertesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici
        // String Key sensitive' dir
        // yani pazar, pAzar,Pazar, PAZAR bunlarin hepsi fakli kelimedir String icin

        // bu durumda String methodlarindan yardim aliriz

       // String ifadelerde == kullannilmasi tavsiye edilmez cünkü beklenmedik sonuclar verebilir
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen gün ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase();// kullanici nasil yazarsa yazsin biz kücük harf görürüz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("haftasonu");

        }
        if (gunIsmi.equals("pazertesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("giridiginiz gun hafta ici ");

        }



    }
}
