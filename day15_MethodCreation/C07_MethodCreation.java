package day15_MethodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //String'i yazdiran bir method

        //hosgeldiniz diyen bir method olusturun

        hosgeldinYazdir();
    }

    public static void kapanmaMethodu()  {
        System.out.println("bizi tercih ettiginiz icin tesekür ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("böyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();

    }
}
