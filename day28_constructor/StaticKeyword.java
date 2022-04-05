package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;
    // Class taki variable deger atamak zorunda degilliz, biz atamasakta java onlara default degerlerini atar

    public static void main(String[] args) {
        System.out.println("sayi1 : "+sayi1);
        //System.out.println("sayi2 : "+sayi2); static olmadigindan main method icerisinden yazdiramayiz.
        // eger yadirmak istiyorsak önce bir obje olusturmaliyiz
        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);//0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : " + sayi1);//1
        System.out.println("sayi2: "+obj1.sayi2);//1

        StaticKeyword obj2= new StaticKeyword();

        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//3

        // Static variable direkt class'a baglidir. Class icerisinde yapilan
        // her türlü degisikli static variable'larda  kalici olur
        // instance variable'lar ise objeye baglidirlar, obje üzerinden erisilebilir ve
        // bir obje uzerinden erisilerek yapilan degisikler instance variable'in degerini tum objeler icin kalici olarak degistirmez
        //sadece o obje icin instance variable degerini kalici olarak degistirir.


    }
}
