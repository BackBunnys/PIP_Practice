package com.vlsu.studies.arithmetic.binary.impl;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

public class GCDTest  {

    private GCD gcd = new GCD();

    @Test
    public void simpleTest()
    {
        assertEquals(new Long(5), gcd.calc(5L, 10L));
        assertEquals(new Long(1), gcd.calc(3L, 7L));
        assertEquals(new Long(1), gcd.calc(1L, 5L));
        assertEquals(new Long(20), gcd.calc(100L, 1520L));
        assertEquals(new Long(0), gcd.calc(0L, 0L));
        assertEquals(new Long(5), gcd.calc(5L, 5L));
        assertEquals(new Long(1), gcd.calc(26L, 3L));
    }

    @Test
    public void anotherAlgorithmTest() //Тестирование при помощи верного, но медленного алгоритма.
    {
        Random rand = new Random(System.currentTimeMillis());

        for(int i = 0; i < 10000; ++i) {
            Long x = Math.abs(rand.nextLong() % 1000); //Алгоритм делает полный перебор, поэтому не стоит на него
            Long y = Math.abs(rand.nextLong() % 1000); //наседать большими числами, а то Илон Макс на Марс слетать успеет. :(

            assertEquals(slowGCDAlgorithm(x, y), gcd.calc(x, y));
        }
    }

    @Test
    public void borderValuesTest()
    {
        assertEquals(new Long(Long.MAX_VALUE), gcd.calc(Long.MAX_VALUE, Long.MAX_VALUE)); //Не знаю зачем,
        assertEquals(new Long(Long.MIN_VALUE), gcd.calc(Long.MIN_VALUE, Long.MIN_VALUE)); //но пусть будет.
    }

    @Test
    public void negativeNumbersTest() //НОД ищется для целых чисел, т.е. для отрицательных в том числе.
    {
        Random rand = new Random(System.currentTimeMillis());

        for(int i = 0; i < 100; ++i) {
            Long x = Math.abs(rand.nextLong());
            Long y = Math.abs(rand.nextLong());

            Long result = gcd.calc(x, y); //При этом, очевидно, он будет равен НОДу от положительных чисел (наибольший ведь, так?).
            assertEquals("gcd(" + -x + ", " + y + ") must be equal gcd(" + x + ", " + y + ")!",
                         result, gcd.calc(-x, y));
            assertEquals("gcd(" + x + ", " + -y + ") must be equal gcd(" + x + ", " + y + ")!",
                         result, gcd.calc(x, -y));
            assertEquals("gcd(" + -x + ", " + -y + ") must be equal gcd(" + x + ", " + y + ")!",
                         result, gcd.calc(-x, -y));
        }
    }

    @Test
    public void zeroNumbersTest() //То же дело и с нулём. Ведь ноль - тоже целое число. :)
    {
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < 100; ++i) {                  //При этом, очевидно, НОД будет равен модулю другого числа,
            Long expected = Math.abs(rand.nextLong());  //т.к. ноль делится на что угодно без остатка.
            assertEquals("gcd(0, " + expected + ") must be equal " + expected + "!",
                          expected, gcd.calc(0L, expected));
            assertEquals("gcd(" + expected + ", 0) must be equal " + expected + "!",
                          expected, gcd.calc(expected, 0L));
            assertEquals("gcd(0, " + -expected + ") must be equal " + expected + "!",
                          expected, gcd.calc(0L, -expected));
            assertEquals("gcd(" + -expected + ", 0) must be equal " + expected + "!",
                          expected, gcd.calc(-expected, 0L));
        }
    }

    @Test
    public void stressTestN100000()
    {
        stressTest(100000);
    }

    @Test
    public void stressTestN1000000()
    {
        stressTest(1000000);
    }

    @Test
    public void stressTestN10000000()
    {
        stressTest(10000000);
    }

    private Long slowGCDAlgorithm(Long x, Long y) //Полный перебор делителей. Самый верный, но самый медленный :(
    {
        Long dividend = Math.abs(Long.min(x, y)); //Начинаем перебор с наименьшего. Общий делитель не может быть
        for(; dividend > 0; --dividend) {         //больше любого из чисел (типа оптимизация).
            if(x % dividend == 0 && y % dividend == 0)
                return dividend;
        }

        return Math.abs(Long.max(x, y)); //Случай, когда одно из чисел - 0.
    }

    private void stressTest(int N)
    {
        Random rand = new Random(System.currentTimeMillis());

        for(int i = 0; i < N; ++i) {
            gcd.calc(rand.nextLong(), rand.nextLong());
        }
    }
}
