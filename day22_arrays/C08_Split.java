package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen cümlede istenilen harfin kac defa kullanildigini yazan bir method olusturun

        String cumle="Nerede o 'hello World' yazdiramayan ogrenciler?";
        String harf="a";
        harfKacDefaKullanilmis(cumle,harf);


    }

    private static void harfKacDefaKullanilmis(String cumle, String harf) {
        int sayac=0;
        
        String karakterler[]=cumle.split("");
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;

            }

        }
        System.out.println("Aradiginiz harf "+harf+" kac defa kullanilmis "+sayac);


    }
}
