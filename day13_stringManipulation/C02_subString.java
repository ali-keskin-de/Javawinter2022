package day13_stringManipulation;

public class C02_subString {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"
        String str= "1-48 of 104 results for \"nutella\"";

        int ilkspace= str.indexOf(" ");//4
        int ikispace= str.indexOf(" ", ilkspace+1);
        int ücüspace= str.indexOf(" ", ikispace+1);

        String aramaSonucsayisiStr=str.substring(ikispace+1,ücüspace);
        System.out.println("aramaSonucsayisiStr = " + aramaSonucsayisiStr);//104

        int aramaSonucsayisiInt= Integer.valueOf(aramaSonucsayisiStr);





    }
}
