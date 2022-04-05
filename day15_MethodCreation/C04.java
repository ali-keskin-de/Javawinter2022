package day15_MethodCreation;

public class C04 {
     //main metohd olmadan bir Class olusturulabilir
    //Ancak bu Class direkt calismaz
    //sadece depo görevi görür
    //baska Classlarda kullanilbilecek variable ve methodlari barindirir
    //

    public static void besHarfiTesineCevir(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);

    }

    public static void dortHarfiTesineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);
    }

    public static void ucHarfiTesineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin harf sayisi :"+ kelime.length());
        System.out.println("kelimenin tersi :" + tersKelime);
    }
    // 1- Method olusturmak icin method'un adini yazariz
    // 2- Methoda giderken götürmem gereken variabel varsa, bunu method a eklemeliyim


}
