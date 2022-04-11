package day30_passByValue;

public class C02_StaticBlocks {
    {
        /*
        static olmayan blocklar obje olusturulurken calisir

        static bloklar en basta bir kere calisir ama static olmayan bloklar her obje olusurken calisirken yeniden calisir

         */
        System.out.println("static olmayan blok calisti");
    } // buda instance block oldu.

    static {
        System.out.println("static  blok calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method basi");

        C02_StaticBlocks obj1 =new C02_StaticBlocks();
        C02_StaticBlocks obj2 =new C02_StaticBlocks();


    }
}
