package carshop.cars;

public abstract class Car {
    
    public Car(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.isSellOut = false;
    }
    
    public int speed;
    public boolean isSellOut;
    public double regularPrice;
    public String color;
    
    public abstract double getSalePrice();
}
