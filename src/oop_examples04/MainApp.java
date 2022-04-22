package oop_examples04;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[]sayilar={3,5,1,2,9,4};

        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);//sıralıyor kücükten büyüge sıralıyor
        System.out.println(Arrays.toString(sayilar));

        String[] isimler={"Mehmet","Ahmet","Hasan","Zeynep","Ayşe"};

        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);//Alfabetik sıraya göre yazdırdı
        System.out.println(Arrays.toString(isimler));

        Kitap[]kitaplar={
                new Kitap("java5","Herbert Schild",700),
                new Kitap("C# 4.0","Herbert Schild",500),
                new Kitap("Python'a Giriş","Cenk Serdengeçti",400)
        };

        System.out.println(Arrays.toString(kitaplar));
        Arrays.sort(kitaplar);
        System.out.println(Arrays.toString(kitaplar)+"\n");
        for (Kitap kitap:kitaplar) {
            System.out.println(kitap);
        }
    }
}
