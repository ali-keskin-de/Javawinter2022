package day33_Varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        //  kac tane String verilirse verilsin icilerinden en uzun olani yazdiran bir method olusturun

        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Abdulsamet";
        String str5= "Alikemal osman";

        // yazilan argument sayisi sabit ise herzaman ki gibi bir method olusturabiliriz
        // ancak  argument sayisinin degoisme ihtimali varsa o zaman Varags tercih edilir

        enUzunKelime(str1,str2,str3,str4,str5);
    }

    private static void enUzunKelime(String... str) {

        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("En uzun kelime: "+enUzunStr);

    }
}
