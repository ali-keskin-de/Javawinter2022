package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input=30;// kullanicidan aldigimiz sayi

        // for loop ile de yapabiliriz ama biz
        // while loop ile yapalim

        int bölen=1;
        int sayac=0;

        while(bölen<=input){
            if (input%bölen==0){
                System.out.print(bölen + " ");
                sayac++;

            }
            bölen++;

        }
        System.out.println("");
        System.out.println(input + " sayisini bölen " + sayac +" adet sayi vardir" );


    }
}
