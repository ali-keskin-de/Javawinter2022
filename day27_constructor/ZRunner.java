package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {
        Z obj1= new Z("emre","Gülser",44,true);
        System.out.println(obj1);

        Z obj2=new Z("Emre", "Daha", 13);

        System.out.println(obj2);//Isim : Emre, soyisim: Daha, nummer: 13

        Z obj3= new Z("ali", "keskin", 12);

        System.out.println(obj3);
    }
}
