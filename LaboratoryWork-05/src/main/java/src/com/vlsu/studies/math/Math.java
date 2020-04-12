package com.vlsu.studies.math;

public class Math {

    public static boolean isPrimeNumber(long num)
    {
        if(num < 2) return false;
        else {
            for(int i = 2; i <= java.lang.Math.sqrt(num); ++i)
                if(num % i == 0)
                    return false;
            return true;
        }
    }
}
