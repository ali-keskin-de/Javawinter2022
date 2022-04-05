package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
         // kullanicidan der katili katilmak istemedigini sorun
        // evet derse, cevabini ve "Derse katiliminiz onaylanmistir"
        // hayir derse, cevabini ve "sonraki derse bekleriz"
        // farkli birsey yazarsa "lütfen evet veya hayir yaziniz"


        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz?");
        String cevap= scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + ", Derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz :  " + cevap + ", sonraki derse bekleriz");
        }else {
            System.out.println("lütfen evet veya hayir yaziniz");
        }
    }
}
