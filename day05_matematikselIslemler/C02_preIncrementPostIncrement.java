package day05_matematikselIslemler;

public class C02_preIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;// burda önce sayi 1 assignment yaptiktan sonra sayi 1 bir artirir.
                      // yani sayi 2 = sayi bir olur daha sonra sayi bir bir Increment yapildigindan sayi 1 de sayi1+1 olur

        System.out.println(sayi1 +" ," + sayi2 +", " + sayi3);

        sayi3=++sayi1;// önce sayi1 increment yapilir daha sonra assignment yapilir sayi3 'e
                      // yani sayi1= sayi1+1=12 sayi3 =sayi1+1=12 olur

        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);// 12, 10, 12

        System.out.println(sayi3++);// önce print out( yazdirmak) yapacak sonra Increment (artirmak) yapacak
                                    // önce 12 print out, sonra Increment sayi3=13 ancak bunu print out yapamayacak

        System.out.println(--sayi2);// once azalt, sonra print out yazdir
                                    // once sayi2=9 sonra sayi2' nin son degeri yani 9 print out.




    }
}
