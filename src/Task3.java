import java.lang.*;

public class Task3 {
    public static void main(String[] args) {
        Book d1 = new Book ("History", 105, 3,   0);
        Book d2 = new Book ("Voc-ry", 144, 8 ,0);
        Book d3 = new Book ("Methods");
        d3.setPages(200);
        d3.setChapters(8);
        System.out.println(d1);
        d1.Summ();
        d2.Summ();
        d3.Summ();
    }
}
