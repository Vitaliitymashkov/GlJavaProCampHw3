package hw2_patterns_Tymashkov.com.globallogic.training;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class TagDuckDecorator extends Duck implements IDuck {
    public TagDuckDecorator(Duck duck) {
        super.setName(duck.getName() + " TugDuck");
    }
}
