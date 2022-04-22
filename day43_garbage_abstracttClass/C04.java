package day43_garbage_abstracttClass;

public abstract class C04 {

    /*

    bir abstract class'da abstract yada concrete method bulanabilir
    Child Class'larin abstract methodlari override etmesi Mecburi iken
    concrete method'larin override edilmesi Opsiyonel'dir

     */
    public abstract void absMethod();
    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
        Abstract class'lar consturctor'a sahiptir
        ancak Abstract class'larda obj'e olusturulamaz
        Abstract class'lar obje barindirmayan sadece child classlar icin uyulmasi sart olan
        veya opsiyonel birakilan özellikleri tanimladigimiz bir depo class gibidir


         */
        System.out.println("Bu class abstract");
    }

}
