package day34_accesModifier_encapsilation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*
        bir variable'i encapsule etmek icin
        1-Access modifier'i private yapariz sonra;
        2- okuma ve yazma özelliklerini kullanmasini
         istedigimiz istedigimiz gibi sinirlayabiliriz
         - Eger sadece okunmasini istiyorsaniz getter method'unu kullaniriz
         - sadece deger girilebilsin istersek setter
         methodlarini olustururuz

         Bir variable icin hem getter hem setter olusturursaniz
         o variable public olmus gibi hem okur hem de yazmasina müsade edilir

         getter ve setter yekileri sinirlamak icin kullanilan methodlar
         piyasada geneluygulama public yapmak yerine developer'lar
         ise getter ve setter'lar kullaniyor


         */
        C03 obj=new C03();
        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//C03{sayi=0, str='Java Java Java'}


    }








}
