package day14_StringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="    Siz ne derseniz deyin, java bildigini okur.   ";
        str.trim();//atama yapilmamis
        System.out.println(str);
        System.out.println(str.length());//49

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());//43
    }
}
