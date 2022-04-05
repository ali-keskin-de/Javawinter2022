package day27_constructor;

public class Toyota {


    String marka="Toyota";
    int tekerAdeti=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yilli;

    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Bezinli araclar max 240km/h hiz yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("dize araclar max 260km/h hiz yapar");
        }
    }
    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri kirimizi ve beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris renk secenekleri siyah ve beyaz");
        }
    }


}
