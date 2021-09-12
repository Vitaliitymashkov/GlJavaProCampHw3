package hw2_patterns_Tymashkov.com.globallogic.training.duck.model;

import hw2_patterns_Tymashkov.com.globallogic.training.duck.Duck;

public class StandingState implements State {

    private final String textState = "Standing";

    @Override
    public void doAction(Duck duck) {
        if (duck.getState().equals(new SwimmingState())
                || duck.getState().equals(new WalkingState())
                || duck.getState().equals(new SleepingState())
                || duck.getState().equals(new EatingState())) {
            duck.setState(this);
        } else {
            throw new IllegalStateException("To Stand previous state should be Swimming or Walking or Sleeping or Eating");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StandingState that = (StandingState) o;

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
