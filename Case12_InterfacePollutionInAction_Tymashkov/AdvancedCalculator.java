package com.globallogic.unified.eight.cases.case12;

public class AdvancedCalculator implements Calculator {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        return (double)num1 / (double)num2;
    }

    @Override
    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    @Override
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
