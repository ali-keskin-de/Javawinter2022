package day45_interfaces;

public interface I01_Default_Static {
    /*

    interfac'lerde sadece abstract'lar bulunur

    body'si olan concrete bir method olusturmak istediginizde Java CTE verir

    Ancak Java8 ve uzeri versiyonlarda, istisnai olarak
    static veya default olarak tanimlanan body'si olabilir

    ancak burada kullanilan default access modifier degildir
    cunku Interface'lerde tum method'lar public ve abstract'ti

    asagidaki örnektede görebileceginiz gibidefault olarak tanimlanmis bir method'a access modifier olarak public yazabiliriz
    (access modifier yazmasak da java method'u public olarak kabuledecektir


     */

    void method1();

   public default void method2(){
       System.out.println("Interface'teki method2");
   }
   public static void method3(){
       System.out.println("Interface'teki method3");
   }


}
