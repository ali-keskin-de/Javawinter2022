package printf;

public class C01_TemelBilgiler {
    public static void main(String[] args) {
        int sayi=123;
        String str="Ahmet Bulutluoz";
        double dob=1.0205030456;

        System.out.println(sayi + "-" + str + "-" + dob + "-");

        System.out.printf("sayi : %d, str: %-30S, dou : %f", sayi,str,dob);

        // %d sayilarda kullaniliyor digitte geliyor
        //%s,%S bu Specifier bittigimi  ifadeler icin kullaniyor büyük S verilen degerin tamamini büyük yazdirir
        // s ise oldugu gibi yazilmasini saglar
        //%10s burda 10 ifadesi degeri +10 ise on karakter saga yaslar -10 ise 10 karakter sola yaslar
        //%-10.10S burdaki ikici 10 su anlama gelir ne olursa olsun benim degerimin ilk on karakterini yaz demek sonrasini ekranda yazdirmaz
        //%d sayi ile ilgili sadece acikligi ve saga veya sola yaslamayi belirlerken String teki gibi kac karakter alacagini belirleyemiyorsunuz
        //yani %-10.2d islemlini yapamiyoruz
        // Ondalikli sayilarda durum biraz daha farkli daha esnek bir yapiya sahip
        //--%.3f virgülden sonra 3 basamak olsun demek
        //--%4.3f dersem boyutunu dört yaparim virgülden sonra 3 rakami alir
        //--%07.3f dersek o zaman bosluk yerine önüne sifir koyar

    }
}
