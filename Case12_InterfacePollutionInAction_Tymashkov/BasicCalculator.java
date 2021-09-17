package Case12_InterfacePollutionInAction_Tymashkov;

import Case12_InterfacePollutionInAction_Tymashkov.calculatorInterfaces.Calculator;

public class BasicCalculator implements Calculator {
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
        return (double) num1 / (double) num2;
    }
}
