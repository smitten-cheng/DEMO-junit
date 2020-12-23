package com.junit5.demo;

import com.unit.Calculator;
import org.junit.jupiter.api.*;

/**
 *并发测试
 * 1、继承
 */
public class Calculator_3_1_parallel {
    @RepeatedTest(10)
    public  void countTest() throws InterruptedException {
        double result =Calculator.count(1);
        System.out.print(result);
    }
    @RepeatedTest(10)
    public  void SynCountTest() throws InterruptedException {
        double result =Calculator.SynCount(1);
        System.out.println(result);
    }
}
