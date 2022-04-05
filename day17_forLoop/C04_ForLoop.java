package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        for (int i=10; i<=29 ; i++){
            System.out.print(i+ ", ");
        }
        System.out.println(30);

        System.out.println("Daha teknik olarak");


        int baslangic=10;
        int bitis=30;
        for (int i= baslangic; i<=bitis; i++){
            if (i<bitis){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
        }
        }

    }
}
