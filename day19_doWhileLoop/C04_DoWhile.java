package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhile {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayacPozitif=0;
        int sayacnegatif=0;

        do {
            System.out.println("lütfen pozitif bir tam sayi girin \n bitirmek icin 0'a basin");
            sayi= scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi giremezsiniz");
                sayacnegatif++;
            }else if (sayi>0){
                toplam+=sayi;
                sayacPozitif++;

            }
            System.out.println("yanlislikla girilen negatif sayilar sayaci :" + sayacnegatif);
            System.out.println("pozitif sayilar sayaci :" + sayacPozitif);
            System.out.println("toplam sayac :"+(sayacPozitif + sayacnegatif));

        }while(sayi!=0);
        System.out.println("girilen pozitif  sayilarin toplami : " + toplam);

    }
}
