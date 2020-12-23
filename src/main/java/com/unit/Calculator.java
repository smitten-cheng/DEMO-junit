package com.unit;

public class Calculator {
    public static double result=0,count=0;
    public  static double count(double x) throws InterruptedException {
        count+=x;
        Thread.sleep(2000);
        return count;
    }
    public synchronized static double SynCount(double x) throws InterruptedException {
        count+=x;
        Thread.sleep(2000);
        return count;
    }
    public static double add(double x,double y)
    {
        double result=x+y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static double subtract(double x,double y)
    {
        double result=x-y;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static double multiply(double x,double y)
    {
        result=x*y;
        return result;
    }
    public static double divide(double x,double y)
    {
        result=x/y;
        return result;
    }
    public static void clear()
    {
        result=0;
        System.out.println("累加已经清零");
    }
}
