package day43_garbage_abstracttClass;

public class C01_Final {

    final static double piSayisi=3.14;
    final static String okulIsmi="Yildiz Koleji";

    public static void main(String[] args) {
        final int sayi=10;

       // sayi=20;// final olan bir final sayi variable'na deger atayamazsiniz degistiremezsiniz
    }
    public static final void method1(){
        /*
        override parnet class'taki method'u child classs'a uyarlamak demektir
        yani islemin degistirilmesini istiyoruz
        ancak parent class'daki method final olarak tanimla...
         */
        System.out.println("Parent Class Final method1");

    }

}
