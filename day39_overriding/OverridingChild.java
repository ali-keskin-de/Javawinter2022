package day39_overriding;

public class OverridingChild extends OverridingParent{
    /*
    Overriding eger child class'ta parent class'taki methodla ayni isimde bir method yaparsam
    bu method parent'taki method'u gecersiz yapar bu isleme overriding denir.
    Bu su demek ben method1 kendi classima göre uyarladim demektir.


     */

        public  void method1(){
            System.out.println("Child class method1");
        }

    public static void main(String[] args) {
        OverridingChild obj1=new OverridingChild();
            obj1.method1();// Child class method1
            obj1.method2();//Parent class method2

        OverridingParent obj2=new OverridingChild();
        obj2.method2();//Parent class method2
        obj2.method1();//Child class method1 bunun sebebi java parent classtaki method1 overriding edildigini bildiginden
        // onun yerine child classtaki method1 yazdirir.

        OverridingParent obj3=new OverridingParent();
        obj3.method2();//Parent class method2
        obj3.method1();//Parent class method1
        /*
        bir obje olusturu iken data türü ve constructor ayni class'tan secilmis ise
        java direkt o class'a gider hem variable hemde method icin o class'ta varsa kullanir, yoksa parentlarina bakar

         */

        /*
        Eger data türü parent, constructor child class'tan secildiyse varibale'larda yukardaki sekilde calisma devam eder
        Ancak method'lar icin data türünün oldugu class'taki method child class tarafindan overriding edilmis midiye kontrol etmemiz gerekir
        Eger child class'larda bu method override edilmis ise override eden method calisir.

         */
    }
}
