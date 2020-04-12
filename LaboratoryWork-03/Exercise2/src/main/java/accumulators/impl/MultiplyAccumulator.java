package accumulators.impl;

import accumulators.interfaces.IAccumulator;

public class MultiplyAccumulator implements IAccumulator 
{
    public int fold(int[] arr)
    {
        int multiply = (arr.length > 0)? 1 : 0;
        for(int i = 0; i < arr.length; ++i)
            multiply *= arr[i];
        
        return multiply;
    }
}
