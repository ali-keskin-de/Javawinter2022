package day22_arrays;

import java.util.Arrays;

public class C05_binarySearchDnm {
    public static void main(String[] args) {
        // Verilen bir Array'de istenen elementin var olup olmadigini true/false yazdirarak
        // gösteren bir Method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=2;
        istenilenElementAra(arr,istenenSayi);

    }

    private static void istenilenElementAra(int[] arr, int istenenSayi) {
       boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;
            }
        }
        System.out.println( sonuc);


    }
}
