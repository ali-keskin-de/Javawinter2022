package day14_StringManipulation;

import java.util.Locale;

public class C04_isimGizleme {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B******* kart no : **** **** **** 1234

        String isim="Ali";
        String soyisim="Keskin";
        String kartNo="1234567890123456";

        String yIsim= isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\S","*");

        String ySoyisim= soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\S","*");
        String ykartNo= "**** **** **** "+ kartNo.substring(12);
        System.out.print("isim-soyisim : "+yIsim+" "+ySoyisim+ " "+ "kart no : "+ ykartNo);



    }
}
