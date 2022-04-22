package oop_examples02;

public class MainApp {
    public static void main(String[] args) {
       LazerPrinter p1=new LazerPrinter(50,100,true);

        System.out.println(p1.addToner(20));
        System.out.println(p1.addToner(200));
        System.out.println("Kağıt seviyesi:"+p1.addPaper(200));
        System.out.println("Yazdırılan kağıt miktarı: "+p1.print(-11));
    }
}
