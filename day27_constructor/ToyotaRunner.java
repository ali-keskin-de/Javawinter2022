package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1= new Toyota();
        System.out.println(t1.marka);// toyota
        System.out.println(t1.tekerAdeti);//4
        System.out.println(t1.model);//null
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yilli=2022;
        System.out.println("T1 model: "+t1.model+", yakit: "+ t1.yakit+ ", yil: "+t1.yilli);
        t1.maxHiz();


        Toyota t2=new Toyota();
        t2.model="Yaris";
        t2.yakit="Benzinli";
        t2.yilli=2021;

        System.out.println("Model: "+t2.model+", yakit: "+ t2.yakit+", yilli: "+ t2.yilli);
        t2.renkTercihleri();




    }
}
