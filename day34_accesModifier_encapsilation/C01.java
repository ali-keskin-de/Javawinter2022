package day34_accesModifier_encapsilation;

public class C01 {
    private static int sayi=10;

    private static String str="Java";
     static int acikSayi=20;
     static String acikString="Hi";// acces modifier biz public veya private olarak yazmadigimizdan
                                  // Default access modifier olur
    public static int halkaAcikSayi=15;
    protected static int aileyeÖzel=40;

     protected C01(){

         // Bu constructor access modifier'i default access Modifier'dir
         // dolayisi ile icinde oldugu package'in disinda bu class'tan obje olusturulamaz

     }

    private C01(int i) {
        System.out.println("Parametreli Constructor");
    }



    private void method1(){

    }


}
