package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.model.Duck;

public class ChainletDuckDecorator extends hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck implements Duck {
    public ChainletDuckDecorator(hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck duck) {
        super.setName(duck.getName() + " ChainletDuck");
    }
}
