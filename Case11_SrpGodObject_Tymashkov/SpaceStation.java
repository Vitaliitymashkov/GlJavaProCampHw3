package com.globallogic.unified.eight.cases.case11;

import java.util.HashMap;
import java.util.Map;

public class SpaceStation {
    private int fuel;
    private Map<String, Integer> supplies;

    public SpaceStation() {
        this.fuel = 0;
        this.supplies = new HashMap<>();
    }

    public void runSensors(){
        System.out.println("----- Sensor Action -----");
        System.out.println("Running sensors!");
    }

    public void loadSupplies(String type, int quantity){
        System.out.println("----- Supply Action -----");
        System.out.printf("Loading %d units of %s in the supply hold.\n", quantity, type);

        if (supplies.containsKey(type)){
            supplies.put(type, supplies.get(type) + quantity);
        } else {
            supplies.put(type, quantity);
        }
    }

    public void useSupplies(String type, int quantity){
        System.out.println("----- Supply Action -----");
        if(supplies.containsKey(type) && supplies.get(type)>quantity){
            System.out.printf("Using %d of %s from the supply hold.\n", quantity, type);
            supplies.put(type, supplies.get(type) - quantity);
        } else {
            System.out.printf("Supply Error: Insufficient %s in the supply hold.\n", type);
        }
    }

    public void reportSupplies(){
        System.out.println("----- Supply Report -----");
        if(supplies.keySet().toArray().length!=0){
            for (String type : supplies.keySet() ) {
                System.out.printf("%s avalilable: %d unit(s)\n", type, supplies.get(type));
            }
        } else {
            System.out.println("Supply hold is empty.");
        }
    }

    public void loadFuel(int quantity){
        System.out.println("----- Fuel Action -----");
        System.out.printf("Loading %d units of fuel in the tank.\n", quantity);
        this.fuel += quantity;
    }

    public void reportFuel(){
        System.out.println("----- Fuel Report -----");
        System.out.printf("%d units of fuel available.\n", fuel);
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
