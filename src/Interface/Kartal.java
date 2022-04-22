package Interface;

public class Kartal extends Hayvan implements Avci,Ucucu{
    @Override
    public void avlan() {
        System.out.println("Kartal avlanıyor");
    }

    @Override
    public void uc() {
        System.out.println("Kartal ucuyor.");
    }
}
