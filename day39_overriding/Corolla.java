package day39_overriding;

public class Corolla extends Toyota {
    protected String hiz = "Corolla araclar max 200 km hizi yapar";
    protected String yakit = "Corolla benzinli veya elektriklidir";
    protected String model = "Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar ");
    }

    public void yakitTüketimi(){
        System.out.println("Corolla 5,6 l yakit tüketir ");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir ");
    }

    public static void main(String[] args) {

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//Corolla
        System.out.println(arb1.marka);// Toyota
        System.out.println(arb1.sirketMerkezi);// Toyota
        System.out.println(arb1.model);// Corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//Toyota
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);// Toyota
        System.out.println(arb2.sirketMerkezi);// Toyota
        System.out.println(arb1.model);// CTE error

        Araba arb3=new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//Araba
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);// Araba
        System.out.println(arb2.sirketMerkezi);// CTe error
        System.out.println(arb1.model);// CTE error


    }
}
