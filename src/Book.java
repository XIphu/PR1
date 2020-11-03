import java.lang.*;

public class Book {
    private String name;
    private int pages;
    private int chapters;
    private int price;

    public Book(String n, int a, int b, int c) {
        name = n;
        pages = a;
        chapters = b;
        price = c;
    }
    public Book(String n) {
        name = n;
        pages = 0;
        chapters = 0;
        price = 0;
    }
    public Book() {
        name = "Info";
        pages = 0;
        chapters = 0;
        price = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setChapters(int chapters)  {
        this.chapters = chapters;
    }
    public void setPrice(int price)  {
        this.price = price;
    }
    public String getName(String name) {
        return name;
    }
    public String toString(){
        return this.name +  ", name " + this.name;
    }
    public void Summ() {
        System.out.println(name + " cost " + pages * chapters + " rub");
    }
}
