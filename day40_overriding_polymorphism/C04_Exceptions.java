package day40_overriding_polymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {
        // String olarak verilen bir sayiyi integere cevirip 2 katini yazdiriniz

        String str="12345a";

        /*
         str icinde sayi olmayan bir karakter olursa NumberFormatException.forInputString exceptions verir

         */


        try {
            int sayi=Integer.parseInt(str);
            System.out.println("Girilen sayinin 2 kati: " + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Giridiginiz String sayi olmayan elementler iceriyor");
        }

    }
}
