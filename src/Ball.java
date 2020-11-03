import java.lang.*;
public class Ball {
    private String type;
    private int radius;
    private int price;

    public Ball(String n, int a, int b) {
        type = n;
        radius = a;
        price = b;
    }
    public Ball(String n) {
        type = n;
        radius = 0;
        price = 0;
    }
    public Ball() {
        type = "Beach ball";
        radius = 0;
        price = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setPrice(int price)  {
        this.price = price;
    }
    public String getType(String name) {
        return type;
    }
    public String toString(){
        return this.type +  ", type " + this.type;
    }
    public void radiusToPrice() {
        System.out.println(type + "'s price by the radius is " + radius * 2 + " dollars");
    }
}




