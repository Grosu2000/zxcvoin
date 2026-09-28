package com.calculator.operations;

public final class AdvancedMath {

    private AdvancedMath() {
    }

    public static double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed");
        }
        return Math.sqrt(a);
    }
}
