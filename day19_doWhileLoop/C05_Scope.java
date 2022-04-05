package day19_doWhileLoop;

public class C05_Scope {
    // 1- Bir method icerisinde olusturulan variable'lar sadece o method'ta kullanilabilir, baska methodlarda kullanilmaz
    // 2- Tüm Methodlarda kullanilmasini istedigimiz variable lari Class level'da olusturulur
    //3- Class level'da olusturdugumuz variable'i
    // --static yaparsak bütün methodlar kullanabilir
    // --static olmazsa (instance) o zaman sadece static olmayanlarda method'lar kullanilabilir

    
    public static void main(String[] args) {
        int sayi=10;
       // isim=" veli Yan";

    }
    public static void method1(){
       // sayi=20;
        String isim="Ali Can";
    }
    public void method2(){

    }
}
