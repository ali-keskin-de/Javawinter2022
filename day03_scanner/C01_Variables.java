package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        //1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String okulIsmi="Yildiz koleji";
        System.out.println(okulIsmi); // yildiz koleji

        char ilkHarf;
        ilkHarf= 'H';

        System.out.println(ilkHarf);

        int sayi1=10,sayi2=20;

        System.out.println(sayi1+sayi2);//30






        //2- isim ve soyisim icin iki variable olusturun ve bunlari isminiz : Mehmet

        String isim= "Ali";
        String soyIsim= "keskin";

        System.out.println("isim     : " + isim);
        System.out.println("soyismin :" + soyIsim);



        //soyisminiz : Bulutluoz seklinde yazdirin
        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println("ikisayinin toplami : " + (sayi3+sayi4));

        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        int sayi5= 20;
        char harf='a';

        System.out.println(sayi5+harf);//117
         //char data türündeki degiskenleri matematikselislemlerde kullanilirsa o char degerinin ASCII degeri alinir

        int sayi6='a';
        System.out.println(sayi6);


        //5 – char data turunde bir variable olusturun ve yazdirin
        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
    }
}
