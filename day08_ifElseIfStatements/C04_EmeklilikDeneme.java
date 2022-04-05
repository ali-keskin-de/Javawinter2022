package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_EmeklilikDeneme {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz" + "\nkadin  \nerkek olarak");// \n kendisinden sonraki gelen ifadeyi
                                                                                      // bir alt satirda yazdirir.
        char cinsiyet= scan.next().toUpperCase().charAt(0);

        System.out.println("lütfen yasinizi giriniz");

        double yas= scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("lütfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println(" Emekli olmazsiniz \nDaha  " +(60-yas)+ "calismalisiniz");

            }else{
                System.out.println(" emekli olabilirsin");
            }

        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("lütfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<65){
                System.out.println(" Emekli olmazsiniz \nDaha  " +(65-yas)+ "calismalisiniz");

            }else{
                System.out.println(" emekli olabilirsin");
            }

        }else{
            System.out.println(" Lütfen Cinsiyet icin gecerli bir cinsiyet giriniz");

        }





    }
}
