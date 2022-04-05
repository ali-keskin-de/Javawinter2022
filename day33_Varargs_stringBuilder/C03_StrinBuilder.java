package day33_Varargs_stringBuilder;

public class C03_StrinBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok güzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("Sb1 length: "+ sb1.length());//0
        System.out.println("Sb1 capacity: "+ sb1.capacity());//16

        System.out.println("Sb2 length: "+ sb2.length());//14
        System.out.println("Sb2 capacity: "+ sb2.capacity());//30

        System.out.println("Sb3 length: "+ sb3.length());//0
        System.out.println("Sb3 capacity: "+ sb3.capacity());//10

       // append method'u ile ekleme yapabiliriz

       sb1.append("java").append(" ").append("cok").append(" ").append("güzel");
        System.out.println("Sb1 length: "+ sb1.length());//14
        System.out.println("Sb1 capacity: "+ sb1.capacity());//16

        sb1.append(3);

        System.out.println(sb1);//java cok güzel
        sb1.append(true);
        System.out.println(sb1);//java cok güzel3true

        System.out.println("Sb1 length: "+ sb1.length());//19
        System.out.println("Sb1 capacity: "+ sb1.capacity());//34

        sb1.append("tüm dersler java olsa");
        System.out.println("Sb1 length: "+ sb1.length());//40
        System.out.println("Sb1 capacity: "+ sb1.capacity());//70

        sb1.trimToSize(); // olusturdugu fazladan alani kullanmak istemiyorsak atariz bu methodla
        System.out.println("Sb1 length: "+ sb1.length());//40
        System.out.println("Sb1 capacity: "+ sb1.capacity());//40








    }
}
