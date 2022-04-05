package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {


        // Eger java'da hazir Binarysearch yapmak isterseniz
        // once sort moethodunu, sonra binarysearch yapmalisiniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=2;

        Arrays.sort(arr);//
        System.out.println(Arrays.toString(arr));//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        Arrays.binarySearch(arr,istenenSayi);// binarySearch bize istenen sayinin indexini döndürüyor varsa
                                            // Eger olmayan bir elementi aratirsak, java göstermek icin eksi isareti koyar
                                           // bize elementi olmasi olmasi gereken sira numarasini verir
                                          // 2'yi aratirsak bize -3 verir

        System.out.println(Arrays.binarySearch(arr,istenenSayi));

        System.out.println(Arrays.binarySearch(arr,4));// 3 bize index veriyor
        System.out.println(Arrays.binarySearch(arr,0));//0 bize index veriyor
        System.out.println(Arrays.binarySearch(arr,2));//-3 bize sira numarasini vercek index degil cünkü elemanimiz Arrayde yok
        // olanlarda index döner olmayanlarda -(sira numarasi) döner, - anlami bunu array'de olmadigini bize söyler.

        // eger bir egerey icinde bir elemani arar isek bu yöntemi kullaniriz,
        // bize varsa yukardaki gibi elemanin index'ni verir


    }
}
