package day14_StringManipulation;

public class C02_TestenYazdirma {
    public static void main(String[] args) {
    //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        //version2: Girilen kelimenin ilkharfi büyük digerleri kücük olsun
        
        String input="Mavi";
        
        String tersStr= input.substring(3)+input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.println("tersStr = " + tersStr);
    }
}
