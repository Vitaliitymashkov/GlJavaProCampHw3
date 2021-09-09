package com.globallogic.unified.eight.cases.case13;

public class Oven {
    public boolean on;

    public void lightGas() {
        System.out.println("Lighting the oven's gas!");
        this.on = true;
    }

    public void extinguishGas() {
        System.out.println("Extinguishing the ovens gas!");
        this.on = false;
    }

    public void bake(String item) {
        if (!this.on){
            System.out.println("Oven's gas is not turned on.");
        }  else  {
            System.out.printf("Now baking %s!\n", item);
        }
    }
}
