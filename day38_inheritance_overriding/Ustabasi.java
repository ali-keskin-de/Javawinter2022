package day38_inheritance_overriding;

import java.util.Scanner;

public class Ustabasi extends Isci {
    String statu="Ustabasi";
    String hak="Ustabasi haftada birgun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ücret almadan calisir.");

    }
    public void maasHesapla(){
        System.out.println("Ustabasi 30 gün * 8 saat * 12 euro = " + (30*8*12) + " Euro Maas alir");

    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz Class'tan klasik hali ile bir obje olusturur isek
         o obj. ile cagiridigimiz variable ve methodlarda java önce icinde bulundugumuz classa'a bakar,
         aradigimiz class üyesi icinde oldugumuz class'ta varsa onu alir getirir
          YOKSA?
          parent class(lar)a bakar, ilk buldugunu getirir
          ancak data türünü baska Class'lar olarak tanimlarsak önce ordaki degeri getirir variable lar icin
         */
        Ustabasi yasin= new Ustabasi();// obje yi olusturduk
        System.out.println(yasin.statu);// Ustabasi (ustabasinda classinda oldugundan ordan getirdi)
        System.out.println(yasin.hak);//Ustabasi haftada birgun ekstra tatil hakkina sahiptir (ustabasinda classinda oldugundan ordan getirdi)
        System.out.println(yasin.ikramiye);//Isciler yilda bir ikramiye alir (isci class'indan geldi)
        System.out.println(yasin.izin);//Tüm personel Yilda 4 hafta izin yapabilir ( Personel class'inda getirdi)
        yasin.maasHesapla();//
        yasin.mesai();//

        /*

        Eger isci özelliklerini görmek istersek
        Class adini (Data türü) isci seceriz; Isci ahmet =new Ustabasi();

         */

        Isci ahmet =new Ustabasi();
        System.out.println(ahmet.statu);// isci
        System.out.println(ahmet.hak);// Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);//Tüm personel Yilda 4 hafta izin yapabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        siz bir obje'yi hangi Class'tan tanimlarsaniz o Classa ait özelliklere sahip olur.
         */

        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//
        System.out.println(adem.hak);//Tüm personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);
        System.out.println(adem.izin);//Tüm personel Yilda 4 hafta izin yapabilir
        adem.maasHesapla();
        adem.mesai();


        /*
        Personal adem=new Ustabasi();// Bu ustabasi objesidir
        Personal adem=new Personel();// Bu Personel objesidir
        bu ikisi arasinda fark nedir dersek?
        kesinlikle farklidir bunu overriding ögenecegiz
         */

        /*
        Personal adem=new Ustabasi();// Data türü Personel olarak tanimlamisiz ancak adem ustabasidir

        adem'in data turu Personel'dir.
        böylece biz adem'in ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in ustabasi oldugunu biliriz cünkü constructor Ustabasi
        Ama bu yazim formati ile adem'in  tüm Personel ile birlikte sahip oldugu ortak özelliklerini vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data türü olarak secilen class ve onun parent classlarindaki variable kullanabilir


         */





    }
}
