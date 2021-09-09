package Case11_SrpGodObject_Tymashkov;

import java.util.Map;

public class SupplyUse {
    private Map<String, Integer> supplies;

    public SupplyUse(Map<String, Integer> supplies) {
        this.supplies = supplies;
    }

    public void useSupplies(String type, int quantity){
        System.out.println("----- Supply Action -----");
        if(supplies.containsKey(type) && supplies.get(type)>quantity){
            System.out.printf("Using %d of %s from the supply hold.\n", quantity, type);
            supplies.put(type, supplies.get(type) - quantity);
        } else {
            System.out.printf("Supply Error: Insufficient %s in the supply hold.\n", type);
        }
    }
}
