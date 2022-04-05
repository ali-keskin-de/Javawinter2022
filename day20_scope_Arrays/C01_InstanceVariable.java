package day20_scope_Arrays;

public class C01_InstanceVariable {

    int sayi;
    String bransIsmi="java";
    boolean okulAcikmi;

    public static void main(String[] args) {
        //sayi=10; sayi variable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static method'lardan ulasabilmek icin obje olusturmamiz gerekir

        C01_InstanceVariable obj1= new C01_InstanceVariable();
        System.out.println(obj1.sayi);//0
        obj1.sayi=10;
        System.out.println(obj1.sayi);//10
        C01_InstanceVariable obj2= new C01_InstanceVariable();
        System.out.println(obj2.sayi);//0




    }
}
