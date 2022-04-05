package day13_stringManipulation;

public class C01_subString {
    public static void main(String[] args) {

       String str= "Java ile IT cok guzel";
        System.out.println(str.substring(5));
        // yukardaki String'i kullanarak Mehmet hoca ile IT cok guzel yapalim

        System.out.println(str.replace("Java", "Mehmet Hoca"));//Mehmet Hoca ile IT cok guzel
        System.out.println("Mehmet Hoca "+ str.substring(5) );//Mehmet Hoca ile IT cok guzel

        System.out.println(str.substring(9));//IT cok guzel

        // eger bir index'ten sona kadar olan parcayi degilde ,
        // belirli bir parcayi almak istiyorsak, 2 parametre yazmak gerekir str.substring( baslangicIndexi, bittisIndexi)
        // baslagic index'i==> inclusive/dahil
        // bitis index'i ==> eclusive/ haric

        System.out.println(str.substring(0,5));// Java
        System.out.println(str.substring(0,1));//j

        String harf= str.substring(5,6);// bana 6 harfi verir.
        System.out.println(harf);

        str="Java gün gectikce guzellesiyor";
        System.out.println("str.substring(7,7) = " + str.substring(7, 7));//"" hiclik verir. java soldan saga okur

        //System.out.println("str.substring(5,2) = " + str.substring(5, 2));bitis index'i baslangic index'inden kücük olmaz

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));//r son harfi verir
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5));//siyor son 5 karakteri verir
        System.out.println("str.substring(str.length()) = " + str.substring(str.length()));// hiclik



    }
}
