package day30_passByValue;

public class C03_PassByValue {
    // eger bir method'ta yapilan degisikligi kalici olmasini istiyorsak
    // iki yöntem kullana biliriz
    // 1- variable'i class level'da static olarak olusturabiliriz

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();
        indirimYuzdesi=10;
    }

    private static void kaliciIndirimYap() {
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyati);
    }

}
