package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

    TriangleNumberCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new TriangleNumberCalculator();
    }

    @Test
    void itWorks() {
        assertEquals(true, true);
    }
    
    @Test
    public void testValueZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.value(0);
        });
    }

    @Test
    public void testValueNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.value(-1);
        });
    }

    @Test
    public void testValueOne() {
        assertEquals(1, TriangleNumberCalculator.value(1));
    }

    @Test
    public void testValueSeven() {
        assertEquals(28, TriangleNumberCalculator.value(7));
    }

    @Test
    public void testAddTriangleNumbers() {
        assertEquals(56, TriangleNumberCalculator.add(7, 7));
        assertEquals(42, TriangleNumberCalculator.add(8, 3));
    }

    @Test
    public void testSubtractTriangleNumbers() {
        assertEquals(35, TriangleNumberCalculator.subtract(9, 4));
        assertEquals(30, TriangleNumberCalculator.subtract(8, 3));
    }

    @Test
    public void testBasicScenario() {
        assertEquals(3, TriangleNumberCalculator.value(2));
    }

    @Test
    public void testValue() {
        assertEquals(1, TriangleNumberCalculator.value(1));
        assertEquals(3, TriangleNumberCalculator.value(2));
        assertEquals(6, TriangleNumberCalculator.value(3));
        assertEquals(10, TriangleNumberCalculator.value(4));
    }

    @Test
    public void testAdd() {
        assertEquals(2, TriangleNumberCalculator.add(1, 1));
        assertEquals(9, TriangleNumberCalculator.add(2, 3));
        assertEquals(13, TriangleNumberCalculator.add(4, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, TriangleNumberCalculator.subtract(1, 1));
        assertEquals(-3, TriangleNumberCalculator.subtract(2, 3));
        assertEquals(7, TriangleNumberCalculator.subtract(4, 2));
    }
}
