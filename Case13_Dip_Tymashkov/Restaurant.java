package Case13_Dip_Tymashkov;

public class Restaurant {
    private String name;

    public Restaurant(String name){
        this.name = name;
        System.out.printf("Restaurant '%s' opened in your district!\n", name);
    }

    public void cook(Heating heatingAppliance, String item) {
        heatingAppliance.switchOn();
        heatingAppliance.bake(item);
        heatingAppliance.switchOff();
    }
}
