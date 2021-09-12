package Case11_SrpGodObject_Tymashkov.domain;

import java.util.HashMap;
import java.util.Map;

import Case11_SrpGodObject_Tymashkov.fuel.FuelTank;
import Case11_SrpGodObject_Tymashkov.sensor.SensorRunner;
import Case11_SrpGodObject_Tymashkov.supply.SupplyStore;
import Case11_SrpGodObject_Tymashkov.thruster.Thruster;

public class SpaceStation implements SensorRunner {

    private SupplyStore suppliesStore;
    private Thruster thruster;
    private FuelTank fuelTank;

    public SpaceStation() {
    }

    public void runSensors() {
        System.out.println("----- Sensor Action -----");
        System.out.println("Running sensors!");
    }

    public FuelTank FuelTank() {
        return fuelTank;
    }

    public Thruster Thruster() {
        return thruster;
    }

    public SupplyStore SuppliesStore() {
        return suppliesStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final SpaceStation newSpaceStation;

        public Builder() {
            this.newSpaceStation = new SpaceStation();
        }

        public Builder withThruster(Thruster thruster) {
            newSpaceStation.thruster = thruster;
            return this;
        }

        public Builder withFuelTank(FuelTank fuelTank) {
            newSpaceStation.fuelTank = fuelTank;
            return this;
        }

        public Builder withSupplyStore(SupplyStore supplyStore) {
            newSpaceStation.suppliesStore = supplyStore;
            return this;
        }

        public SpaceStation build() {
            return this.newSpaceStation;
        }
    }
}
