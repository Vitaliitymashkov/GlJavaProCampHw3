package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.model.Duck;

public class TagDuckDecorator extends hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck implements Duck {
    public TagDuckDecorator(hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck duck) {
        super.setName(duck.getName() + " TugDuck");
    }
}
