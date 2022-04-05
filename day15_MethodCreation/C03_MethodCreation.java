package day15_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa ise kelime cok kisadir yazdirin
        //eger kelime 3,4 veya 5 harfli ise harf sayisini ve kelimeyi tersten yazdiriniz
        //
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.next();
        int harfSayisi= kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisadir");

        }else if (harfSayisi==3){

            ucHarfiTesineCevir(kelime);

        }else if (harfSayisi==4){
            dortHarfiTesineCevir(kelime);

        }else if (harfSayisi==5){
            besHarfiTesineCevir(kelime);
        }else{
            System.out.println("kelime cok uzundur");

        }

    }

    private static void besHarfiTesineCevir(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);

    }

    private static void dortHarfiTesineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);
    }

    private static void ucHarfiTesineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);
    }
    // 1- Method olusturmak icin method'un adini yazariz
    // 2- Methoda giderken götürmem gereken variabel varsa, bunu method a eklemeliyim


}
