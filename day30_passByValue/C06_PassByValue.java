package day30_passByValue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        /*
        non-primitive data türlerinde objenin kendisi degilde icindeki elementler degisirse
        java objenin referansi ve objenin kendisini degistirmedigi icin element degisikliklerini kabul eder
        ve kalici yapar
         */

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr));//[5, 6, 3] kalici olduguu burda görüyoruz
        /*
        bu burda array in kendisini degistirmedik ancak icindeki elemanlari degistirdik,
        yani referans degismedi obje nin kendiside degismedi


         */


    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
