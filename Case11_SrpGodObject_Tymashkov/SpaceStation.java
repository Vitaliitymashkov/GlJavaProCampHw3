package Case11_SrpGodObject_Tymashkov;

import java.util.HashMap;
import java.util.Map;

public class SpaceStation {
    private int fuel;
    private Map<String, Integer> supplies;

    public SpaceStation() {
        this.fuel = 0;
        this.supplies = new HashMap<>();
    }
}
