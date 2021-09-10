package hw2_patterns_Tymashkov.com.globallogic.training;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;
import hw2_patterns_Tymashkov.com.globallogic.training.duck.State;

public class SwimmingState implements State {

    private final String textState = "Swimmimg";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new FlyingState())
                || duck.getState().equals(new StandingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Swim previous state should be Flying or Standing");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SwimmingState that = (SwimmingState) o;

        return textState != null ? textState.equals(that.textState) : that.textState == null;
    }

    @Override
    public int hashCode() {
        return textState != null ? textState.hashCode() : 0;
    }

    @Override
    public String toString(){
        return this.textState;
    }
}
