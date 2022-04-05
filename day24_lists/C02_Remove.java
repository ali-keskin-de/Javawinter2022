package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");


        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) method'u istenen elementi kaldirip
        // bize true / false doner
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        //method'u  boolean bir variable atayabilirsiniz Asagidaki gibi
        // sonucu yazdirmak isterseniz if else ile yapabilirsiniz

        boolean sonuc= isimler.remove("Oguzhan");// true
       // System.out.println(isimler);//[Aykut, Yusuf, Ilker] bunu her seferinde yadirmak mantikli degil
        // ama kullaniciya bir dönüt vermek istiyorsak asagidaki gibi if else yapariz


        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else{
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }
        System.out.println(isimler);  //[Aykut, Yusuf, Ilker]

        // remove index yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elementi döner

        System.out.println(isimler.remove(1));//yusuf'u siler ve banda delil olarak yusuf ismini bize döndürür.

        System.out.println(isimler); // [Aykut, Ilker]




    }
}
