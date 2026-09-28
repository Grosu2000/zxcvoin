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
    public static double log(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number is not allowed");
        }
        return Math.log(a);
    }
}
