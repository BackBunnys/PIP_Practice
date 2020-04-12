package carshop.interfaces;

public interface ICustomer {
    double[] getCarsPrice();
    String[] getCarsColor();
    double getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);
}
