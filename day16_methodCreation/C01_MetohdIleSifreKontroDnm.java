package day16_methodCreation;

import javax.swing.*;

public class C01_MetohdIleSifreKontroDnm {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //	- Ilk harf buyuk harf olmali
        //	- Son harf kucuk harf olmali
        //	- Sifre bosluk icermemeli
        //	- Sifre uzunlugu en az 8 karakter olmali
        //  bu 4 kontrolu method ile yapin

        String sifre="A213db2n";
        boolean ilkHarf= ilkHarfKontrolEt(sifre);
        boolean sonHarf= sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzulukKontrol= uzulukKontrolEt(sifre);

        if (ilkHarf && sonHarf && boslukKontrol && uzulukKontrol){
            System.out.println("sifreniz basari ile kayit edilmistir");
        }else{
            System.out.println("islem basarisiz lütfen sifrenizi kontrol ediniz");
        }


    }

    private static boolean uzulukKontrolEt(String sifre) {
        boolean uzulukKontrolSonucu=false;
        if (sifre.length()>=8){
            uzulukKontrolSonucu=true;
        }else {
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }
        return uzulukKontrolSonucu;
    }


    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc= false;

        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else {
            System.out.println("Sifre bosluk icermemeli");
        }

        return boslukKontrolSonuc;
    }


    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfSonuc=false;

        if (sonHarf>='a' && sonHarf<='z'){

            sonHarfSonuc=true;

        }else{
            System.out.println("Sifreniz ilk Harf büyük olmali");
            //ilkHarfSonuc=false;

        }

        return sonHarfSonuc;

    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);

        boolean ilkHarfSonuc=false;//ilkHarfSonuc=true; yaparsam
                                  // ilk asagiya else 'ten sonra ilkHarfSonuc=false; yazdirmaliydim


        if (ilkHarf>='A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;

        }else{
            System.out.println("Sifreniz ilk Harf büyük olmali");
            //ilkHarfSonuc=false;

        }

        return ilkHarfSonuc;
    }
}
