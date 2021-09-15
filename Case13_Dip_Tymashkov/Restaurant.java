package Case13_Dip_Tymashkov;

public class Restaurant {
    private String name;

    public Restaurant(String name){
        this.name = name;
        System.out.printf("Restaurant '%s' opened in your district!\n", name);
    }

    public void cook(Oven OvenAppliance, String item) {
        OvenAppliance.switchOn();
        OvenAppliance.bake(item);
        OvenAppliance.switchOff();
    }
}
