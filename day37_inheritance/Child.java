package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {
    /*
    bir class'i child class yaptigimizda
    parent class'taki constructor ulasmasi lazim
    bu durumda parent class'taki constructor'i modifier uygun secilmelidir

     */

    // Child class'ta constructor'larin hepsinde parametresiz super() constructor vardir
    // buda bizi parent class'a götürür.


    Child(){
        super();
        System.out.println("child class parametersiz const");
    }



    Child(int s){
        System.out.println("Child class parametreli cons.");

    }
    Child( int sayi1, int sayi2){
        // Eger parent class'tan parametresiz constructor degil
        // baska bir constructor calistirmak istiyorsaniz
        // bunu child class'taki constructor ilk satirina yazmalisiniz

        super(sayi1,sayi2);
        System.out.println("iki parametreki cons.");
    }
    public static void main(String[] args) {
        Child child = new Child(5,8);
    }

}
