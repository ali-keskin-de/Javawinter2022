package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran bir kod yazin


        char ilkHarf='c';
        char sonHarf='s';

        for (char i= ilkHarf; i<sonHarf;i++){
            System.out.print(i + " ");
        }

        System.out.println("------");
        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        // ÖNEMLI!!! String yada boolean for loop'ta kullanamaziz
       // bunlarda artis söz konusu degildir

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.println(i);

        }


    }
}
