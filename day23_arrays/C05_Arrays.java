package day23_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // Verilen bir Array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};
        //arr[3]=8; array'in boyuttun disinda bir index'e atama yapamayiz
        //arr={1,3,5} var olan Array'e ayni boyutta bile olsa direk yeni yeni degerler iceren bir Array atayamayiz

        arr= new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[]= new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]

        // bir Array'e icinde hazir elementlerin oldugu yeni bir Array atamak isterseniz
        // bunu {1,2,3} seklinde degil
        // new int[3] diyerek olusuturup sonra deger atayarak tamamladigimiy array'i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5,};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]

    }
}
