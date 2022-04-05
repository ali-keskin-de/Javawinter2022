package day20_scope_Arrays;

public class C01_Scope {
    int sayi;
    String bansIsmi="Java";
    boolean okuldaMi;
    public static void main(String[] args) {
        //sayi=10; Sayi method'u static olmadigindan main metohd'ta kullanilamaz
        //instance variable'lara static metohd'lardan ulasabilmek icin obje olusturmamiz gerekir
        C01_Scope obj1= new C01_Scope();
        System.out.println(obj1.sayi);//0 cunku yukarda sayi varaible bir deger atamadik eger instance variable
                                     // eger deger atamaz isek java onlara Default degerlerini verir
                                    // int icin =0, boolean icin false'tur
        obj1.sayi=10;
        System.out.println(obj1.sayi);// 10
        obj1.bansIsmi="SQL";
        System.out.println(obj1.okuldaMi);//false


        C01_Scope obj2=new C01_Scope();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bansIsmi);// Java yazar eger yukarda deger atamazsak bize default degerini atar java



        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);//false


    }
}
