package day22_arrays;

import java.util.Arrays;

public class C05_binarySearch {
    public static void main(String[] args) {
        // Verilen bir Array'de istenen elementin var olup olmadigini true/false yazdirarak 
        // gösteren bir Method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=2;
        istenenElemanVarMi(arr,istenenSayi);

        // Eger Javada binarySearch ile yapmak isterseniz
        // once sort method'u kullanip, sonra binarySearch yapmaliyiz

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (istenenSayi==arr[i]){
                sonuc=true;

            }

        }
        System.out.println(sonuc);
    }
}
