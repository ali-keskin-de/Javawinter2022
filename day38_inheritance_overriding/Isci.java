package day38_inheritance_overriding;

public class Isci extends Personel{
    String statu="Isci";
    String hak="Isciler kidem tazminati alirlar";
    String ikramiye="Isciler yilda bir ikramiye alir";

    public void mesai(){
        System.out.println("Tüm isciler haftalik 40 saat calisir");

    }
    public void maasHesapla(){
        System.out.println("Tüm personek 30 gün * 8 saat * 10 euro = " + (30*8*11) + " Euro Maas alir");

    }
}
