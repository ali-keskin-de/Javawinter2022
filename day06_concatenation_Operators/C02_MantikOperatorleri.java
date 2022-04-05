package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);// false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);// true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);
        boolean sonuc3= 5>4 & 7<9 & 6+3==9 & 5+2!=8;// true
        System.out.println(sonuc3);
        // iki && yazdirinca da & tek yadirsamda sonuc ayni
        // arasindaki fark

        int sayi3= 15;
        // sayi3 ün 10 ile 20 araliginda true diyerek döndürelim
        // java 3 lü karsilastirma kabul etmez
        // System.out.println(10<sayi3<20=);
        System.out.println(10<sayi3 && sayi3<20);// true

        int sayi4=5;
        // sayi4 10 ile 20 arasinda olmadigini gösterin

        System.out.println(sayi4<10 || sayi4>20);//true


    }
}
