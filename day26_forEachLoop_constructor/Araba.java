package day26_forEachLoop_constructor;

public class Araba {
     /*
      Java'da her Class olusturdugumuzda java o Class'ta ileride objeler üretmek gerekecegini bilir
     ve biz özellikle belirtmesektede java her olusturdugu Classa bir constructor koyar.


      Java'nin class olustururken class'a koydugu constructor'a DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

      Eger biz görünür bir constructor'imiz  olsun istersek
      default constructor ile ayni görevi yapan bir constructor olusturabiliriz
      veya istersek ayni kaliptan farkli desenlerde obje olusturmak icin
      farkli özelliklerde  constructorlarda olusturabiliriz

      constructorlari bir birinden farklilastiran  tek ayricalik kullanilan parametre sayisi ve parametre data turudur
       
      */

    public Araba(){

    }
    /*
    bir kod blogunun method mu? veya constructorn mu? olup olmadigindan emin olmak istiyorsaniz
    iki seye dikkat etmelisiniz
    1- Constructor'larin ismi Class ismi ile ayni olmak zorundadir yani büyük harfle baslar;
    2- Constructor'larin return type olmamali(void ve diger data türleri varsa demek return type var demektir)


     */

    public Araba(String renk){
        System.out.println(renk+ " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil+ " model bir arab uretildi");
    }
}
