package day27_constructor;

public class Cons02 {

    public static void main(String[] args) {

        Cons01 obj1= new Cons01();// default constructor devrede

        /*
        Cons01 class'inda hic constructor olusturmazsak,
         java default constructor'i kullandigindan obj1'i uretebiliriz


         Ancak biz parametreli veya parametresiz bir constructor olusturdugumuzda
          java sunu der kod yazan insiyatif aldi
         bu sebepten kendi olusturdugu default constructor siller

         eger biz parametreli bir constructor olusturur isek ve diger Class'imizdada
         parametresiz bir obje olusturu isek
          java bizi uyarir parametresiz bir constructor bulunamadigindan bu sebepten
         bizde elimize bir parametresiz constructor olustururuz

         */
        /*
           Dolayisi ile biz herhangi constructor olusturdugumuzda daha önce baska Classlar ve kullanicilarin
           olusturmus olduklari obje'leri kullanabilmeleri icin default constructor islevini görmesi icin
           elimizle parametresiz bir constructor olustururuz

         */


        Cons01 obj2=new Cons01("java");

    }
}
