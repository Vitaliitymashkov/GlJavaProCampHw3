package Case11_SrpGodObject_Tymashkov.domain.builder;

import Case11_SrpGodObject_Tymashkov.domain.SpaceStation;
import Case11_SrpGodObject_Tymashkov.domain.fuelTank.FuelTank;
import Case11_SrpGodObject_Tymashkov.domain.sersor.Sensor;
import Case11_SrpGodObject_Tymashkov.domain.supplyStore.SupplyStore;
import Case11_SrpGodObject_Tymashkov.domain.thruster.Thruster;

public class SpaceStationBuilder {
    public static SpaceStation createSpaceStation() {
        return SpaceStation.builder()
                .withFuelTank(new FuelTank(0))
                .withThruster(new Thruster())
                .withSupplyStore(new SupplyStore())
                .withSensor(new Sensor())
                .build();
    }
}