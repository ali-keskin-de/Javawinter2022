package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearchDnm {
    public static void main(String[] args) {
        // Eger java'da hazir Binarysearch yapmak isterseniz
        // once sort moethodunu, sonra binarysearch yapmalisiniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=3;
        System.out.println(Arrays.binarySearch(arr,istenenSayi));// bu bize varsa sayi index'ini veriri
        // yoksa (-) sayinin sirasini verir

    }
}
