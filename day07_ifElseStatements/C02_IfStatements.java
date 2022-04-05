package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tüm kodlar calisir");

        }
        if (a<0) System.out.println("süslüparantez olmazsa sadece bir satir calisir");

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniy if body sini suslu parantez icine yazmalisiniz
        // body yi {} icine yazmasak da if cumlesi calisir
        // ancak ilk ; gördügünde if cümlesi bitmis olur


        // 22. satir kod 14. satir if dogru olsa da calisir  false olsavda calisir
        System.out.println("ikinci satirda calisti");// bu satir if ten bagimsiz calisir



    }
}
