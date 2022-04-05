package day20_scope_Arrays;

public class C02_StaticVariable {
    static  String okulIsmi="Yildiz koleji";
    static int okulNo;
    static boolean okulAcikMi;

    /*
    instance variable'lar obje'ye bagimlidirlar ve her objler varkli degerler alabilirler
    ögrenci notlari ögretmen basarilari gibi
    bir obje'ye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

    Steatic variable'ler ise class variable olarak tanimlanir
    ve tüm Class üyeleri icin aynidirlar eger static variable'in degeri degistirilirse herkes icin degisir

     */

    public static void main(String[] args) {
        System.out.println(okulIsmi);// Yildiz koleji
        System.out.println(okulNo);//o
        okulNo=102;

        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);// false
        staticMethod();

        System.out.println(okulNo);//200




    }
    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200

    }
}

