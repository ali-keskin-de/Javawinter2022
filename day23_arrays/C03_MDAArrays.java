package day23_arrays;

public class C03_MDAArrays {
    public static void main(String[] args) {

        // Boyutlari belirli bir Array'in elemanlarini girmeden olusturalim
        // bir okulda icinde 24 kisi olan 8 sinif vardir

        //Dikkat!!!
        // bir Array'i olusturmak icin boyutlari bellirli olmali!

        int arr[][]= new int[8][25];
        // bir ilcede herbirinde 24 ögrencilik, 8 sinif bulunan 5 okul vardir

        int ilce[][][]= new int[5][8][24];
        //bir okulda 3 tane 24 kisilik, 2tane 22 kisilik sinif vardir
        // bunu olusturmanin tek yöntemi iki tane farkli Arraylerle yapabiliriz
        // farkli uzunluktaki iki array'i otomatik olarak tek komutla uretemezsiniz

        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][24];
        // Olustur iken elementleri atarsak farkli uzunlukta inner Arrayler tanimlayabiliriz




    }
}
