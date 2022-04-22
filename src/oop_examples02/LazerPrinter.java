package oop_examples02;

public class LazerPrinter {
    private final int MAX_TONER_LEVEL=100;
    private final int MAX_PAPER_LEVEL=500;
    private int tonerSeviyesi;
    private int kagitAdedi;
    private boolean ciftYonluBaski;

    public LazerPrinter(int tonerSeviyesi, int kagitAdedi, boolean ciftYonluBaski) {
         addToner(tonerSeviyesi);
         addPaper(kagitAdedi);
        this.ciftYonluBaski = ciftYonluBaski;
    }

    public int addToner(int amount ) {

        if(amount>0 &&tonerSeviyesi+amount<=MAX_TONER_LEVEL){
            tonerSeviyesi += amount;
        }else if(tonerSeviyesi+amount>MAX_TONER_LEVEL){
            tonerSeviyesi=MAX_TONER_LEVEL;
        }
        return tonerSeviyesi;
    }

    public int addPaper(int amount) {
        if(amount>0&&kagitAdedi+amount<=MAX_PAPER_LEVEL){
            kagitAdedi+= amount;
        }else if(kagitAdedi+amount>MAX_PAPER_LEVEL){
            kagitAdedi=MAX_PAPER_LEVEL;
        }
    return kagitAdedi;
    }

    public int print(int sayfaAdedi){

        if(sayfaAdedi<=0) return 0;

        return ciftYonluBaski?sayfaAdedi/2+sayfaAdedi%2:sayfaAdedi;
    }
}
