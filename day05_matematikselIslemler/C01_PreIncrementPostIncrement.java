package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi=10;
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi);//12

        System.out.println("pre-increment satirinda " +  ++sayi);
        System.out.println("pre-increment sonra "  +sayi);


        System.out.println("post- incrementden satirinda " + sayi++);
        System.out.println("post- incrementden satirinda sonra " + sayi  );



    }
}
