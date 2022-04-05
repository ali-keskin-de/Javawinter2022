package day23_arrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

        // ilk inner Array'in tüm elementlerini yazdirin
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]
        System.out.println(Arrays.toString(arr[1]));//[6, 10, 2]
        // arr[0] bir Array oldugundan direkt yazdirilmaz be sebepten Array methodlarindan toString ile yazdirilir

        System.out.println(Arrays.toString(arr));//[[I@1d251891, [I@48140564]
        // disi Arrayin icerisinde ikite Array oldugundan bize referas degerlerini verir
        // MDArray'lerin tümünü yazdirmak istersek?
        // Arrays Class'indan yine yardim aliriz Arrays.deepToString(arr); method'unu kullaniriz

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]


    }
}
