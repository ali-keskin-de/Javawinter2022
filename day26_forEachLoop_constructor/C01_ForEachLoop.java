package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        // elementleri for Loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println("");

        // bunu for-Each loop ile yapacak olursak
        // for -Each Loop'u calistirmak hedef bir collection vermeliyiz

        for (int each: arr) {
            System.out.println(each + " ");
        }

         // for each;
        // Avantaji ; index, baslangic degeri, bitis degeri gibi dataylarla ugrasmamiza gerek kalmadan colections'dan
        // tum elementleri bize getirir
        // dezavantaji: index'e bagli islemleri yapamayiz

    }
}
