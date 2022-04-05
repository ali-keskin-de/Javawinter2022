package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

        //int sayi="Ali Can";// syntax hatalarini java yazdigimizda görür ve altini cizer
                           // tüm projede alti cizili bir kod varsa
                          // projede hic bir class calismaz

        String str="Javada hersey zamanla oturur";

        System.out.println(str.substring(5));
        System.out.println("str.trim().length() = " + str.trim().length());


        //Not : Java’da iki tur hata mesaji aliriz
        //1- Compile Time Error (CTE) : Kodumuzu yazarken kod altinin kirmizi cizgi olmasi
        // 2- Run Time Error (RTE) : Kod calistirildiginda (Execute) karsilastigimiz hatalar

    }
}
