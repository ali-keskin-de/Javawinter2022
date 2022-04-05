package day05_matematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {


        //primitive data türü ile non-primitive data türleri arasindaki farklar nelerdir?

        String str= "java";

        int sayi=10;
        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);

        // non-primitive data türleri data depolamak  yaninda bir cok faydali methoda sahiptir
        // ancak primitive data türlerinin böyle özellikleri yoktur
        // primitive data türleri sadece depolar

        // primitive data türleri gerekli oldugunda java ara bir cözüm üretmistir
        // java her bir primitive  data türünü, non-primitive olarak kullanabilmek icin
        // özel  Class olusturmus ve bunlari Wrapper Class adini vermistir

        double sayi2=20.5;

        // sayi 2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        Double sayi3= 15.2;


        // Sayi wrapper Class olan Double Class'ini kullandigindan sayi3. dedigimizde bir cok method gelir

    }
}
