package Case12_InterfacePollutionInAction_Tymashkov;

public class AdvancedCalculator extends BasicCalculator implements Case12_InterfacePollutionInAction_Tymashkov.calculatorInterfaces.AdvancedCalculator {

    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
