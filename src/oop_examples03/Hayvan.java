package oop_examples03;

public class Hayvan {
    private String isim;
    private int yas;
    private double agirlik;


    public Hayvan(String isim, int yas, double agirlik) {
        this.isim = isim;
        this.setYas(yas);
        this.setAgirlik(agirlik);
    }

    public Hayvan() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>0){
            this.yas = yas;
        }

    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        if(agirlik>0){
            this.agirlik = agirlik;
        }

    }

    public void beslen(){
        System.out.println(getIsim()+"  besleniyor.");
    }

    public void sesVer(){
        System.out.println(getIsim()+"  ses çıkartıyor");
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %5.2f",isim,yas,agirlik);
    }
}
