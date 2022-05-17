package day42_exceptions;

import java.util.Scanner;

public class C03_illegalArgumentException {
    public static void main(String[] args) {
        /*
        kullanicidan yasini isteyin, yas olarak kullanici negatif bir sayi, 0 veya 120'den büyük bir deger girerese
        illegalArgumentException olusacak sekilde bir program yaziniz

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas= scan.nextInt();

        // suana kadarki bilgilerimizle söyle yapardik

        if(yas<=0 || yas>120){
            //System.out.println("Lütfen gecerli bir yas giriniz");
            // java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
            // bazen biz kodun durmasini istiyorsak bunu kullaniriz
            // ---eger kodumuzun exception vermeden calismasini istiyorsak o zaman try catch kullaniyorduk
        }else{
            System.out.println("uyugun yas girdiniz tesekürler");
        }
    }
}
