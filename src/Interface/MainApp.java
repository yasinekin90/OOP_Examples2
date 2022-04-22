package Interface;



public class MainApp {
    public static void main(String[] args) {
/*Soyut sınıflar:Örnekleri olusturulamaz.Kalıtım yoluyla (extends)alt sınıf olusturulabilir.
   içerisinde gövdeli ve gövdesiz metotlar bulunabilir.
   Gövdesiz metotlar alt sınıfa ne yapması gerektiğini söyler ama nasıl yapması gerektiğini söylemez

 */
        /*
        Interface:Çok biçimliliği sağlamak için kullanılan sınıf benzeri yapılardır.
        Gövdeli metotları bulunmaz.Yani bütün metotlatı abstractır.
        Kendisini implemente(uygulayacak,gercekleştirecek) edecek alt sınıflara ne yapacaklarını bildiriyor
        ama nasıl yapacaklarına karısmıyor.
        */

        Hayvan hayvan1=new Hayvan("hayvan1",5,12.0);
        hayvan1.beslen();

        Kaplan kaplan1=new Kaplan();
        Aslan aslan=new Aslan();

       Koyun koyun=new Koyun();
       Kartal kartal=new Kartal();
       Balina balina=new Balina();

      Hayvan hayvan2=new Kaplan();
      Hayvan hayvan3=new Hayvan();


      Yuzucu yuzucu1=new Balina();
        ((Balina)yuzucu1).avlan();

     Yuzucu[]yuzuculer=new Yuzucu[3];
      yuzuculer[0]=new Balina();
      yuzuculer[1]=new Aslan();
      yuzuculer[2]=new Balina();

        for (Yuzucu yuzucu:yuzuculer) {
            yuzucu.yuz();
        }








    }
}
