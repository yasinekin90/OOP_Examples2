package oop_examples01;

public class Book {
    private String name;
    private String author;
    private int pageNumber;

    public Book(String name, String author, int pageNumber) {
        this.name = name;
        this.author = author;
        setPageNumber(pageNumber);// Burada sayfa numarasını korumaya almış olduk
    }

    public Book() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if(pageNumber>0){
            this.pageNumber = pageNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
