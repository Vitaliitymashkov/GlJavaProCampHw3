package hw2_patterns_Tymashkov.com.globallogic.training.duck.duckDecorator;

public class ChainletDuckDecorator extends hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck {
    public ChainletDuckDecorator(hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck duck) {
        super.setName(duck.getName() + " ChainletDuck");
    }
}
