package carshop.impl;

import carshop.interfaces.*;
import carshop.cars.*;

public class MyOwnAutoShop implements IAdmin, ICustomer {
    private double income = 0;
    private Car[] cars;
    
    public MyOwnAutoShop()
    {
        cars = new Car[5];
        cars[0] = new Sedan(160, 600000, "Baklazhan", 400);
        cars[1] = new Ford(210, 1600000, "Black", 1990, 100000);
        cars[2] = new Ford(240, 2300000, "Red", 2000, 200000);
        cars[3] = new Truck(130, 4000000, "White", 5000000);
        cars[4] = new Truck(120, 3500000, "Gray", 7000000);
    }
    
    public double getIncome() { return income; }
    
    public double[] getCarsPrice()
    {
        double[] prices = new double[cars.length];
        for(int i = 0; i < prices.length; ++i)
            prices[i] = getCarPrice(i);
        
        return prices;
    }
    
    public String[] getCarsColor()
    {
        String[] colors = new String[cars.length];
        for(int i = 0; i < colors.length; ++i)
            colors[i] = getCarColor(i);
        
        return colors;        
    }
    
    public double getCarPrice(int id)
    {
        return (id >= 0 && id < cars.length)? cars[id].getSalePrice() : 0;
    }
    
    public String getCarColor(int id)
    {
        return (id >= 0 && id < cars.length)? cars[id].color : "Incorrect number";
    }
    
    public boolean purchaseCar(int id)
    {
        if(id >= 0 && id < cars.length)
            if(!cars[id].isSellOut) {
                income += cars[id].getSalePrice();
                cars[id].isSellOut = true;
                
                return true;
            }
        return false;
    }
}
