package com.junit5.demo;

import com.unit.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *并发测试
 * 1、继承
 * 2、混合并发测试
 */
public class Calculator_3_2_Mixparallel {
    @RepeatedTest(10)
    public  void addTest()  {
        double result =Calculator.add(4,2);
        System.out.print(result);
        assertEquals(result,6,"期望错误");

    }
    @RepeatedTest(10)
    public  void subTest()  {
        double result =Calculator.subtract(4,2);
        System.out.print(result);
        assertEquals(result,2,"期望错误");
    }
}
