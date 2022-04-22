package Interface;

public class Balina extends Hayvan implements Yuzucu,Avci{
    @Override
    public void yuz() {
        System.out.println("Balina yüzüyor");
    }

    @Override
    public void avlan() {
        System.out.println("Balina avlanıyor");
    }
}
