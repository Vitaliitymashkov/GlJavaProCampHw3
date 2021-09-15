package Case13_Dip_Tymashkov;

public class ElectricOven implements Oven {
    public boolean on;

    @Override
    public void switchOn() {
        System.out.println("Switching electricity on!");
        this.on = true;
    }

    @Override
    public void switchOff() {
        System.out.println("Switching electricity off!");
        this.on = false;
    }

    @Override
    public void bake(String item) {
        if (!this.on){
            System.out.println("Oven is not switched on.");
        }  else  {
            System.out.printf("Now baking %s!\n", item);
        }
    }
}
