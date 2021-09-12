package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

public class TagDuckDecorator extends hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck {
    public TagDuckDecorator(hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck duck) {
        super.setName(duck.getName() + " TugDuck");
    }
}
