package day22_arrays;
import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arr);

        
    }
    // eger olusturdugumuz method'tan bir sey döndürmeyeceksek asagidaki gibi void kalabilir
    // ancak bir sey döndürmek istiyorsak döndürmek istedigimiz veri türüne göre voidi degistirmeliyiz

    // eger methodumuzu public yaparsak baska Classlardada kullanabiliriz bu method'u


    public static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {

            tersArr[i]= arr[arr.length-1-i] ;
        }

        System.out.println(Arrays.toString(tersArr));



    }
}

