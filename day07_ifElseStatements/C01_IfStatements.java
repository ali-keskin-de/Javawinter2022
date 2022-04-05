package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a==b){

            System.out.println(" verilen sayilar esit");

        }
        if (a>100){
            System.out.println("a yuzden buyuk");

        }
        if (a*b>5){
            System.out.println(" sayilarin carpimi 5 ten buyuk");


        }
        // Bagimsiz if cümleleri kendilerinden disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklanirlar
        // bir den fazla bagimsiz if cumlesi oldugunda hepside calisabilir hic biride calismayabilir

    }
}
