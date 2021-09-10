package com.globallogic.training.duck.builder;


import com.globallogic.training.duck.Duck;

public class DuckBuilder {
    private int age;
    private String color;
    private String name;
    private double weight;
    private double wingsLength;

    public DuckBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public DuckBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public DuckBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DuckBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public DuckBuilder setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
        return this;
    }

    public Duck build() {
        //duck set by rules
        Duck duck = new Duck();

        //Weight|WingsLength rule
        if(weight>0 && wingsLength>0) throw new IllegalArgumentException();
        else if(weight>0) {
            duck.setWeight(weight);
            duck.setWingsLength(weight/4);
        } else if(wingsLength>0) {
            duck.setWingsLength(wingsLength);
            duck.setWeight(wingsLength*4);
        }
        //Age|Color rule
        if(age>0 && color!=null) throw new IllegalArgumentException();
        else if(age>0) {
            duck.setAge(age);
            if(age<1) color = "yellow";
            else if(age>=1 && age<=5) color = "brown";
            else if(age>5 && age<=10) color = "gold";
            else if(age>10) color = "white";
            duck.setColor(color);
        } else if(color!=null && !color.equals("")) {
            duck.setColor(color);
            switch (color){
                case "yellow": age=0; break;
                case "brown": age=1; break;
                case "gold": age=6; break;
                case "white": age = 11; break;
            }
            duck.setAge(age);
        }

        duck.setName(name);
        return duck;
    }
}
