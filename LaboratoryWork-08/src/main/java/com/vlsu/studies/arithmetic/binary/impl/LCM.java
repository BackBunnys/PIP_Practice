package com.vlsu.studies.arithmetic.binary.impl;

import com.vlsu.studies.arithmetic.binary.interfaces.BinaryOperation;

public class LCM implements BinaryOperation {

    public int Calc(int x, int y)
    {
        return (x * y) / (new GCD()).Calc(x, y);
    }

}
