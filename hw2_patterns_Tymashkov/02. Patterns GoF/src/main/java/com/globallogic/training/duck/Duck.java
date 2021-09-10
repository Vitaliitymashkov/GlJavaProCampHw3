package com.globallogic.training.duck;


import com.globallogic.training.duck.state.StandingState;
import com.globallogic.training.duck.state.State;

public class Duck implements Cloneable{
    private static long duckIdIncrement = 0;
    private long duckId;
    private int age;
    private String color;
    private String name;
    private double weight;
    private double wingsLength;

    private State state = new StandingState();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duck duck = (Duck) o;

        return duckId == duck.duckId;
    }

    @Override
    public int hashCode() {
        return (int) (duckId ^ (duckId >>> 32));
    }

    public Duck() {
        duckIdIncrement++;
        this.duckId = duckIdIncrement;
    }

    private Duck(long duckId) {
        this.duckId = duckId;
    }

    public Duck(Duck sourceDuck){
        this.duckId = sourceDuck.duckId;
        this.age = sourceDuck.age;
        this.color = sourceDuck.color;
        this.name = sourceDuck.name;
        this.weight = sourceDuck.weight;
        this.wingsLength = sourceDuck.wingsLength;
    }

    @Override
    public Duck clone() throws CloneNotSupportedException {
         return (Duck)super.clone();
    }

    @Override
    public String toString() {
        return "Duck " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", wingsLength=" + wingsLength +
                ", state=" + state;
    }
}
