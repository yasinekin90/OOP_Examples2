package oop_examples01;

public class Program {
    public static void main(String[] args) {
        //Encapsulation:Kodlarımızı ve verilerimizi koruma altına almak için kullanılır
        /*
        * public:visible to the whole world
        * protected:kendi paket (package) ve kendisinin alt sınıflarından
        * private:sadece kendi sınıfının içinden erişilebilir
        * (default):aynı paket içerisinden erişilebilir
         */
       Book b1=new Book();
         b1.setName("Kaşağı");
        b1.setAuthor("Ömer Seyfettin");
         b1.setPageNumber(-300);
        System.out.println(b1.getPageNumber());

    }
}
