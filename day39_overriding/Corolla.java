package day39_overriding;

public class Corolla extends Toyota {
    protected String hiz = "Corolla araclar max 200 km hizi yapar";
    protected String yakit = "Corolla benzinli veya elektriklidir";
    protected String model = "Corolla";


    public void motor(){

        System.out.println("Corolla araclar cevreci motor kullanirlar ");
    }

    public void yakitTüketimi(){

        System.out.println("Corolla 5,6 l yakit tüketir ");
    }

    public void vitesSayisi(){

        System.out.println("Corolla 5 viteslidir ");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli
         oldugundan  constructor calistigi icin obje
         Constructor'in oldugu class özelliklerini tasir
         ancak data türü parent class secildigi icin variable'lar
         data turunun secildigi class ve onun parent classlarindan
         deger alabilir

         methodlar icin ise gene data türü olarak secilen class'a gider
         ancak direkt method'u calistirmadan önce method Override edilmis mi kontrol ederiz

         overriding: overriding demek parent class'ta var olan bir  methodun aynisini
         child class'ta olusturmak demek. Bu durumda direkt constructor bakariz
         ve constructor göre secim yapariz, yani arb1.motor() //corolla burda bulundugumuz classa bakar
         motor methodu varsa direkt aliriz

         */

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba classindan alir
        System.out.println(arb1.hiz);//Corolla classinda alir
        System.out.println(arb1.yakit);//Corolla classindan alir
        System.out.println(arb1.marka);// Toyota Classindan alir
        System.out.println(arb1.sirketMerkezi);// Toyota Classindan alir
        System.out.println(arb1.model);// Corolla
        arb1.motor();// Corolla

        Toyota arb2=new Corolla(); // Burda data türümüz Toyota constructor Corolla
        // Eger variable'lardan bahsediyorsak önce toyota Classina gideriz sonra onun Parentlarina bakariz
        // cünkü data türü toyota.
        System.out.println(arb2.hareket);//araba classindan alir
        System.out.println(arb2.hiz);//Toyota Classindan alir
        System.out.println(arb2.yakit);//Araba classindan alir Corolladan almaz cünkü data türümüz Toyota
        // önce toyota classina gider orda yoksa Toyotanin parent'larina bakar ama kesinlikle geri dönüs yapmaz
        // yani biz burda corolla classindan variable'larin degerlerinden alamayiz
        System.out.println(arb2.marka);// Toyota classindan alir
        System.out.println(arb2.sirketMerkezi);// Toyota classindan alir
       // System.out.println(arb2.model);// CTE error
        arb2.motor();//corolla
        arb2.garanti();// Toyotdaki calisir
        arb2.yakitTuketimi();// Corolla
        //arb2.vitesSayisi();// data türü toyoto'dan baslayinca böyle bir method bulamadik



        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hiz);//Araba
        System.out.println(arb3.yakit);//Araba
        System.out.println(arb3.marka);// Araba
       // System.out.println(arb3.sirketMerkezi);// CTe error
        //System.out.println(arb3.model);// CTE error

        arb3.yakitTuketimi();// Corolla'daki method'u calistirir cünkü Override edilmis
        arb3.motor();//Corolla 'dan calisir iki defa override edilmis ama en gücel olan classtaki calisir
        //arb3.garati();// aramaya Araba classindan basladi ve bulamadi
       // arb3.vitesSayisi//aramaya Araba classindan basladi ve bulamadi


    }
}
