package hw2_patterns_Tymashkov.com.globallogic.training;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class ChainletDuckDecorator extends Duck implements IDuck {
    public ChainletDuckDecorator(Duck duck) {
        super.setName(duck.getName() + " ChainletDuck");
    }
}
