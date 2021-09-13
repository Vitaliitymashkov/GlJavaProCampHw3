package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class ChainletDuckDecorator extends Duck implements ChainletDecorator{

    public ChainletDuckDecorator(Duck duck) {
        actionChainlet(duck);
    }

    @Override
    public void actionChainlet(Duck duck) {
        super.setName(duck.getName() + " of ChainletDuck");
    }
}
