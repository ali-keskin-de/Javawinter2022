package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {
        int sayi=10;
        // bu sayiyi artirmak istesek


        sayi++;
        System.out.println(sayi);//11
        sayi++;
        System.out.println("Pre-Incrementeten "+ sayi);//12
        // Eger ben iki satirda yaptigim 2 islemi tek satirda yaparsam,
        // java iki islemden önce hangisimi yapacagini bilmek ister

        System.out.println("Pre-Incrementeten satirinda "+ ++sayi);
        // bunun anlami önce artir sonra yazdir demektir yani yeni degerimiz 13 olacaktir

        System.out.println("Pre-Incrementetten sonra "+ sayi);//13

        System.out.println("post Increment satirinda :"+ sayi++);//13 önce artir sonra yazdir
        System.out.println("post Increment sonra :" + sayi);//14



        int sayi1= 8;
        int sayi2= 4;

        System.out.println(sayi1/sayi2);
     sayi2=3 ;
        System.out.println(sayi1/sayi2);// 2,66666666=>2

        sayi1=22;
        System.out.println(sayi1/sayi2);// 7,333333333=> 7
        // java iki integer sayiyi bir birine bölerse sonucu integer verir.
        // eger virgulden sonrasi kusurat varsa siler.

        sayi1=4786;
        sayi2=10;

        System.out.println(sayi1/sayi2);//478

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//47

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//4

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//0


        sayi1=4895;
        double sayi3=10;

        System.out.println(sayi1/sayi3);//489.5
                                        // iki farkli sayi data türünü isleme koydugumuzda
                                       // java kücük olan data türü icin autoWidening yapar.
                                      // bu islemi dusunursek sayi1/sayi3=>islemin sonucunu double kabul eder.

        System.out.println(sayi3/sayi1);// 0.0020429009193054137




    }
}
