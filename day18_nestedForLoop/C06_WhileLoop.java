package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi alip
        // bu sayilari ve arasindaki tüm sayilari yazdiran bir kod olusturun

        int baslangic=40;
        int bittis=60;
        for (int i = baslangic; i <=bittis ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");
        // ayni soruyu while yazdiralim
        int i=baslangic;

        while(baslangic<=bittis){
            System.out.print(baslangic + " ");
            baslangic++;

        }
    }
}
