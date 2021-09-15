package Case11_SrpGodObject_Tymashkov.domain.thruster;

import Case11_SrpGodObject_Tymashkov.domain.SpaceStation;
import Case11_SrpGodObject_Tymashkov.domain.ThrustersActivator;

public class Thruster implements ThrustersActivator {

    @Override
    public void activateThrusters(SpaceStation spaceStation){
        System.out.println("----- Thruster Action -----");
        if(spaceStation.accessFuelTank().getFuel() >= 10){
            System.out.println("Thrusting action successful.");
            spaceStation.accessFuelTank().consumeFuel(10);
        } else {
            System.out.println("Thruster Error: Insufficient fuel available.");
        }
    }
}
