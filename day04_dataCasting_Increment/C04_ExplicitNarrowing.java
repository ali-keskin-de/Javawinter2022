package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3= sayi1/sayi2; // 87.9

        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2); // sag deger 87.9 verir ve buda integer degil double dir.
        // deger double, variable int
        // yani variable daha dar dolayisi ile java bunu otomatik olarak yapmaz
        // sorumlulugu üstlenmeniyi ister
        // sag tarafa yazdigimiz (int) sorumluluk bende demektir
        // int sayi4=  sayi1/ (int) sayi2); bu sekli ilede kod calisir cunku sayi1 zaten int oldugundan
        // casting rol yaptirmak cevirmek

        System.out.println(sayi4);//87 olmasinin sebebi parantez icinde yazdigim int dir
                                  // yani Casting yapti yani rol yapti

        int sayi5= 140;
        byte sayi6= (byte)sayi5;// kabul etmiyor sag taraftaki deger int büyüktür soltaraftaki variable byte
                                //(byte) yazdigimda sorumlulugu alirsiniz ve java calisir

        sayi5=130;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);//-126

    }
}
