package day34_accesModifier_encapsilation;

public class C03 {
    // encapsule edecegimiz iki variable olsun
    private  int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }
}
