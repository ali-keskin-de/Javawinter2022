package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        // palindrom bir sayinin tersi ile ayni ise bu kelimelere palidrom denir

        String input= "Java";
        palindromeKontroEt(input);



    }

    private static void palindromeKontroEt(String input) {
        String terstenInput="";

        for( int i=input.length()-1; i>=0; i--){
            terstenInput+=input.charAt(i);
        }
        System.out.println("Girdiginiz kelimenin tersten yazilsin :"+ terstenInput);

        if (terstenInput.equalsIgnoreCase(input)){
            System.out.println("giridiginiz kelime palindrom");
        }else{
            System.out.println("girdiginiz kelime palindrom degildir");
        }

    }
}
