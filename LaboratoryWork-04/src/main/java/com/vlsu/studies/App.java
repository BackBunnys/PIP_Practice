package com.vlsu.studies;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

import com.vlsu.studies.arithmetic.comparators.PointCustomComparator;
import com.vlsu.studies.arithmetic.binary.impl.LCM;

public class App 
{
    private Point read(Scanner sc)
    {
        int x, y;

        System.out.print("\tВведите x: ");
        x = sc.nextInt();

        System.out.print("\tВведите y: ");
        y = sc.nextInt();

        return new Point(x, y);
    }

    public void run()
    {
        Scanner console = new Scanner(System.in);

        int N;
        System.out.print("Введите кол-во точек: ");
        N = console.nextInt();

        ArrayList<Point> list = new ArrayList<Point>();
        for(int i = 0; i < N; ++i) {
            System.out.println("Точка " + (i + 1) + ":");
            list.add(read(console));
        }

        Collections.sort(list, new PointCustomComparator());

        Iterator it = list.iterator();
        LCM lcm = new LCM();
        for(Point p : list)
        {
            System.out.println(p.toString() + " - " + lcm.Calc(p.x, p.y));
        }
    }
    
    public static void main(String[] Args)
    {
        new App().run();
    }
}
