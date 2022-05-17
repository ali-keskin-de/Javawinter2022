package day41_exceptions;

public class C01_Exepcions {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c=0;
        try {
             c=a/b;
        } catch (Exception e) {// bunun anlami eger bir exceptions ile karsilasirsan bu exception'i e obje'sinin
                              // icine koy ve yoluna devam et
           // e.printStackTrace();
           // System.out.println(e.getMessage());
            //System.out.println(e.getCause());
            // Buradaki e : Javanin exception'i atayacagi obje
            // Exception ise olusan exception'nin turu

            System.out.println(e.getMessage());


        }

        System.out.println(c);

    }
}
