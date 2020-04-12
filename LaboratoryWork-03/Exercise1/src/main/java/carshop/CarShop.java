package carshop;

import java.util.Scanner;
import java.util.Arrays;
import carshop.impl.MyOwnAutoShop;

public class CarShop {
    
   public static void main(String[] args)
   {
       MyOwnAutoShop shop = new MyOwnAutoShop();
       int inputingNumber = -1;
       Scanner console = new Scanner(System.in);
       System.out.println("Type: \n"
                   + "\t1 to show cars prices \n"
                   + "\t2 to show cars colors \n"
                   + "\t3 to show car price \n"
                   + "\t4 to show car color \n"
                   + "\t5 to show income \n"
                   + "\t6 to purchase car");
       do {
           inputingNumber = console.nextInt();
           switch(inputingNumber) {
                case 1: System.out.println(Arrays.toString(shop.getCarsPrice()));
                    break;
                case 2: System.out.println(Arrays.toString(shop.getCarsColor()));
                    break;
                case 3:
                    System.out.print("Type the car number: ");
                    System.out.println(shop.getCarPrice(console.nextInt()));
                    break;
                case 4:
                    System.out.print("Type the car number: ");
                    System.out.println(shop.getCarColor(console.nextInt()));
                    break;
                case 5:
                    System.out.println(shop.getIncome());
                    break;
                case 6:
                    System.out.print("Type the car number: ");
                    if(shop.purchaseCar(console.nextInt()))
                        System.out.println("Car was bought successfully.");
                    else
                        System.out.println("We don't have this car anymore.");
                    break;
                default: inputingNumber = 0;
                    break; 
           }
       } while(inputingNumber != 0);
   }
}
