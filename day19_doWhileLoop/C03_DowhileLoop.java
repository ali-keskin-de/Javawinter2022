package day19_doWhileLoop;

public class C03_DowhileLoop {
    public static void main(String[] args) {


         // kullanicidan pozitif bir tamsayi alip
        // While Loop ile 5 ten kucuk sayilari yazdirin
        int input=3;

        int sayi=1;
        int sayac=1;
        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;

        }
        System.out.println("sayac :"+ sayac);

        // ayni soruyu do while loop ile yapin
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while(sayi<input);


    }
}
