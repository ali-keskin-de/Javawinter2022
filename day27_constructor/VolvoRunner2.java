package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        // her obje olusturdugumuzda model, yakit,yil gibi degerleri
        // tek tek atama yapmak istemiyorsaniz

        Volvo arb1= new Volvo("V80",false,2023,"Benzinli");

        System.out.println(arb1);//model: V80 yakit: Benzinli Maxhiz: 230

    }
}
