package Case11_SrpGodObject_Tymashkov;

import Case11_SrpGodObject_Tymashkov.domain.SpaceStation;
import Case11_SrpGodObject_Tymashkov.domain.builder.SpaceStationBuilder;

public class SpaceAdventure {
    public void startSpaceAdventure(){
        SpaceStation spaceStation = SpaceStationBuilder.createSpaceStation();

        spaceStation.accessFuelTank().load(10);
        spaceStation.accessFuelTank().load(5);
        spaceStation.accessFuelTank().report();

        spaceStation.accessThruster().activateThrusters(spaceStation);
        spaceStation.accessFuelTank().report(); //Results: Thrusting action successful.

        spaceStation.accessThruster().activateThrusters(spaceStation);
        spaceStation.accessFuelTank().report(); //Results: Thruster Error: Insufficient fuel available.

        spaceStation.accessSensor().runSensors();

        spaceStation.accessSuppliesStore().loadSupply("Test equipment", 1);
        spaceStation.accessSuppliesStore().loadSupply("Safety equipment", 100);
        spaceStation.accessSuppliesStore().report();
        spaceStation.accessSuppliesStore().useSupply("Safety equipment", 90); //Using 90 of Safety equipment from the supply hold.
        spaceStation.accessSuppliesStore().report();
        spaceStation.accessSuppliesStore().useSupply("Safety equipment", 90); //Supply Error: Insufficient Safety equipment in the supply hold.
        spaceStation.accessSuppliesStore().report();
    }
}
