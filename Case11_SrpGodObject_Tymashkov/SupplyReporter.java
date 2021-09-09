package Case11_SrpGodObject_Tymashkov;

import java.util.Map;

public class SupplyReporter {
    private Map<String, Integer> supplies;

    public SupplyReporter(Map<String, Integer> supplies) {
        this.supplies = supplies;
    }

    public void reportSupplies(){
        System.out.println("----- Supply Report -----");
        if(supplies.keySet().toArray().length!=0){
            for (String type : supplies.keySet() ) {
                System.out.printf("%s avalilable: %d unit(s)\n", type, supplies.get(type));
            }
        } else {
            System.out.println("Supply hold is empty.");
        }
    }
}
