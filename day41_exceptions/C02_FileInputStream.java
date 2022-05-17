package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) {
        /*
        Bir kod yazilirken olasi exceptionlar öngörülüp ona göre careler üretilmelidir
        exception olustugunda Java'nin ne yapmasini istedigimizi
        belirtilmelidir

        1- eger exception olustugunda kodun calismasina devam etmesini istemiyorsak method isminin
        yanina olusuabilecek exception'i declare edebiliriz
        2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak  sorun olusabilecek kodu try catch blogununicine alir
        try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exception'i ve olasi exception durumunda ne yapilmasimi
        istedigimizi yazabiliriz
         */
        String dosyaYolu="src/day41_exceptions/dosya.text";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
