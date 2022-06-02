package printf;

public class C02_CarpimTablosu {
    public static void main(String[] args) {

        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.printf("%4d",i * j );

            }
            System.out.println();
           //   1   2   3   4   5
            //   2   4   6   8  10
            //   3   6   9  12  15
            //   4   8  12  16  20
            //   5  10  15  20  25
        }
    }
}
