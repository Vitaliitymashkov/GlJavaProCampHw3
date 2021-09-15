package Case11_SrpGodObject_Tymashkov.domain;

import Case11_SrpGodObject_Tymashkov.domain.fuelTank.FuelTank;
import Case11_SrpGodObject_Tymashkov.domain.sersor.Sensor;
import Case11_SrpGodObject_Tymashkov.domain.supplyStore.SupplyStore;
import Case11_SrpGodObject_Tymashkov.domain.thruster.Thruster;

public class SpaceStation {

    private SupplyStore suppliesStore;
    private Thruster thruster;
    private FuelTank fuelTank;
    private Sensor sensor;

    public SpaceStation() {
    }

    public FuelTank accessFuelTank() {
        return fuelTank;
    }

    public Thruster accessThruster() {
        return thruster;
    }

    public SupplyStore accessSuppliesStore() {
        return suppliesStore;
    }

    public Sensor accessSensor() {
        return sensor;
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
        public Builder withSensor(Sensor sensor) {
            newSpaceStation.sensor = sensor;
            return this;
        }

        public SpaceStation build() {
            return this.newSpaceStation;
        }
    }
}
