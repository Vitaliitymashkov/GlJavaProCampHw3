package Case11_SrpGodObject_Tymashkov;

public class FuelLoader {
    private int fuel;

    public FuelLoader(int fuel) {
        this.fuel = fuel;
    }

    public void loadFuel(int quantity){
        System.out.println("----- Fuel Action -----");
        System.out.printf("Loading %d units of fuel in the tank.\n", quantity);
        this.fuel += quantity;
    }
}
