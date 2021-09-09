package Case13_Dip_Tymashkov;

public class Stove implements Heating {
    public boolean on;

    @Override
    public void switchOn() {
        System.out.println("Switching on the stove's!");
        this.on = true;
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the stove!");
        this.on = false;
    }

    @Override
    public void bake(String item) {
        if (!this.on){
            System.out.println("Stove is not switched on.");
        }  else  {
            System.out.printf("Now baking %s!\n", item);
        }
    }
}
