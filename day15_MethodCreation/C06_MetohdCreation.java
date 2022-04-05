package day15_MethodCreation;

public class C06_MetohdCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // iki variablen degerlerini toplayan bir method olusturalim
        // 1. Adim: method adin yazalim
        // 2.Adim: method'a göndermem gereken argument var mi

        ikiSayitopla(50,70);


    }
    // bir methodu olusturmak calismasi icin yeterli degildir
    // method cagirilirsa calisir
    // ayni Class icinde olmasinin hic bir önemi yoktur
    // Java main method'da yukardan asagiya dogru calistirir
    // ve geldigi satiri calistiri.


    public static void ikiSayitopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami = "+ (a+b));
    }


}
