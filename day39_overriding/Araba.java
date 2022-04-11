package day39_overriding;

public class Araba  {
    protected String hareket="Arabalar tekerlekle hareket ederler";
    protected String hiz="Arabalar motor gücüne göre hiz yaparlar";
    protected String yakit="Arabalar farkli yakitlar kullanirlar";
    protected String marka="Arabalar üretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabamar farkil marka motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Arabamar moto gucu ve yakit turune göre yakit tüketir");
    }
}
