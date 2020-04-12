package Exercise2;

import java.util.Scanner;

import accumulators.interfaces.IAccumulator;
import accumulators.impl.*;

public class Exercise2 {
    
    public static void main(String[] args)
    {
        int n;
        
        Scanner console = new Scanner(System.in);
        System.out.print("Number of Array's elements: ");
        n = console.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("\tType array: ");
        for(int i = 0; i < arr.length; ++i)
            arr[i] = console.nextInt();
        
        IAccumulator accumulator;
        
        accumulator = new SumAccumulator();
        System.out.print("\nSum of Array's elements: " + accumulator.fold(arr));
        
        accumulator = new MultiplyAccumulator();
        System.out.print("\nMultiply of Array's elements: " + accumulator.fold(arr));
    }
    
}
