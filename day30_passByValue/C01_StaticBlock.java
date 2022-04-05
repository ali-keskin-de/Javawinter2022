package day30_passByValue;

public class C01_StaticBlock {
    static{
        System.out.println("Static blok calisti");

    }
    C01_StaticBlock(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlock obj1;
        new  C01_StaticBlock();

    }
}
