package day23_arrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // Verilen bir Array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};
        int eklenecekElement=4;

        arr= arrayeElementEk(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));
        arr=arrayeElementEk(arr,11);// bir eleman daha böyle eklemis olduk


    }

    public static int[] arrayeElementEk(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int[arr.length+1];// yeni array [0,0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i]=arr[i];

        }
        yeniArray[yeniArray.length-1]=eklenecekElement;

        return yeniArray;

    }
}
