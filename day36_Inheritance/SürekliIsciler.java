package day36_Inheritance;

public class SürekliIsciler extends Isci{


    public static void main(String[] args) {
        SürekliIsciler surIsc1=new SürekliIsciler();

        surIsc1.persNo=5001;
        surIsc1.isim="Cem";
        surIsc1.soyIsim="Akay";
        surIsc1.statu="isci";
        surIsc1.saatÜcreti=10;
        surIsc1.maas=surIsc1.maasHesapla();

        System.out.println(surIsc1);



    }// toString bize otomatik olarak obje yi bize yazdirir.
    @Override
    public String toString() {
        return "SürekliIsciler{" +
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
