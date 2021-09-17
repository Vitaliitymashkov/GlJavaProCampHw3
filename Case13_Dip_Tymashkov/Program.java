package Case13_Dip_Tymashkov;

public class Program {
    public static void main(String[] args) {
        Restaurant bakery = new Restaurant("Bakery");

        Oven gasOven = new GasOven();
        bakery.cook(gasOven, "cookies");

        Oven electricOven = new ElectricOven();
        bakery.cook(electricOven, "cookies");
    }
}
