package com.junit5.demo;

import com.unit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *基础脚本，分析执行了加减乘除和计数器操作，并打印了结果。
 * 1、进行了优化：添加自动断言，解决了需要人工检查结果的问题。
 */
public class Calculator_1_2_Assert {
    @Test
    public void addTest()
    {
        double result= com.unit.Calculator.add(1,2);
        System.out.println(result);
        assertEquals(3,result,"期望结果和实际结果不符");
    }
    @Test
    public void subTest()
    {
        double result= com.unit.Calculator.subtract(1,2);
        System.out.println(result);
        assertEquals(-1,result,"期望结果和实际结果不符");
    }
    @Test
    public void mulTest()
    {
        double result= com.unit.Calculator.multiply(1,2);
        System.out.println(result);
        assertEquals(2,result,"期望结果和实际结果不符");
    }
    @Test
    public void divTest()
    {
        double result= com.unit.Calculator.divide(1,2);
        System.out.println(result);
        assertEquals(0.5,result,"期望结果和实际结果不符");
    }
    @Test
    public void countTest() throws InterruptedException {
        double result= com.unit.Calculator.count(1);
        result= Calculator.count(1);
        result= Calculator.count(1);
        System.out.println(result);
        assertEquals(3,result,"期望结果和实际结果不符");
    }
}
