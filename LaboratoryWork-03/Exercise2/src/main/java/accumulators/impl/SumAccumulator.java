package accumulators.impl;

import accumulators.interfaces.IAccumulator;

public class SumAccumulator implements IAccumulator 
{
    public int fold(int[] arr)
    {
       int sum = 0;
       for(int i = 0; i < arr.length; ++i)
           sum += arr[i];
       
       return sum; 
    }
}
