package com.csc;

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
}
