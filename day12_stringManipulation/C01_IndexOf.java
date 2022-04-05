package day12_stringManipulation;

import java.util.Scanner;

public class C01_IndexOf {
    public static void main(String[] args) {

       //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.
        String cümle= "Java ögren,yeni program ile yeni bir sayfa ac";
        String kelime=" ";

        int ilkKullanim=cümle.indexOf(kelime);// -1 veya index cikar
        int ikinciKullanim= cümle.indexOf(kelime, ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
    }
}
