package day34_accesModifier_encapsilation;

public class C03 {
    // encapsule edecegimiz iki variable olsun
    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
// Burda olusturdugumuz toString method'u sayesinde diger Classta sayiyi direkt yazdirabiliriz
    //System.out.println(obj);//C03{sayi=0, str='Java Java Java'}
    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }
}
