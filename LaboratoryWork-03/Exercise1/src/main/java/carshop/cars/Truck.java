package carshop.cars;

public class Truck extends Car {
    int weight;
    
    public Truck(int speed, double regularPrice, String color,
                 int weight)
    {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
            
    
    public double getSalePrice()
    {
        return (weight > 2000)? regularPrice * 0.9: regularPrice;
    }
}
