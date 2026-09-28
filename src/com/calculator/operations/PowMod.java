package com.calculator.operations;

public final class PowMod {

    private PowMod() {
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a % b;
    }
}
