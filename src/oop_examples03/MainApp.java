package oop_examples03;

public class MainApp {
    public static void main(String[] args) {
        // Polymorphism (Çok biçimlilik)
        //Metotların overload edilmesi
        //Metotların override edilmesi


        Hayvan hayvan1=new Hayvan("Aslan",12,150);
        Hayvan hayvan2=new Hayvan();
        hayvan1.beslen();
        hayvan1.sesVer();
        System.out.println(hayvan1);
        System.out.println(hayvan2);
    }
}
