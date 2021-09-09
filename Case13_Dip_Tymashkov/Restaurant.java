package com.globallogic.unified.eight.cases.case13;

public class Restaurant {
    public String name;
    private Oven oven = new Oven();

    public Restaurant(String name){
        this.name = name;
        System.out.printf("Restaurant '%s' opened in your distict!\n", name);
    }

    public void cook(String item) {
        this.oven.lightGas();
        this.oven.bake(item);
        this.oven.extinguishGas();
    }
}
