package day34_accesModifier_encapsilation;

public class C01 {
    private static int sayi=10;

    private static String str="Java";
     static int acikSayi=20;
     static String acikString="Hi";// acces modifier biz public veya private olarak yazmadigimizdan java Default degerini atar
    public static int halkaAcikSayi=15;
     protected C01(){

     }

    public C01(int i) {
        System.out.println("Parametreli Constructor");
    }
    private void method(){

    }
}
