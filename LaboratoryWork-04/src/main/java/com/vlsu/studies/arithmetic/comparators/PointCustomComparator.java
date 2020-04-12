package com.vlsu.studies.arithmetic.comparators;

import java.util.Comparator;
import com.vlsu.studies.arithmetic.binary.impl.LCM;
import com.vlsu.studies.Point;

public class PointCustomComparator implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) throws ClassCastException
    {
        Point p1 = (Point)o1;
        Point p2 = (Point)o2;
            
        LCM lcm = new LCM();
            
        int p1_LCM = lcm.Calc(p1.x, p1.y);
        int p2_LCM = lcm.Calc(p2.x, p2.y);

        int deltaLCM = p1_LCM - p2_LCM;

        return (deltaLCM != 0) ? deltaLCM : p1.compareTo(p2);
    }
}
