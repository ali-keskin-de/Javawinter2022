package day39_overriding;

public class Araba  {
    protected String hareket="Arabalar tekerlekle hareket ederler";
    protected String hiz="Arabalar motor gücüne göre hiz yaparlar";
    protected String yakit="Arabalar farkli yakitlar kullanirlar";
    protected String marka="Arabalar üretildikleri markaya sahiptir";

    public void motor(){

        System.out.println("Arabamlar farkil markalardan motor kullanirlar");
    }
    public void yakitTuketimi(){

        System.out.println("Arabamar motor gucu ve yakit turune göre yakit tüketir");
    }
}
