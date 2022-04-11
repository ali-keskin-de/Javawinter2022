package day30_passByValue;

public class C05_PassByValue {
    // kalici indirim icin ikinci yöntem

    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYüzdesi=10;
        etiketFiyati=kaliciIndirimYap(etiketFiyati,indirimYüzdesi);
        System.out.println("iki indirimden sonra main method'da etiket fiyati : " + etiketFiyati);

    }
    

    public static double kaliciIndirimYap(double etiketFiyati, double indirimYuzdesi) {
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyati);
        return etiketFiyati;
    }


}

