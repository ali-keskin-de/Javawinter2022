package day15_MethodCreation;

public class C05 {
    public static void main(String[] args) {

        //main metohd olmadan bir Class olusturulabilir
        //Ancak bu Class direkt calismaz
        //sadece depo görevi görür
        //baska Classlarda kullanilbilecek variable ve methodlari barindirir
        //
        String str= "Ali Can";
        C04.besHarfiTesineCevir(str);

        str="java";

        C04.dortHarfiTesineCevir(str);




    }
}
