package day22_arrays;
import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        //Verilen array´de en kücük ve en büyük degerleri yazdirin.

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9};


        //sort methodu olmadan
        // basta bir deger atayiyoruz bunu iki sekilde yapabiliriz ya array'in her hangi bir elemanini atar for loop'la yapariz
        // yada 2. yöntem olarak enkücük deger icin Integer. MAX_VALUE ve en büyük deger icinde Integer.MIN_VALUE degerlerini atariz.

        int enKücükSayi = Integer.MAX_VALUE;//arr[0] da yazilabilir cünkü döngü icinde bu deger degisecektir.
        int enBüyükSayi = Integer.MIN_VALUE;//arr[0] da yazilabilir cünkü döngü icinde bu deger degisecektir.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < enKücükSayi) {
                enKücükSayi = arr[i];
            }
            if (arr[i] > enBüyükSayi) {
                enBüyükSayi = arr[i];
            }
        }
        System.out.println("En büyük eleman : " + enBüyükSayi);
        System.out.println("En kücük eleman : " + enKücükSayi);

        // sort'la gördügünüz gibi tek satirda bunu yapabiliriz

        Arrays.sort(arr);
        System.out.println("En büyük eleman : " + arr[arr.length - 1]);
        System.out.println("En kücük eleman : " + arr[0]);

    }

}