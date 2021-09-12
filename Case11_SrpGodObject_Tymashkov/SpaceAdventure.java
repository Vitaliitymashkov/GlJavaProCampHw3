package Case11_SrpGodObject_Tymashkov;

import Case11_SrpGodObject_Tymashkov.domain.SpaceStation;
import Case11_SrpGodObject_Tymashkov.domain.SpaceStationBuilder;

public class SpaceAdventure {
    public void startSpaceAdventure(){
        SpaceStation spaceStation = SpaceStationBuilder.createSpaceStation();

        spaceStation.FuelTank().loadFuel(10);
        spaceStation.FuelTank().loadFuel(5);
        spaceStation.FuelTank().reportFuel();

        spaceStation.Thruster().activateThrusters(spaceStation);
        spaceStation.FuelTank().reportFuel(); //Results: Thrusting action successful.

        spaceStation.Thruster().activateThrusters(spaceStation);
        spaceStation.FuelTank().reportFuel(); //Results: Thruster Error: Insufficient fuel available.

        spaceStation.runSensors();

        spaceStation.SuppliesStore().loadSupplies("Test equipment", 1);
        spaceStation.SuppliesStore().loadSupplies("Safety equipment", 100);
        spaceStation.SuppliesStore().reportSupplies();
        spaceStation.SuppliesStore().exploitSupply("Safety equipment", 90); //Using 90 of Safety equipment from the supply hold.
        spaceStation.SuppliesStore().reportSupplies();
        spaceStation.SuppliesStore().exploitSupply("Safety equipment", 90); //Supply Error: Insufficient Safety equipment in the supply hold.
        spaceStation.SuppliesStore().reportSupplies();
    }
}
