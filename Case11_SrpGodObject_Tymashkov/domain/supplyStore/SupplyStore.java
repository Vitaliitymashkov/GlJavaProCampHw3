package Case11_SrpGodObject_Tymashkov.domain.supplyStore;

import java.util.HashMap;
import java.util.Map;

import Case11_SrpGodObject_Tymashkov.domain.Reporter;
import Case11_SrpGodObject_Tymashkov.domain.SupplyExploiter;
import Case11_SrpGodObject_Tymashkov.domain.SupplyLoader;

public class SupplyStore implements SupplyLoader, Reporter, SupplyExploiter {
    private Map<String, Integer> supplies;

    public SupplyStore() {
        this.supplies = new HashMap<>();
    }

    @Override
    public void loadSupply(String type, int quantity) {
        System.out.println("----- Supply Action -----");
        System.out.printf("Loading %d units of %s in the supply hold.\n", quantity, type);

        if (supplies.containsKey(type)) {
            supplies.put(type, supplies.get(type) + quantity);
        } else {
            supplies.put(type, quantity);
        }
    }

    @Override
    public void report() {
        System.out.println("----- Supply Report -----");
        if (supplies.keySet().toArray().length != 0) {
            for (String type : supplies.keySet()) {
                System.out.printf("%s avalilable: %d unit(s)\n", type, supplies.get(type));
            }
        } else {
            System.out.println("Supply hold is empty.");
        }
    }

    @Override
    public void useSupply(String type, int quantity) {
        System.out.println("----- Supply Action -----");
        if (supplies.containsKey(type) && supplies.get(type) > quantity) {
            System.out.printf("Using %d of %s from the supply hold.\n", quantity, type);
            supplies.put(type, supplies.get(type) - quantity);
        } else {
            System.out.printf("Supply Error: Insufficient %s in the supply hold.\n", type);
        }
    }
}
