package oop_examples04;

public class Kitap implements Comparable {
    private String adi;
    private String yazar;
    private int sayfaAdedi;

    public Kitap(String adi, String yazar, int sayfaAdedi) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaAdedi = sayfaAdedi;
    }

    public Kitap() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        this.sayfaAdedi = sayfaAdedi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazar='" + yazar + '\'' +
                ", sayfaAdedi=" + sayfaAdedi +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        Kitap k=(Kitap)o;
      //  getSayfaAdedi()<k.getSayfaAdedi()?-1:getSayfaAdedi()== k.getSayfaAdedi()?0:1; sayfa sayısına göre sıralama
        return getAdi().compareTo(k.getAdi());
    }
}

