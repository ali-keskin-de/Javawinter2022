package day36_Inheritance;

public class Ustabasi extends Isci{
    public static void main(String[] args) {
        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.saatÜcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyIsim="Gökcek";
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="isci";
        ustabasi1.isciStatu="Ustabasi";

        System.out.println(ustabasi1);

    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatÜcreti=" + saatÜcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
