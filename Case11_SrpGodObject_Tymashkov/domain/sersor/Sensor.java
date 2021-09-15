package Case11_SrpGodObject_Tymashkov.domain.sersor;

import Case11_SrpGodObject_Tymashkov.domain.SensorRunner;

public class Sensor implements SensorRunner {

    @Override
    public void runSensors() {
        System.out.println("----- Sensor Action -----");
        System.out.println("Running sensors!");
    }
}
