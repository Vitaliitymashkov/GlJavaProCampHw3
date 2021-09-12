package Case13_Dip_Tymashkov;

public class GasOven implements Oven {
    public boolean on;

    @Override
    public void switchOn() {
        System.out.println("Lighting the oven's gas!");
        this.on = true;
    }

    @Override
    public void switchOff() {
        System.out.println("Extinguishing the ovens gas!");
        this.on = false;
    }

    @Override
    public void bake(String item) {
        if (!this.on){
            System.out.println("Oven's gas is not turned on.");
        }  else {
            System.out.printf("Now baking %s!\n", item);
        }
    }
}
