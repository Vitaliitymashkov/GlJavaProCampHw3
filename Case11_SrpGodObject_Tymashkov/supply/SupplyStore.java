package Case11_SrpGodObject_Tymashkov.supply;

import java.util.HashMap;
import java.util.Map;

public class SupplyStore implements SupplyLoader, SupplyReporter, SupplyExploiter {
    private Map<String, Integer> supplies;

    public SupplyStore() {
        this.supplies = new HashMap<>();
    }

    public void loadSupplies(String type, int quantity) {
        System.out.println("----- Supply Action -----");
        System.out.printf("Loading %d units of %s in the supply hold.\n", quantity, type);

        if (supplies.containsKey(type)) {
            supplies.put(type, supplies.get(type) + quantity);
        } else {
            supplies.put(type, quantity);
        }
    }

    public void reportSupplies() {
        System.out.println("----- Supply Report -----");
        if (supplies.keySet().toArray().length != 0) {
            for (String type : supplies.keySet()) {
                System.out.printf("%s avalilable: %d unit(s)\n", type, supplies.get(type));
            }
        } else {
            System.out.println("Supply hold is empty.");
        }
    }

    public void exploitSupply(String type, int quantity) {
        System.out.println("----- Supply Action -----");
        if (supplies.containsKey(type) && supplies.get(type) > quantity) {
            System.out.printf("Using %d of %s from the supply hold.\n", quantity, type);
            supplies.put(type, supplies.get(type) - quantity);
        } else {
            System.out.printf("Supply Error: Insufficient %s in the supply hold.\n", type);
        }
    }
}
