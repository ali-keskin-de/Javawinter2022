package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_exceptions/dosya.text";


        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k=0;
            while ((k= fis.read()) !=-1){
                System.out.print((char)k);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Exception'lar icerisinde parent  child iliskisi vardir
        Eger bir kod icinde birden fazla exception olusma ihtimali varsa
        öncelikle olasi exception'lar parent-Child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent-child iliskisi yoksa, istedigimiz gibi catch cumleleri olusturabiliriz

        Eger child- parent iliskisi varsa sadece parent exception 'i yazabiliriz veya ikisinide
        yazmak istersek child'i önce parent'i sonra yazmaliyiz

         */



        /*
        Alti kirmizi cizili her cod CTE degildir
        Java syntax hatalarini derleme esnasinda (copmpile) farkeder ve altini cizer
        biz bu güne kadar tamamina CTE diyorduk ancak exception konusuyla birlikte Compile Time Exception kavrami da hayatimiza girdi

         */
    }
}
