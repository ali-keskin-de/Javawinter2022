package day18_nestedForLoop;

public class C03_NestedForLoopDnm {
    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //   *
        //   * *
        //   * * *
        //   * * * *
        int input1=3;
        int input2=5;
        for (int i = 1; i <=input1 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");


            }
            System.out.println("");


        }
    }
}
