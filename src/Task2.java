import java.lang.*;

public class Task2 {
    public static void main(String[] args) {
        Ball d1 = new Ball ("Beach ball", 15, 0);
        Ball d2 = new Ball ("Asphalt Ball", 14 ,0);
        Ball d3 = new Ball ("Table ball");
        d3.setRadius(4);
        System.out.println(d1);
        d1.radiusToPrice();
        d2.radiusToPrice();
        d3.radiusToPrice();
    }
}