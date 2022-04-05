package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        // verilen bir Array'den istenilen elementi silip kalanlari yeni bir Array yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);
    }
    //1. adim istenmeyen elementi sayacak(kaç tane var)
    // 2. adim yeniArray olustur
    //3. adim eski array'den uygun elementleri yeniye taşi
    // 4. adim bunu yazdir.

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
        // 1-istenmeyen eleman sayisini bulalim
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==istenmeyenEleman){
                sayac++;

            }

        }
        // 2. adim yeniArray olustur
        int yeniArray[]= new int[arr.length-sayac];

        //3. adim eski array'den uygun elementleri yeniye taşi
        for (int i = 0; i < arr.length; i++) {

            int index=0;
            if (arr[i]!=istenmeyenEleman){

            }

        }




    }
}
