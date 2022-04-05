package day33_Varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12, " edin"));//Prize dikkat edin

        String str= "hayatta cok güzel seyler var";

        System.out.println(sb1.insert(0,str,0,8));//hayatta Prize dikkat edin

        System.out.println(sb1.reverse());//nide takkid ezirP attayah tersten cevririr

        System.out.println(sb1.reverse());//hayatta Prize dikkat edin




    }



}
