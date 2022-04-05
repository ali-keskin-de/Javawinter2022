package day22_arrays;

import java.util.Arrays;

public class C08_SplitDnm {
    public static void main(String[] args) {
        // verilen cümlede istenilen harfin kac defa kullanildigini yazan bir method olusturun

        String cumle="Nerede o 'hello World' yazdiramayan ogrenciler?";
        String harf="e";

        istenilenHarfSayisi(cumle,harf);
    }

    private static void istenilenHarfSayisi(String cumle, String harf) {

        int sayac=0;
        String karakterler []= cumle.split("");
        System.out.println(Arrays.toString(karakterler));//

        for (int i = 0; i < karakterler.length; i++) {

            if (karakterler[i].equals(harf)){
                sayac++;
            }
        }
        System.out.println("Aradiginiz harf "+harf+" kac defa kullanilmis "+ sayac);

    }
}
