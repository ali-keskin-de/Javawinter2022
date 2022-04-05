package day15_MethodCreation;

public class C07_MethodCreatinDnm {

    public static void main(String[] args) {

        String str = "Ali";
        // String'i yazdiran bir Method olusturun
        //hosgeldiniz diye bir method olusturun
        //kapanma mesaji bir method olusturun
        hosgeldinizYazdirin();
        stringYazdir("java bizimle kolay");
        kapanmaMethodu();

    }

    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin Tesekur ederiz");
    }

    public static void hosgeldinizYazdirin() {
        System.out.println("Hosgeldiniz");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
    }
}