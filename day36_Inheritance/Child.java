package day36_Inheritance;

public class Child extends Parent {


    Child(){
        System.out.println("Child Cons. calisti");
    }
    // Extends keyword kullanilan tüm class'larda biz görmesek bile java'nin olusturdugu default constructor vardir
    // Tüm constructor'larin ilk satirinda biz görmesekte super() constructor call vardir
    // yani yani parent class'in parametresiz constructor call vardir

    public static void main(String[] args) {

        Child child= new Child();

    }
}
