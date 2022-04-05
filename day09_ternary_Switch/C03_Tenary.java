package day09_ternary_Switch;

public class C03_Tenary {
    public static void main(String[] args) {

      int sayi=140;
         // verilen sayinin üc basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary yaziniz
        String sonucu=sayi>=100 ? "sayi 3 basamakli veya daha büyük" : "sayi negatif veya 3 basamaktan kucuk";

        System.out.println("girdiginiz sayi analizi :" + sonucu);


    }
}
