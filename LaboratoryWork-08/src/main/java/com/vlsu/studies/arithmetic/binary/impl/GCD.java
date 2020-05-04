package com.vlsu.studies.arithmetic.binary.impl;

import com.vlsu.studies.arithmetic.binary.interfaces.BinaryOperation;

public class GCD implements BinaryOperation<Long> {

    public Long calc(Long x, Long y)
    {
        while(y != 0 && x != 0)
        {
            x %= y;
            
            long temp = x;
            x = y;
            y = temp;
        }
        return Math.abs(x + y);
    }
}
