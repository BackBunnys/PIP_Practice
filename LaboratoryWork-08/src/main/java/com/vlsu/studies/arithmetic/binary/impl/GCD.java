package com.vlsu.studies.arithmetic.binary.impl;

import com.vlsu.studies.arithmetic.binary.interfaces.BinaryOperation;

public class GCD implements BinaryOperation {

    public int calc(int x, int y)
    {
        while(y != 0 && x != 0)
        {
            x %= y;
            
            int temp = x;
            x = y;
            y = temp;
        }
        return Math.abs(x + y);
    }
}
