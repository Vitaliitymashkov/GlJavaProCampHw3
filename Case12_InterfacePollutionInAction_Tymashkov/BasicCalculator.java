package Case12_InterfacePollutionInAction_Tymashkov;

public class BasicCalculator implements AddingCalculator, SubtractingCalculator, MultiplyingCalculator,
        DividingCalculator {

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

    public double power(double num, double power) {
        throw new NotSupportedException();
    }

    public double squareRoot(double num) {
        throw new NotSupportedException();
    }
}
