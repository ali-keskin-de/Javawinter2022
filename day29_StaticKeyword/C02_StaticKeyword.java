package day29_StaticKeyword;

public class C02_StaticKeyword {

    public static void main(String[] args) {
        /* baska class'daki static class uyelerine ulasmak icin
        sadece classIsmin.staticUyeIsmin
        yazmamiz yeterlidir

         */


        System.out.println(C01_Static.okulTelefonu);//3122563635

        C01_Static.okulTelefonu="312254474747";

        System.out.println(C01_Static.okulTelefonu);//312254474747

        // java runtime'dir java durana kadar javada o bilgiler olur durunca gider

        /*
        Instance (Object) Variable, class icerisinde veya baska

         */
        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();
        System.out.println(obj2.okulIsmi);
        obj2.okulIsmi="sabir koleji";
        System.out.println(obj1.okulIsmi);
        System.out.println(obj2.okulIsmi);



    }
}
