package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //   *
        //   * *
        //   * * *
        //   * * * *


        int input= 5;
        int input1=6;
        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <=i ; j++) {
                //nested for loop ya dikdörtgen yada ücgen formatinda olabilir
                // Dikdortgen istedigimizde iki loop icin de bagimsiz end point belirleriz
                //ucgen sekli vermek icin inner loop'un (icteki loop'-un) end point'ini olarak outer degiskene bagli yapariz
                //  bu su demek icteki loop'u sartini yukardaki degisken i yapariz, ancak icerdeki degisken bagimsiz input olursa kare olur.


                System.out.print("* ");
            }
            System.out.println("");// satiri asagi cektirmek

        }
    }
}
