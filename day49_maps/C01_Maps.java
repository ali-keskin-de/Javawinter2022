package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {

        // Java collection üyesi bir yapida data türü Objekt secilirse
        // her data türünden deger ekleyebiliriz ancak bu durumda sürekli casting problemleri ile karsilasabiliriz
        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);

        list.set (1,(Integer)(list.get(1))+10);
        Map<Integer,String> sinifList= new HashMap<>();
        // bir sinifta ögrenci no ve isim soyisim ve brans olarak map olusturmak istiyoruz
        // key tek bir unique degerdir
        // ama value(deger) birden fazla bilginin bilesiminden olusabilir
        // Bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        // tüm elementler icin value ayni bicinde olusturulmalidir
        // (veri siralmasi ve sekilsel acidan)

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");
        sinifList.put(104,"Fatma, kan, Dev");
        sinifList.put(105,"Ayse, Zan, C#");
        System.out.println(sinifList);
        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]




    }
}
