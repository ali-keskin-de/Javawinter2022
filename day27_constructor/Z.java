package day27_constructor;

public class Z {
    String isim;
    String soyisim;
    int nummer;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {

        isim=ism;
        soyisim=soyism;
        nummer=no;
        gercekMi=grc;


    }

    public Z(String isim, String soyisim, int nummer) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.nummer=nummer;
    }

    public String toString(){

        return ("Isim : "+isim+", soyisim: "+soyisim+", nummer: "+nummer);
    }
}
