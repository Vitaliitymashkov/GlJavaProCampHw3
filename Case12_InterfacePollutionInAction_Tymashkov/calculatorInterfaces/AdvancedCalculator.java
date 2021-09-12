package Case12_InterfacePollutionInAction_Tymashkov.calculatorInterfaces;

public interface AdvancedCalculator extends Calculator, Power, Squareroot {
    double power(double num, double power);
    double squareRoot(double num);
}
