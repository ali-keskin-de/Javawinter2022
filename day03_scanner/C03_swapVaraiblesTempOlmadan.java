package day03_scanner;

public class C03_swapVaraiblesTempOlmadan {
    public static void main(String[] args) {

     // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan degistiren (SWAP) bir program yapiniz

     int sayi1=10;
     int sayi2=20;

        System.out.println("Swap'tan önce sayi1 : " + sayi1 + ",sayi2 : " +sayi2 );
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("sayi1 :"+ sayi1);
        System.out.println("sayi2 : "+ sayi2);



    }
}
