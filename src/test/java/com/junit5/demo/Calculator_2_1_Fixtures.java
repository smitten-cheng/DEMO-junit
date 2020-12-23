package com.junit5.demo;

import com.unit.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *测试装置的使用
 */
public class Calculator_2_1_Fixtures {
    @BeforeAll
    public static void BeforeAll() {
        System.out.println("BeforeAll");
    }
    @AfterAll
    public static void AfterAll() {
        System.out.println("AfterAll");
    }
    @BeforeEach
    public void BeforeEach() {
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void AfterEach() {
        System.out.println("AfterEach");
    }
   @Test
   public void Method1() {
       System.out.println("Method1 执行！");
   }
    @Test
    public void Method2() {
        System.out.println("Method2 执行！");
    }
    @Test
    public void Method3() {
        System.out.println("Method3 执行！");
    }
}
