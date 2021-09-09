package Case11_SrpGodObject_Tymashkov;

import java.util.Map;

public class SupplyLoader {
    private Map<String, Integer> supplies;

    public SupplyLoader(Map<String, Integer> supplies) {
        this.supplies = supplies;
    }

    public void loadSupplies(String type, int quantity){
        System.out.println("----- Supply Action -----");
        System.out.printf("Loading %d units of %s in the supply hold.\n", quantity, type);

        if (supplies.containsKey(type)){
            supplies.put(type, supplies.get(type) + quantity);
        } else {
            supplies.put(type, quantity);
        }
    }
}
