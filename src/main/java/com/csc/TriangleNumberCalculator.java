package com.csc;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {
    public static int value(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return 1;
        } else {
            return n + value(n - 1);
        }
    }

    public static int add(int n, int m) {
        return value(n) + value(m);
    }

    public static int subtract(int n, int m) {
        return value(n) - value(m);
    } 

    public static int multiply(int n, int m) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } 
        if (m < 1) {
            throw new IllegalArgumentException();
        } 
        return value(n) * value(m);
    }

    public static List<Integer> sequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } 
        List<Integer> triangularNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            triangularNumbers.add(value(i));
        }
        return triangularNumbers;
    }

} 