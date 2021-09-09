package Case11_SrpGodObject_Tymashkov;

public class ThrustersActivator {
    private int fuel;

    public ThrustersActivator(int fuel) {
        this.fuel = fuel;
    }

    public void activateThrusters(){
        System.out.println("----- Thruster Action -----");
        if(fuel >= 10){
            System.out.println("Thrusting action successful.");
            this.fuel -= 10;
        } else {
            System.out.println("Thruster Error: Insufficient fuel available.");
        }
    }
}
