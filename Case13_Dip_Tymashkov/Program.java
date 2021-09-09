package Case13_Dip_Tymashkov;

public class Program {
    public static void main(String[] args) {
        Restaurant bakery = new Restaurant("Bakery");

        Heating heatingApplianceOven = new Oven();
        bakery.cook(heatingApplianceOven, "cookies");

        Heating heatingApplianceStove = new Stove();
        bakery.cook(heatingApplianceStove, "cookies");
    }
}
