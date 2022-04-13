package day33_Varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {
        /*
    parametre olarak bir int ve istediginiz kadar String olan
    en uzun kelimenin harf sayisi ile int parametre degerini carpip sonucu yazdiran bir method olusturun

     */
        int sayi=5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";


        carpim(sayi,str1,str2,str3);
        /*
        Eger varargs'ta varargs'tan baska parametre varsa varargs sona yazilir. iki tane varargs yazilamaz
        yani bir method'ta varargs disinda parametre kullanacaksak önce diger parametreleri yazip varargs'i en sona yazmaliyiz
        Bu sebeple birden fazla varargs olamaz
         */
    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("istenen deger : " + sayi * enUzunStr.length());
    }


}
