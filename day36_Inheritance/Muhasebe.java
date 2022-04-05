package day36_Inheritance;

public class Muhasebe extends Personel{


    protected int saatÜcreti;
    protected String statu;
    protected String maas;

    protected int maasHesapla(){
        int maas=saatÜcreti*8*30;
        return maas;
    }

}
