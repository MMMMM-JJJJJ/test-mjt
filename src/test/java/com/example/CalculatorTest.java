package com.example;

import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(1, 6));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 9));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-4, 2));

        // 测试除以0的异常情况
        try {
            calculator.divide(1, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Divider cannot be zero", e.getMessage());
        }
    }
}
