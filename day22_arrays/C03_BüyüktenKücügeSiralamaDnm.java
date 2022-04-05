package day22_arrays;

import java.util.Arrays;

public class C03_BüyüktenKücügeSiralamaDnm {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        büyüktenKücügeSirala(arr);


    }

    private static void büyüktenKücügeSirala(int[] arr) {

        Arrays.sort(arr);
        int büyüktenKücüge []= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            büyüktenKücüge[i]=arr[arr.length-1-i];// arr.length-1 sonuncu elemanin indexi i=0 iken yani ilk elemani büyüktenKücüge Array'nin
        }
        System.out.println("büyükten kücüge : " + Arrays.toString(büyüktenKücüge));

    }
}
