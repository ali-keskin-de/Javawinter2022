package day36_Inheritance;

public class Memur extends Muhasebe{



    public static void main(String[] args) {

        Memur memur1= new Memur();
        //memur1 obje si memur class'inin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onunda parent'i olan Personal class'larindaki tüm datalari alabilir

        // Bunlarin hepsini Personel Classindan aldi
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125742345";

        //Muhasebe classindan
        memur1.saatÜcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";


        System.out.println(memur1);

        Memur memur2= new Memur();
        memur2.persNo=1002;
        memur2.saatÜcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);
    }


    @Override
    public String toString() {
        return "Memur{" +
                "saatÜcreti=" + saatÜcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", SoyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
