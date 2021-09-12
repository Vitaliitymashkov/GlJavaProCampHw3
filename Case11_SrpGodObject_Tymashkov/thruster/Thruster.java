package Case11_SrpGodObject_Tymashkov.thruster;

import Case11_SrpGodObject_Tymashkov.domain.SpaceStation;

public class Thruster implements ThrustersActivator{

    @Override
    public void activateThrusters(SpaceStation spaceStation){
        System.out.println("----- Thruster Action -----");
        if(spaceStation.FuelTank().getFuel() >= 10){
            System.out.println("Thrusting action successful.");
            spaceStation.FuelTank().consumeFuel(10);
        } else {
            System.out.println("Thruster Error: Insufficient fuel available.");
        }
    }
}
