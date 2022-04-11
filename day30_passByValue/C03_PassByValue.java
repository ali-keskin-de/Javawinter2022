package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Java Pass By Value bir Program dilidir
        yani: bir primitive variable'i argument olarak bir method'a yollarsaniz
        java o variable degil degerini method'da yollar bunada ingilizcede Pass denir.
         */

        double etiketFiyati=100;
        yüzdeOnIndirimYapan(etiketFiyati);
        yüzdeOnIndirimYapan(etiketFiyati);
        System.out.println("iki indirimden sonra main method'da etiket fiyati : " + etiketFiyati);
    }

    private static void yüzdeOnIndirimYapan(double etiketFiyati) {
        etiketFiyati=etiketFiyati* 0.90;
        System.out.println("Sizin icin %10 indirimli fiyatimiz " + etiketFiyati);
        /*
        burdaki etiketFiyati variable ile uykardaki etiketFiyati ile ilgisi yok burdaki bambaska bir variable,
         peki neden budada etiket fiyati diyoruz sadece kodun takibi kolay olmasi icin.
         Biz buna Pass by value diyoruz
         yani java method olustururken variable'in kendisini degil Value'sunu (deger) methoda gönderirir
         böylelikle main method'taki deger degismez.


         Eger main method'taki ile ayni olmasini istiyorsak Class levelda olusturulmali
          Eger Class levelda bir variable olusturursak bu variable tüm methodlarda kullanabilirsiniz


         */
    }
}
