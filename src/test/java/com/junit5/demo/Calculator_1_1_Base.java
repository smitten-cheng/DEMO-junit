package com.junit5.demo;

import org.junit.jupiter.api.Test;

/**
 *基础脚本，分析执行了加减乘除和计数器操作，并打印了结果。
 *
 */
public class Calculator_1_1_Base {
    @Test
    public void addTest()
    {
        double result= com.unit.Calculator.add(1,2);
        System.out.println(result);
    }
    @Test
    public void subTest()
    {
        double result= com.unit.Calculator.subtract(1,2);
        System.out.println(result);
    }
    @Test
    public void mulTest()
    {
        double result= com.unit.Calculator.multiply(1,2);
        System.out.println(result);
    }
    @Test
    public void divTest()
    {
        double result= com.unit.Calculator.divide(1,2);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException {
        double result= com.unit.Calculator.count(1);
        result= com.unit.Calculator.count(1);
        System.out.println(result);
    }
}
