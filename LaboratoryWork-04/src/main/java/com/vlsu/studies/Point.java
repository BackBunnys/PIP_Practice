package com.vlsu.studies;

public class Point implements Comparable {
    public int x;
    public int y;
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Object o) throws ClassCastException
    {
        Point p = (Point)o;

        int deltaX = this.x - p.x;
        int deltaY = this.y - p.y;

        return (deltaX != 0)? deltaX : deltaY;
    }
    
    @Override
    public String toString()
    {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
}
