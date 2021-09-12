package hw2_patterns_Tymashkov.com.globallogic.training.duck.model;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class SleepingState implements State {

    private final String textState = "Sleeping";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new StandingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Sleep previous state should be Standing");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SleepingState that = (SleepingState) o;

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
