package day36_Inheritance;

public class Muhasebe extends Personel{


    protected int saatÜcreti;
    protected String statu;
    protected int maas=8;

    protected int maasHesapla(){
        int maas=saatÜcreti*8*30;
        return maas;
    }

}
