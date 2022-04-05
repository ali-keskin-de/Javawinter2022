package day22_arrays;

import java.util.Arrays;

public class C02_SortDnm {
    public static void main(String[] args) {
        //Verilen array´de en kücük ve en büyük degerleri yazdirin.

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9};

        int enKücükSayi= Integer.MAX_VALUE;
        int enBüyükSayi= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<enKücükSayi){
                enKücükSayi=arr[i];
            }
            if (enBüyükSayi<arr[i]){
                enBüyükSayi=arr[i];
            }

        }
        System.out.println("En kücüksayi : " + enKücükSayi);
        System.out.println("En büyüksayi : " + enBüyükSayi);

        // bu simdide sort methoduyla yapalim

        Arrays.sort(arr);
        System.out.println("En kücüksayi : " +arr[0]);
        System.out.println("En büyüksayi : " + arr[arr.length-1]);

        System.out.println(arr[3]);//5
    }
}
