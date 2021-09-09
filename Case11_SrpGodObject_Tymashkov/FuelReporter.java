package Case11_SrpGodObject_Tymashkov;

public class FuelReporter {
    private int fuel;

    public FuelReporter(int fuel) {
        this.fuel = fuel;
    }

    public void reportFuel(){
        System.out.println("----- Fuel Report -----");
        System.out.printf("%d units of fuel available.\n", fuel);
    }
}
