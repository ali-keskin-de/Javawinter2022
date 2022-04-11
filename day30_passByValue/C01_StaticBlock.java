package day30_passByValue;

public class C01_StaticBlock {
    static{// Class calismaya baslamadan  önce yapmamiz gereken ön atamalar varsa onlari yapar

        /*
        static bloklar class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli ön hazirliklar icin kullanilir
        yazdiginiz satirin hic bir önemi yoktur, class icerisinde istenilen yere yazilanbilir
        static blok birden fazla olursa yukardan asagi calisir
         */
        System.out.println("Static blok calisti");

    }
    static {
        System.out.println("static blok2 calisti");
    }
    C01_StaticBlock(){

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlock obj1;
        new  C01_StaticBlock();
        System.out.println("main method sonu");

    }
}
