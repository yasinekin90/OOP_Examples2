package oop_examples05;
// - Ikili isminde bir sınıf tasarlayınız.
// - x ve y isminde iki adet int üyesi olmalı
// - getter/setter ve constructor'ları tanımlanmalı
// - toString metodu uygun şekilde override edilmeli
// - Comparable interface'ini implemente etmeli
// - Sıralamayı iki değerin ortalamasına göre yapmalı. (x+y)/2 tam sayı bölme hatasına dikkat
// - main metodu içinde {} ile 5 elemanlı bir dizi (Ikili tipinden) oluşturulacak.
// - Arrays.toString ile yazdırılacak
// - Arrays.sort ile sıralanacak
// - Tekrar yazdırılacak.

public class Ikili implements Comparable <Ikili>,Cloneable {
    private int x;
    private int y;

    public Ikili(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ikili() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public int compareTo(Ikili o) {
        double ort1=(x+y)/2.0;
        double oOrt=(o.getX()+o.getY())/2.0;

        return ort1<oOrt?-1:ort1==oOrt?0:1;
    }

    @Override
    public String toString() {
        return "["+getX()+","+getY()+"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Ikili i=new Ikili(x,y);
        return i;//ya da new Ikili(x,y); yi direk return edebilirdik
    }
}
