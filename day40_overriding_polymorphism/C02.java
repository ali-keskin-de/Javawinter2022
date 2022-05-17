package day40_overriding_polymorphism;

public class C02 extends C01{

    private void method4(){
        System.out.println("child method 4 ");
        // Pranet class'taki private method4'e
        // child class'dan ulasmamiz mumkun olmadigindan
        //java bu iki method'u
        //TAMAMEN FARKLI IKI METHOD olarak kabul eder
        //@Override kullanmak isterseniz java kabul etmez CTE verir

    }

    @Override
    protected String method3() {
        return "java";
        // Covariant icin yazildi
    }

    @Override
    public void method2() {
        /*
        @Override notasyonu override method ileoverriding method'u bir birine baglar
        Farkinda olunmadan overriden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        Notasyon kullanilmazsa Java bunlari iliskisini bilir ama overriden method silinirse sesini cikarmaz
         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {
        C02 obj=new C02();// hem objemiz hem data türümüz hemde constructor icinde bulundugumuz Class'tan
        obj.method1();//parent method 1
        obj.method2();//Child method2

        C01 obj2=new C02();
        obj2.method1();//parent method 1
        obj2.method2();//Child method2
                       // data türü parent classtan oldugundan önce parent class'a gidip bu method var mi bakacak
                       // eger method varsa önce yazdirmayacak chil class'ta overide edilmis mi bakacak eger override edilmisse onu yazdiracak
                       // edilmemis ise parent class'taki method'u yazdiracak
        C01 obj3=new C01();
        obj3.method1();//parent method 1
        obj3.method2();//parent method 2
        // burda data türüde constructor'da parent class'tan oldugundan child classla isimiz olmaz.



    }

}
