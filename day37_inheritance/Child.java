package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {


    Child(){
        super();
        System.out.println("child class parametersiz cons");
    }



    Child(int s){
        System.out.println("Child class parametreli cons.");

    }
    Child( int sayi1, int sayi2){
        System.out.println("iki parametreki cons.");
    }
    public static void main(String[] args) {
        Child child = new Child(5,8);
    }

}
