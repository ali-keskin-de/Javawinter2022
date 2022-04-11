package day38_inheritance_overriding;

public class Isci extends Personel{
    String statu="Personel";
    String hak="Tüm personel esit haklara sahiptir";
    String ikramiye="Isciler yilda bir ikramiye alir";

    public void mesai(){
        System.out.println("Tüm personel 5 gun, gunde 8 saat calisir");

    }
    public void maasHesapla(){
        System.out.println("Tüm personek 30 gün * 8 saat * 10 euro = " + (30*8*10) + " Euro Maas alir");

    }
}
