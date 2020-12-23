package com.junit5.demo;

import org.junit.jupiter.api.*;

/**
 *测试装置的使用
 * 1、继承
 */
public class Calculator_2_2_Fixtures_Extends extends Calculator_2_1_Fixtures{
    @BeforeAll
    public static void BeforeAll_1() {
        System.out.println("BeforeAll_1");
    }
    @AfterAll
    public static void AfterAll_1() {
        System.out.println("AfterAll_1");
    }
    @BeforeEach
    public void BeforeEach_1() {
        System.out.println("BeforeEach_1");
    }
    @AfterEach
    public void AfterEach_1() {
        System.out.println("AfterEach_1");
    }
   @Test
   public void Method1_1() {
       System.out.println("Method1_1 执行！");
   }
    @Test
    public void Method2_1() {
        System.out.println("Method2_1 执行！");
    }
    @Test
    public void Method3_1() { System.out.println("Method3_1 执行！");
    }
}
