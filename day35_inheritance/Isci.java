package day35_inheritance;

public class Isci extends Personel{
    public static void main(String[] args) {
        // simdiye kadar bu sekilde obje olusturduk
        Personel objPers= new Personel();
        objPers.isim="Eren";
        objPers.SoyIsim="Terzioglu";
        objPers.adres="Amsterdam";

        Isci objIsci= new Isci();
        objIsci.isim= "Hüsyin";
        objIsci.SoyIsim="Efe";
        objIsci.adres="Ankara";


    }
}
