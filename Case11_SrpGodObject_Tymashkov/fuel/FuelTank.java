package Case11_SrpGodObject_Tymashkov.fuel;

public class FuelTank implements FuelLoader, FuelReporter {
    private int fuel;

    public FuelTank(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void loadFuel(int quantity){
        System.out.println("----- Fuel Action -----");
        System.out.printf("Loading %d units of fuel in the tank.\n", quantity);
        this.fuel += quantity;
    }

    public void reportFuel(){
        System.out.println("----- Fuel Report -----");
        System.out.printf("%d units of fuel available.\n", fuel);
    }

    public void consumeFuel(int consumeFuel) {
        fuel -= consumeFuel;
    }
}
