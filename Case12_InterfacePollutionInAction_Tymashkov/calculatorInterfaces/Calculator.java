package Case12_InterfacePollutionInAction_Tymashkov.calculatorInterfaces;

public interface Calculator extends Add, Subtract, Multiply, Divide {
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int multiply(int num1, int num2);
    double divide(int num1, int num2);
}
