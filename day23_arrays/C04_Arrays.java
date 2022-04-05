package day23_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir Array olusturacagini sorun
        // array'i olusturup elementleri kullanicidan alip array'e attayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kac elementli bir Array istediginizi yaziniz");

        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];// [0, 0, 0, 0, 0]

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin " + (i+1) +". bir elemen giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));


    }
}
