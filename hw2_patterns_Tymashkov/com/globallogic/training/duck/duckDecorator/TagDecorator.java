package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

@FunctionalInterface
public interface TagDecorator {
    void actionTag(Duck duck);
}