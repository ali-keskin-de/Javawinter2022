package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+ 10);//30
        // burda satirda sayiyi 10 artirmadim sayinin 10 fazlasini yazdirdim

        System.out.println(sayi);//20
        // eger atama yapmazsak sayida yaptigimiz artirma azaltma kalici olmaz

        sayi=sayi+10;

        System.out.println(sayi=sayi+=10);//40
        System.out.println(sayi);
        System.out.println(sayi+=10);//50
        // bir variable' in degerini kalici olarak artirmak oda azaltmak ister iseniz assignment sart
        // normal atama ile sout icinde ki atama arasinda fark yoktur

        System.out.println("23.satir  :" + sayi++);//50
        System.out.println("24. satir :"+ sayi);//51

        System.out.println("26.satir : " + ++sayi);//50
        System.out.println("27.satir : " + sayi);//51


    }
}
