package day38_inheritance_overriding;

import java.util.Scanner;

public class Ustabasi extends Isci {
    String statu="Ustabasi";
    String hak="Ustabasi haftada birgun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ücret alir.");

    }
    public void maasHesapla(){
        System.out.println("Tüm personek 30 gün * 8 saat * 10 euro = " + (30*8*10) + " Euro Maas alir");

    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz Class'tan klasik hali ile bir obje olusturur isek
         o obj. ile cagiridigimiz variable ve methodlarda java önce icinde bulundugumuz classa'a bakar,
         aradigimiz class üyesi icinde oldugumuz class'ta varsa onu alir getirir.
          YOKSA?
          parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin= new Ustabasi();
        System.out.println(yasin.statu);// Ustabasi
        System.out.println(yasin.hak);//Ustabasi haftada birgun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);//Tüm personel Yilda 4 hafta izin yapabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*

        Eger isci özelliklerini görmek istersek
        Class adini (Data türü) isci seceriz

         */

        Isci ahmet =new Ustabasi();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.hak);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();//
        ahmet.mesai();
        /*
        siz bir obje'yi hangi Class'tan tanimlarsaniz o Classa ait özelliklere sahip olur.
         */

        Personel adem=new Ustabasi();
        System.out.println(adem.statu);
        System.out.println(adem.hak);
        //System.out.println(adem.ikramiye);
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();

        /*
        Personal adem=new Ustabasi();// Bu ustabasi objesidir
        Personal adem=new Personel();// Bu Personel objesidir
        bu ikisi arasinda fark nedir dersek?
        kesinlikle farklidir
         */

        /*
        Personal adem=new Ustabasi();

        adem'in data turu Personel'dir.
        böylece biz adem'in

         */





    }
}
