package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class TagDuckDecorator extends Duck implements TagDecorator {

    public TagDuckDecorator(Duck duck) {
        actionTag(duck);
    }

    @Override
    public void actionTag(Duck duck) {
        super.setName(duck.getName() + " of TagDuck");
    }
}
