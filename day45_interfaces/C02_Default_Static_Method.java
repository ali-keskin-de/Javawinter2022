package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static {
/*
bir interface'te default veya static olarak tanimlanan ve body'si olan methodlarin
override edilmesi mecbüri degildir

 */


    @Override
    public void method1() {
        System.out.println("Child class method1");


    }


    public static void main(String[] args) {

        // Interface'teki static olarak tanimlanan method'lara static yöntemlerle ulasabiliriz---> InterfaceIsmi.methodIsmi
        // Eger static olarak tanimlanmissa zaten override edemeyiz--static methodlar override edilemez



        I01_Default_Static.method3();
        // static olmayan methodlarada obj olusturarak erisebiliriz
        // ancak static bir üyeye obje üzerinden ulasamayiz

        C02_Default_Static_Method obj=new C02_Default_Static_Method();
        obj.method1();//Child class method1
        obj.method2();// Parent Interface gelecek

    }
}
