package Case11_SrpGodObject_Tymashkov.domain;

import Case11_SrpGodObject_Tymashkov.fuel.FuelTank;
import Case11_SrpGodObject_Tymashkov.supply.SupplyStore;
import Case11_SrpGodObject_Tymashkov.thruster.Thruster;

public class SpaceStationBuilder {
    public static SpaceStation createSpaceStation() {
        return SpaceStation.builder()
                .withFuelTank(new FuelTank(0))
                .withThruster(new Thruster())
                .withSupplyStore(new SupplyStore())
                .build();
    }
}