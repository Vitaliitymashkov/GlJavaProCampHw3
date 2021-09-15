package Case11_SrpGodObject_Tymashkov.domain.fuelTank;

import Case11_SrpGodObject_Tymashkov.domain.Loader;
import Case11_SrpGodObject_Tymashkov.domain.Reporter;

public class FuelTank implements Loader, Reporter {
    private int fuel;

    public FuelTank(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void load(int quantity){
        System.out.println("----- Fuel Action -----");
        System.out.printf("Loading %d units of fuel in the tank.\n", quantity);
        this.fuel += quantity;
    }

    @Override
    public void report(){
        System.out.println("----- Fuel Report -----");
        System.out.printf("%d units of fuel available.\n", fuel);
    }

    public void consumeFuel(int consumeFuel) {
        fuel -= consumeFuel;
    }
}
