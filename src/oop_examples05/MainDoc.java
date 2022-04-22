package oop_examples05;

import java.util.Arrays;

public class MainDoc {
    public static void main(String[] args) throws CloneNotSupportedException {

        Ikili[]ikililer={
          new Ikili(2,3),
          new Ikili(4,5),
          new Ikili(6,7),
          new Ikili(8,9),
          new Ikili(3,4)
        };

        Ikili ikili1= (Ikili) ikililer[0].clone();
        ikili1.setX(3);
        System.out.println(ikili1);

      /*  System.out.println(Arrays.toString(ikililer));
        Arrays.sort(ikililer);
        System.out.println(Arrays.toString(ikililer));*/
    }
}
