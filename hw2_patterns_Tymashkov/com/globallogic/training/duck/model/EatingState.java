package hw2_patterns_Tymashkov.com.globallogic.training.duck.model;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class EatingState implements State {

    private final String textState = "Eating";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new StandingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Eat previous state should be Standing");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EatingState that = (EatingState) o;

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
