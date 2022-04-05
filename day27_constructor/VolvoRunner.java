package day27_constructor;

public class VolvoRunner {

    public static void main(String[] args) {
        Volvo araba1= new Volvo();

        System.out.println(araba1.marka);
        araba1.yakit="Dizel";
        araba1.elektirikliMi=false;
        System.out.println(araba1.maxHiz);

        System.out.println(araba1.toString());

        Volvo araba2=new Volvo();
        araba2.yakit="Elektrikli";
        araba2.elektirikliMi=true;
        araba2.model="V80";
        System.out.println(araba2);
    }
}
