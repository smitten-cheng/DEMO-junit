package com.junit5.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Evntest {
    @Test
      public void evntest(){
        assertEquals(1,3,"实际值与期望结果不符");
    }
}
