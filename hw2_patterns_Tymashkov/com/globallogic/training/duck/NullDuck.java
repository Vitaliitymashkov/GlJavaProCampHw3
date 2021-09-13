package hw2_patterns_Tymashkov.com.globallogic.training.duck;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.model.Bird;

public class NullDuck implements Bird {

    public String toString() {
        return "NullDuck";
    }

    @Override
    public void makeSound() {
        return;
    }
}
