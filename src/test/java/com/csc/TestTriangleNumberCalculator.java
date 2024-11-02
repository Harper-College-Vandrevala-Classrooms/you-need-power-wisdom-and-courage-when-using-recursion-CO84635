package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

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

    @Test
    public void testSequenceOne(){
        List<Integer> result1 = TriangleNumberCalculator.sequence(1);
        assertEquals(List.of(1), result1);
    }

    @Test
    public void testSequenceTwo(){
        List<Integer> result2 = TriangleNumberCalculator.sequence(2);
        assertEquals(List.of(1, 3), result2);
    }

    @Test
    public void testSequenceFive(){
        List<Integer> result5 = TriangleNumberCalculator.sequence(7);
        assertEquals(List.of(1, 3, 6, 10 ,15, 21 , 28 ), result5);
    }

    @Test
    public void testSequenceZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.sequence(0);
        });
    }
    
    @Test
    public void testSequenceNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.sequence(-1);
        });
    }

    @Test
    public void testSequenceThirty(){
        List<Integer> result30 = TriangleNumberCalculator.sequence(30);
        assertEquals(List.of(1, 3, 6, 10, 15, 21, 28, 36, 45, 55,
        66, 78, 91, 105, 120, 136, 153, 171, 190, 210,
        231, 253, 276, 300, 325, 351, 378, 406, 435, 465)
        , result30);
    }

    @Test
    public void testMultipliedOneAndTwo(){
        assertEquals(TriangleNumberCalculator.value(1) * TriangleNumberCalculator.value(2), TriangleNumberCalculator.multiply(1,2));
    }

    @Test
    public void testMultipliedThreeAndFour(){
        assertEquals(TriangleNumberCalculator.value(3) * TriangleNumberCalculator.value(4), TriangleNumberCalculator.multiply(3,4));
    }
    @Test
    public void testMultipliedFiveAndFive(){
        assertEquals(TriangleNumberCalculator.value(5) * TriangleNumberCalculator.value(5), TriangleNumberCalculator.multiply(5,5));
    }
    @Test
    public void testMultipliedOneHundredAndOneHundred(){
        assertEquals(TriangleNumberCalculator.value(100) * TriangleNumberCalculator.value(100), TriangleNumberCalculator.multiply(100,100));
    }
    @Test
    public void testMultipliedZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.multiply(0, 0);
        });
    }
    @Test
    public void testMultipliedZeroAndOne(){
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.multiply(0, 1);
        });
    }

    @Test
    public void testMultipliedOneAndZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleNumberCalculator.multiply(1, 0);
        });
    }

    @Test
    public void testValueLargeInput() {
        assertThrows(StackOverflowError.class, () -> {
        TriangleNumberCalculator.value(10000); //
        });
    }

    @Test
    public void testMultipliedOneAndOne() {
        assertEquals(TriangleNumberCalculator.value(1) * TriangleNumberCalculator.value(1), TriangleNumberCalculator.multiply(1,1));   
    }
}
