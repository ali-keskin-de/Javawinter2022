package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapilan tüm islemler if else ilede yapilabilir,
        // if else yerine tercih edilmesinin sebebi yapinin basit olmasidir
        // Ternary icerisinde komplex kodlar olmaz basit kodlar olabilir

        // kullanicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazdiralim
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir pozitif tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift ");
        }else{
            System.out.println(" sayi tek");
        }

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

    }
}
