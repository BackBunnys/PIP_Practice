package carshop.cars;

public class Sedan extends Car{
    int length;
    
    public Sedan(int speed, double regularPrice, String color,
                 int length)
    {
        super(speed, regularPrice, color);
        this.length = length;
    }
    
    public double getSalePrice()
    {
        return (length > 20)? regularPrice * 0.95 : regularPrice;
    }
}
