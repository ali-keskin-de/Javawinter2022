package day27_constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektirikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot= otomatikPilotSorgusu();
    int maxHiz= maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektirikliMi=elk;
        yil=yl;
        yakit=ykt;

    }
    public Volvo(){

    }

    public int maxHizAta() {
        int maxHiz=0;
        if (elektirikliMi){
            maxHiz=160;

        }else{
            maxHiz=240;
        }
        return maxHiz;
    }


    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if (elektirikliMi){
            sonuc=true;
            System.out.println("Araci otomatik Pilot özelligi var "+ sonuc);

        }
        return sonuc;
    }
    public String toString(){
        String arabaOzellikleri=" model : "+ model +
                                " yakit : "+ yakit +
                                " Maxhiz: "+ maxHiz;


        return  arabaOzellikleri;
    }


}
