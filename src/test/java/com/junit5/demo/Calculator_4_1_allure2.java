package com.junit5.demo;

import com.unit.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *基础脚本，分析执行了加减乘除和计数器操作，并打印了结果。
 * 1、进行了优化：添加自动断言，解决了需要人工检查结果的问题。
 * 2、进行了优化：实用junit5提供的assertAll，增加了脚本的容错性。
 */
@Epic("Epoc 计算器项目")
@Feature("Feature 冒烟测试用例")
public class Calculator_4_1_allure2 {
    @Test
    @Description("Description--")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("https://blog.csdn.net/abcnull/article/details/106609727")
    @Link(name="社区帖",type="mylink",url="https://ceshiren.com/t/topic/7718/41")
    public void addTest()
    {
        double result1= Calculator.add(1,2);
        System.out.println(result1);
        double result2= Calculator.add(3,2);
        System.out.println(result2);
        double result3= Calculator.add(6,2);
        System.out.println(result3);
        //添加附件，可以截取bug图片
        Allure.addAttachment("pic","image/png",this.getClass().getResourceAsStream("/发票4的副本 6.png"),".png");
        assertAll("计算结果校验为：",
                ()-> assertEquals(3,result1,"期望结果和实际结果不符"),
                ()-> assertEquals(3,result2,"期望结果和实际结果不符"),
                ()-> assertEquals(8,result3,"期望结果和实际结果不符")
                );

    }
    @Test
    public void subTest()
    {
        double result= Calculator.subtract(1,2);
        System.out.println(result);
        assertEquals(-1,result,"期望结果和实际结果不符");
    }
    @Test
    public void mulTest()
    {
        double result= Calculator.multiply(1,2);
        System.out.println(result);
        assertEquals(2,result,"期望结果和实际结果不符");
    }
    @Test
    public void divTest()
    {
        double result= Calculator.divide(1,2);
        System.out.println(result);
        assertEquals(0.5,result,"期望结果和实际结果不符");
    }
    @Test
    public void countTest() throws InterruptedException {
        double result= Calculator.count(1);
        result= Calculator.count(1);
        result= Calculator.count(1);
        System.out.println(result);
        assertEquals(3,result,"期望结果和实际结果不符");
    }
}
