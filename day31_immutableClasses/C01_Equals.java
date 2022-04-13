package day31_immutableClasses;

public class C01_Equals {
    public static void main(String[] args) {
        String str1="Eren";
        String str2="Eren";
        /*
        Eger yeni obje olusturma veya bir islem yapma yoksa java String havuzunu kontrol eder
        String str3= new String("Eren"); esitligin solu herzaman variable'dir, sagi degerdir (Value)
        new yazdigimizda java yeni bir obje olusturu bu su demek heap'te bir yer acmaktir

         */

        String str3= new String("Eren");
        String str4=str1+"";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true


        // ==  hem degere bakar hemde referansa bakar eger ikiside ayni ise true verir

        System.out.println(str1==str2);// true
        System.out.println(str1==str3);// false
        System.out.println(str1==str4);// false

        String a="";
        a +=2;
        System.out.println(a);//

    }
}
